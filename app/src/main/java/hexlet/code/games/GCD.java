package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class GCD {
  private static final int MAX_NUMBER = 100;

  public static void GCDGame() {

    Random random = new Random();
    String[][] questions = new String[Engine.ROUNDS][2];

    for (int i = 0; i < Engine.ROUNDS; i++) {
      int a = random.nextInt(MAX_NUMBER) + 1;
      int b = random.nextInt(MAX_NUMBER) + 1;

      questions[i][0] = a + " " + b;
      questions[i][1] = calculateGCD(a, b);
    }
    Engine.startGame("Find the greatest common divisor of given numbers.", questions);
  }

  public static String calculateGCD(int a, int b) {
    int nod = 0;
    int temp = 0;

    if (b == 0) {
      nod = a;
    }
    while (b > 0) {
      temp = a % b;

      a = b;
      b = temp;
      if (b == 0) {
        nod = a;
      }
    }
    return String.valueOf(nod);
  }
}
