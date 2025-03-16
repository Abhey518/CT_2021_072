package Q_03;

import java.util.Scanner;

public class Q_03 {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.print("Enter the temperature in degrees of Celsius: ");

        double cD = input.nextDouble();
        double fD = (1.8 * cD) + 32;

        System.out.printf("Temperature in degrees of Fahrenheit: %.2f" ,fD );
    }
}
