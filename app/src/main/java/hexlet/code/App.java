package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;

import java.util.Scanner;

public class App {
    private static final int GREET = 1;
    private static final int EVEN_GAME = 2;
    private static final int CALC_GAME = 3;
    private static final int EXIT = 0;

    public static void main(String[] args) {
        System.out.println("Welcome to the Brain Games!");
        Scanner sc = new Scanner(System.in);
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        int selectedGame = sc.nextInt();
        switch (selectedGame) {
            case GREET:
                Greet.greet();
                break;
            case EVEN_GAME:
                Even.runGame();
                break;
            case CALC_GAME:
                Calc.runGame();
                break;
            case EXIT:
                System.exit(0);
            default:
                System.out.println("Incorrect input, try again!");
        }
        sc.close();
    }
}
