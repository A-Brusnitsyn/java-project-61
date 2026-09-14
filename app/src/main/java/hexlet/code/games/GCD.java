package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class GCD {
    public static void GCDGame(Scanner scanner){
        Random random = new Random();
        String questions [][] = new String[Engine.rounds][2];

        for (int i=0; i< Engine.rounds; i++){
            int a = random.nextInt(100) + 1;
            int b = random.nextInt(100) + 1;
            int nod=0;
            int temp=0;

            questions[i][0] = a + " " + b;
            if(b==0){
                nod=a;
            }
            while (b>0){
                temp=a%b;

                a=b;
                b=temp;
                if(b==0){
                    nod=a;
                }
            }
            questions[i][1] = String.valueOf(nod);

        }
        Engine.startGame(scanner, "Find the greatest common divisor of given numbers.", questions);
    }
}
