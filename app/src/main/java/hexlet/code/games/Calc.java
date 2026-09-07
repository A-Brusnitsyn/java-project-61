package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
import java.util.Scanner;

public class Calc {
    public static void calcGame(Scanner scanner) {
        Random random = new Random();
        String[][] questions = new String[Engine.rounds][2];
        char[] operations = {'+', '-', '*'};

        for (int i = 0; i < Engine.rounds; i++) {
            int a = random.nextInt(20) + 1;
            int b = random.nextInt(20) + 1;
            char op = operations[random.nextInt(3)];

            questions[i][0] = a + " " + op + " " + b;
            questions[i][1] = String.valueOf(calculate(a, b, op));
        }

        Engine.startGame(scanner, "What is the result of the expression?", questions);
    }

    private static int calculate(int a, int b, char op) {
        if (op == '+') return a + b;
        if (op == '-') return a - b;
        return a * b;
    }
}
