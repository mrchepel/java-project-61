package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    private static final String GAME_DESCRIPTION = "What number is missing in the progression?";
    private static final int LENGTH_PROGRESSION = 10;
    private static final int STEP_MIN = 1;
    private static final int STEP_MAX = 10;
    private static final int FIRST_NUM_MIN = 1;
    private static final int FIRST_NUM_MAX = 100;
    private static final int HIDDEN_MIN = 0;
    private static final int HIDDEN_MAX = LENGTH_PROGRESSION - 1;

    private static String[] generateProgression(int firstNumber, int step, int length) {
        String[] progression = new String[length];
        for (int i = 0; i < length; i++) {
            progression[i] = Integer.toString(firstNumber + i * step);
        }
        return progression;
    }

    private static String[][] generateData() {
        String[][] gameData = new String[Engine.NUMBER_OF_ROUNDS][2];
        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            int firstNumber = Utils.getRandomNumber(FIRST_NUM_MIN, FIRST_NUM_MAX);
            int step = Utils.getRandomNumber(STEP_MIN, STEP_MAX);
            String[] progression = generateProgression(firstNumber, step, LENGTH_PROGRESSION);
            int hiddenPosition = Utils.getRandomNumber(HIDDEN_MIN, HIDDEN_MAX);
            String answer = progression[hiddenPosition];
            progression[hiddenPosition] = "..";
            String question = String.join(" ", progression);
            gameData[i][0] = question;
            gameData[i][1] = answer;
        }
        return gameData;
    }

    public static void runGame() {
        Engine.makeGame(GAME_DESCRIPTION, generateData());
    }
}
