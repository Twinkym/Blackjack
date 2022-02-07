import java.util.Scanner;

public class Blackjack {

    private static final String[] AS = {"1"};
    private static final String[] FIGURAS = {"J", "Q", "K"};
    private static final String[] CARTAS = { "2", "3", "4", "5", "6", "7", "8", "9", "10"};

    private static final int OBTENERCARTA = 1;
    private static final int SALIRDELASALA = 2;
    private static final int BLACKJACK = 21;
    private static final String WIN = "Enhorabona has obtingut 21. ";

    public static void main(String[] args) {
        int option = welcomeToGame();
        validateStart(option);
        int carta = startGame();

        exitGame();


    }

    private static void exitGame() {
        System.out.println("Gracies per la seva visita. ");
    }

    private static int startGame() {


        return 0;
    }

    private static void validateStart(int option) {
        if (option == OBTENERCARTA ){
            startGame();
        }
        else {
            exitGame();
        }
        return;
    }


    private static int welcomeToGame() {
        System.out.println("Benvingut, al blackjack vols una carta? ");
        System.out.println("1. Obtener carta. ");
        System.out.println("2. No, salir de la sala. ");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();

    }
}
