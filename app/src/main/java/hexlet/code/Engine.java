package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static int rounds = 3;
    private static String userName;

    public static void startGame(Scanner scanner, String description, String[][] questions) {

        welcomeUser(scanner);
        System.out.println(description);
        for (int i = 0; i < rounds; i++) {
            System.out.println("Question: " + questions[i][0]);
            System.out.print("Your answer: ");
            String answer = scanner.nextLine();

            if (answer.equals(questions[i][1])) {
                System.out.println("Correct!");
            } else {
                System.out.println(
                        "'"
                                + answer
                                + "' is wrong answer ;(. Correct answer was '"
                                + questions[i][1]
                                + "'.");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }

    private static void welcomeUser(Scanner scanner) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");
    }
}
