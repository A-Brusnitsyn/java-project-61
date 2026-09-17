package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Calc {
  private static final int MAX_NUMBER = 20;

  public static void calcGame() {

    Random random = new Random();
    String[][] questions = new String[Engine.ROUNDS][2];
    char[] operations = {'+', '-', '*'};

    for (int i = 0; i < Engine.ROUNDS; i++) {
      int a = random.nextInt(MAX_NUMBER) + 1;
      int b = random.nextInt(MAX_NUMBER) + 1;
      char op = operations[random.nextInt(3)];

      questions[i][0] = a + " " + op + " " + b;
      questions[i][1] = String.valueOf(calculate(a, b, op));
    }

    Engine.startGame("What is the result of the expression?", questions);
  }

  private static int calculate(int a, int b, char op) {
    return switch (op) {
      case '+' -> a + b;
      case '-' -> a - b;
      case '*' -> a * b;
      default -> throw new RuntimeException("Unknown operator: " + op);
    };
  }
}
