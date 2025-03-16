package Q_04;

import java.util.Scanner;

public class Q_04 {
    public static void main(String[] args) {

        double lb = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("***** Choose the weight input unit *****");
        System.out.print("Enter ( 1 -> weight in Kilograms(Kg) , 2 -> weight in Pounds(lb) ): ");

        int option = input.nextInt();

        if (option == 1) {
            System.out.print("Enter your weight in kilograms: ");
            double kg = input.nextDouble();
            // 1Kg = 2.20462 lb
            lb = kg * 2.20462;

        } else if (option == 2) {
            System.out.print("Enter your weight in pounds: ");
            lb = input.nextDouble();

        }
        if (option == 1 || option == 2) {
            double calories = lb * 19;
            System.out.printf("Number of calories that you need in one day: %.2f" , calories);

        } else {
            System.out.println("***** The value that you Entered is not an option. Try again. *****");
        }
    }
}
