package Q_03;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a power of 10: ");
        int power = input.nextInt();

        switch (power) {
            case 6:
                System.out.println("Million");
                break;

            case 9:
                System.out.println("Billion");
                break;

            case 12:
                System.out.println("Trillion");
                break;

            case 15:
                System.out.println("Quadrillion");
                break;

            case 18:
                System.out.println("Quintillion");
                break;

            case 21:
                System.out.println("Sextillion");
                break;

            case 30:
                System.out.println("Nonillion");
                break;

            case 100:
                System.out.println("Googol");
                break;

            default:
                System.out.println("No standard name for 10^" + power);
                System.out.println("Enter a power of 10 (example: 6, 9, 12, etc.)");
                break;
        }
    }
}
