package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
import java.util.Scanner;

public class Progression {
    public static void progressionGame(Scanner scanner) {
        Random random = new Random();
        String questions[][] = new String[Engine.rounds][2];

        for (int i = 0; i < Engine.rounds; i++) {
            int count = 10; // сколько чисел

            int start = random.nextInt(10) + 1;
            int step = random.nextInt(10) + 1;

            String[] arr = new String[count];
            for (int j = 0; j < count; j++) {

                arr[j] = String.valueOf(start + j * step);
            }
            int index = random.nextInt(10);
            String answer = arr[index];
            arr[index] = "..";

            questions[i][0] = String.join(" ", arr);
            questions[i][1] = String.valueOf(answer);
        }
        Engine.startGame(scanner, "What number is missing in the progression?", questions);
    }
}
