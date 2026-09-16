package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Prime {
    private static final int MAX_NUMBER = 100;

    public static void primeGame() {
        Random random = new Random();
        String[][] questions = new String[Engine.ROUNDS][2];

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int num = random.nextInt(MAX_NUMBER) + 1;

            questions[i][0] = String.valueOf(num);
            questions[i][1] = isPrime(num) ? "yes" : "no";
        }

        Engine.startGame("Answer 'yes' if given number is prime. Otherwise answer 'no'.", questions);
    }

    public static boolean isPrime(int num) {
        if (num < 1) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
