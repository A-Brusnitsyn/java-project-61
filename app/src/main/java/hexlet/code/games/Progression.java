package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;


public class Progression {
    private static final int COUNT = 10;
    private static final int MAX_START = 10;
    private static final int MAX_STEP = 10;

    public static void progressionGame() {

        String[][] questions = new String[Engine.ROUNDS][2];

        for (int i = 0; i < Engine.ROUNDS; i++) {
            questions[i]=generateProgression();
        }
        Engine.startGame("What number is missing in the progression?", questions);
    }

    private static String[] generateProgression(){
        Random random = new Random();

        int start = random.nextInt(MAX_START) + 1;
        int step = random.nextInt(MAX_STEP) + 1;

        String[] arr = new String[COUNT];

        for (int i = 0; i < COUNT; i++) {
            arr[i] = String.valueOf(start + i * step);
        }

        int index = random.nextInt(COUNT);
        String answer = arr[index];
        arr[index] = "..";

        String question = String.join(" ", arr);

        return new String[] {question, answer};

    }
}
