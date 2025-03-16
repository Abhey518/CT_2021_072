package Q_09;

import java.util.Scanner;

public class Q_09 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount of investment: ");
        double P = input.nextDouble();

        System.out.print("Enter the annual interest rate(%): ");
        double R = input.nextDouble();

        System.out.print("Enter the number of years for the investment: ");
        double N = input.nextDouble();

        double grow = P * (Math.pow ( (1 + (R / 100)), N));

        System.out.printf("The amount of money you will earn after %.0f years is: $ %.2f" , N, grow);
    }
}
