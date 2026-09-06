package hexlet.code;

import org.apache.commons.math3.random.RandomDataGenerator;

import java.util.Scanner;

public class Even {
    public static void evenGame(Scanner scanner){
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        RandomDataGenerator randomDataGenerator = new RandomDataGenerator();
        int min = 1;
        int max = 100;
        int count=0;
        String positiveAnswer = "yes";
        String negativeAnswer = "no";

        while (count < 3){
            int randomNum = randomDataGenerator.nextInt(min,max);

            System.out.println("Question: " + randomNum);

            String ans = scanner.next();
            System.out.println("Your answer: " + ans);
            boolean isEven = (randomNum % 2 == 0);
            String correctAnswer = isEven ? positiveAnswer : negativeAnswer;

            if (ans.equals(correctAnswer)) {
                System.out.println("Correct!");
                count++;
            } else {
                System.out.println("'" + ans + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
                System.out.println("Let's try again, "+Cli.name+"!");
                return;
            }
            System.out.println("Congratulations, "+Cli.name+"!");

        }



    }
}
