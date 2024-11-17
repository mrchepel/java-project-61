package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    private static final String GAME_DESCRIPTION = "Find the greatest common divisor of given numbers.";
    private static final int MIN = 1;
    private static final int MAX = 100;

    private static int calculateGCD(int x, int y) {
        if (y == 0) {
            return x;
        } else {
            return calculateGCD(y, x % y);
        }
    }

    private static String[][] generateData() {
        String[][] gameData = new String[Engine.NUMBER_OF_ROUNDS][2];
        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            int x = Utils.getRandomNumber(MIN, MAX);
            int y = Utils.getRandomNumber(MIN, MAX);
            String question = x + " " + y;
            gameData[i][0] = question;
            gameData[i][1] = String.valueOf(calculateGCD(x, y));
        }
        return gameData;
    }

    public static void runGame() {
        Engine.makeGame(GAME_DESCRIPTION, generateData());
    }
}
