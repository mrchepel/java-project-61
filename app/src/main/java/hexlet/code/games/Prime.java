package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    private static final String GAME_DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final int MIN = 1;
    private static final int MAX = 100;

    private static String[][] generateData() {
        String[][] roundsData = new String[Engine.NUMBER_OF_ROUNDS][2];
        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            int question = Utils.getRandomNumber(MIN, MAX);
            String answer = isPrime(question) ? "yes" : "no";
            roundsData[i][0] = String.valueOf(question);
            roundsData[i][1] = answer;
        }
        return roundsData;
    }

    private static boolean isPrime(int number) {
        for (int i = 2; i < number / 2 + 1; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void runGame() {
        Engine.makeGame(GAME_DESCRIPTION, generateData());
    }

}
