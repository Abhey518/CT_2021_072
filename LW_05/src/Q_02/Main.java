package Q_02;

import java.util.Scanner;

public class Main {

    public static int digitCount(int number) {

        int dCount = 0;

        if (number == 0)
            dCount = 1;

        while (number > 0) {
            number = number / 10;
            dCount++;
        }
        return dCount;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num;

        while(true) {
            System.out.print("Enter an integer: ");
            num = input.nextInt();

            if (num < 0) {
                System.out.println("you have entered a negative integer");
                System.out.println("Exited");
                break;

            } else {
                System.out.printf("%d has %d digits", num, digitCount(num));
                System.out.println("\n");

            }
        }
    }
}
