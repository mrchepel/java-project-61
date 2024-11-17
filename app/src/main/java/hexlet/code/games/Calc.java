package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    private static final String GAME_DESCRIPTION = "What is the result of the expression?";
    private static final int MIN = 0;
    private static final int MAX = 100;

    private static int calculate(int x, int y, char operator) {
        switch (operator) {
            case '+':
                return x + y;
            case '-':
                return x - y;
            case '*':
                return x * y;
            default:
                return 0;
        }
    }

    private static char getRandomOperator() {
        char[] operators = {'+', '-', '*'};
        int lenght = operators.length;
        return operators[Utils.getRandomNumber(0, lenght - 1)];
    }

    private static String[][] generateData() {
        String[][] gameData = new String[Engine.NUMBER_OF_ROUNDS][2];
        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            int x = Utils.getRandomNumber(MIN, MAX);
            int y = Utils.getRandomNumber(MIN, MAX);
            char operator = getRandomOperator();
            String question = x + " " + operator + " " + y;
            gameData[i][0] = question;
            gameData[i][1] = String.valueOf(calculate(x, y, operator));
        }
        return gameData;
    }

    public static void runGame() {
        Engine.makeGame(GAME_DESCRIPTION, generateData());
    }
}

