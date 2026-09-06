package hexlet.code;

import java.util.Scanner;

public class Cli {
    static String name;
    public static void welcome(Scanner scanner) {

        System.out.print("May I have your name? ");

        name = scanner.nextLine();

        System.out.println("Hello, " + name + "!");
    }
}
