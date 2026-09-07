package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
import java.util.Scanner;

public class Even {
    public static void evenGame(Scanner scanner) {
        Random random = new Random();
        String[][] questions = new String[Engine.rounds][2];

        for (int i = 0; i < Engine.rounds; i++) {
            int num = random.nextInt(100) + 1;
            questions[i][0] = String.valueOf(num);
            questions[i][1] = (num % 2 == 0) ? "yes" : "no";
        }

        Engine.startGame(
                scanner, "Answer 'yes' if the number is even, otherwise answer 'no'.", questions);
    }
}
