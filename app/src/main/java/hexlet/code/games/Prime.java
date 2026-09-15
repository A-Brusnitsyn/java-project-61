package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
import java.util.Scanner;

public class Prime {
    public static void primeGame(Scanner scanner) {
        Random random = new Random();
        String questions[][] = new String[Engine.rounds][2];

        for (int i = 0; i < Engine.rounds; i++) {
            int num = random.nextInt(100) + 1;
            questions[i][0] = String.valueOf(num);
            questions[i][1] = isPrime(num) ? "yes" : "no";
        }

        Engine.startGame(
                scanner,
                "Answer 'yes' if given number is prime. Otherwise answer 'no'.",
                questions);
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
