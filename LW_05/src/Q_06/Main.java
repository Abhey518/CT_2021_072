package Q_06;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        int randomNum = random.nextInt(100) + 1;

        Scanner input = new Scanner(System.in);
        int num = 0;

        System.out.println("I've generated a random number. It's between 1 and 100.");
        System.out.println("Can you guess it?");

        while (num != randomNum) {
            System.out.print("\nEnter your guessed number: ");
            num = input.nextInt();

            if (num <= randomNum - 20)
                System.out.println("too low");
            else if (num <= randomNum - 10)
                System.out.println("lower");
            else if (num <= randomNum - 5)
                System.out.println("close, but low");
            else if (num < randomNum)
                System.out.println("very close, little bit low");
            else if (num >= randomNum + 20)
                System.out.println("too high");
            else if (num >= randomNum + 10)
                System.out.println("higher");
            else if (num >= randomNum + 5)
                System.out.println("close, but high");
            else if (num > randomNum)
                System.out.println("very close, little bit higher");

        }

        System.out.println("Correct! The number was " + randomNum);
    }
}
