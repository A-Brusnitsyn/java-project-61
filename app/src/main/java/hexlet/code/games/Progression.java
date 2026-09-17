package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Progression {
  private static final int COUNT = 10;
  private static final int MAX_START = 10;
  private static final int MAX_STEP = 10;

  public static void progressionGame() {
    Random random = new Random();

    String[][] questions = new String[Engine.ROUNDS][2];

    for (int i = 0; i < Engine.ROUNDS; i++) {
      int start = random.nextInt(MAX_START) + 1;
      int step = random.nextInt(MAX_STEP) + 1;
      int hiddenNumIndex = random.nextInt(COUNT);

      String[] progression = generateProgression(start, step, COUNT);

      String answer = progression[hiddenNumIndex];
      progression[hiddenNumIndex] = "..";

      String question = String.join(" ", progression);

      questions[i][0] = question;
      questions[i][1] = answer;
    }
    Engine.startGame("What number is missing in the progression?", questions);
  }

  private static String[] generateProgression(int start, int step, int sizeOfProgression) {
    String[] arr = new String[sizeOfProgression];

    for (int i = 0; i < sizeOfProgression; i++) {
      arr[i] = String.valueOf(start + i * step);
    }

    return arr;
  }
}
