package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice){
            case 1:
                System.out.println("Welcome to the Brain Games!");
                Cli.welcome(scanner);
                break;
            case 2:
                System.out.println("Welcome to the Brain Games!");
                Cli.welcome(scanner);
                Even.evenGame(scanner);
                break;
            default:
                return;
        }
        scanner.close();

    }
}
