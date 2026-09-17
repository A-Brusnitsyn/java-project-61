package hexlet.code;

import java.util.Scanner;

public class Engine {
  public static final int ROUNDS = 3;

  public static void startGame(String description, String[][] questions) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Welcome to the Brain Games!");
    System.out.print("May I have your name? ");
    String userName = scanner.nextLine();
    System.out.println("Hello, " + userName + "!");

    System.out.println(description);

    for (String[] question : questions) {
      System.out.println("Question: " + question[0]);
      System.out.print("Your answer: ");
      String answer = scanner.nextLine();

      if (answer.equals(question[1])) {
        System.out.println("Correct!");
      } else {
        System.out.println(
            "'" + answer + "' is wrong answer ;(. Correct answer was '" + question[1] + "'.");
        System.out.println("Let's try again, " + userName + "!");
        return;
      }
    }

    System.out.println("Congratulations, " + userName + "!");
  }
}
