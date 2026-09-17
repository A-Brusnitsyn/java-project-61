package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Progression {
  private static final int COUNT = 10;
  private static final int MAX_START = 10;
  private static final int MAX_STEP = 10;

  public static void progressionGame() {
    Random random = new Random();
    int start = random.nextInt(MAX_START) + 1;
    int step = random.nextInt(MAX_STEP) + 1;
    int hiddenNumIndex = random.nextInt(COUNT);

    String[][] questions = new String[Engine.ROUNDS][2];

    for (int i = 0; i < Engine.ROUNDS; i++) {
      questions[i] = generateProgression(start, step, COUNT, hiddenNumIndex);
    }
    Engine.startGame("What number is missing in the progression?", questions);
  }

  private static String[] generateProgression(
      int start, int step, int sizeOfProgression, int hiddenIndex) {
    String[] arr = new String[sizeOfProgression];

    for (int i = 0; i < sizeOfProgression; i++) {
      arr[i] = String.valueOf(start + i * step);
    }

    String answer = arr[hiddenIndex];
    arr[hiddenIndex] = "..";

    String question = String.join(" ", arr);

    return new String[] {question, answer};
  }
}
