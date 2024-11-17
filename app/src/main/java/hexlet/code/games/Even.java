package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    private static final String GAME_DESCRIPTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static final int MIN = 0;
    private static final int MAX = 100;

    private static String[][] getQuestionAnswer() {
        String[][] gameData = new String[Engine.NUMBER_OF_ROUNDS][2];
        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            int question = Utils.getRandomNumber(MIN, MAX);
            String answer = isEven(question) ? "yes" : "no";
            gameData[i][0] = String.valueOf(question);
            gameData[i][1] = answer;
        }
        return gameData;
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void runGame() {
        Engine.makeGame(GAME_DESCRIPTION, getQuestionAnswer());
    }
}
