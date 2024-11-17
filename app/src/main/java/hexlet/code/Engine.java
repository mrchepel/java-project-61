package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int NUMBER_OF_ROUNDS = 3;

    public static void makeGame(String gameDescription, String[][] gameData) {
        System.out.println("Welcome to the Brain Games!");
        Scanner sc = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String userName = sc.next();
        System.out.printf("Hello, %s!\n", userName);
        System.out.println(gameDescription);

        for (String[] round : gameData) {
            String question = round[0];
            String correctAnswer = round[1];

            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String userAnswer = sc.next();
            if (userAnswer.equals(correctAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.\n",
                        userAnswer, correctAnswer);
                System.out.printf("Let's try again, %s!\n", userName);
                return;
            }
        }
        System.out.printf("Congratulations, %s!\n", userName);
        sc.close();
    }
}
