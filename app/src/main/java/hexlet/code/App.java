package hexlet.code;

import hexlet.code.games.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nPlease enter the game number and press Enter.");
            System.out.println("1 - Greet");
            System.out.println("2 - Even");
            System.out.println("3 - Calc");
            System.out.println("4 - GCD");
            System.out.println("5 - Progression");
            System.out.println("6 - Prime");
            System.out.println("0 - Exit");
            System.out.print("Your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    scanner.close();
                    return;
                case 1:
                    greetUser(scanner);
                    return;
                case 2:
                    Even.evenGame(scanner);
                    return;
                case 3:
                    Calc.calcGame(scanner);
                    return;
                case 4:
                    GCD.GCDGame(scanner);
                    return;
                case 5:
                    Progression.progressionGame(scanner);
                    return;
                case 6:
                    Prime.primeGame(scanner);
                    return;
                default:
                    System.out.println("Invalid choice");
                    return;
            }
        }
    }

    private static void greetUser(Scanner scanner) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}
