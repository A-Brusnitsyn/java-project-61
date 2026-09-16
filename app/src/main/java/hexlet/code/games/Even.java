package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Even {
    private static final int MAX_NUMBER = 100;

    public static void evenGame() {
        Random random = new Random();
        String[][] questions = new String[Engine.ROUNDS][2];

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int num = random.nextInt(MAX_NUMBER) + 1;
            questions[i][0] = String.valueOf(num);
            questions[i][1] = (num % 2 == 0) ? "yes" : "no";
        }

        Engine.startGame("Answer 'yes' if the number is even, otherwise answer 'no'.", questions);
    }
}
