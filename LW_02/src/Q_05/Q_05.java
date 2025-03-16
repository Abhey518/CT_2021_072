package Q_05;

import java.util.Scanner;

public class Q_05 {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.print("Enter the temperature in degrees of Fahrenheit: ");

        double fD = input.nextDouble();
        double cD = (5.0 / 9.0) * ( fD - 32) ;

        System.out.printf("Temperature in degrees of Celsius: %.2f" ,cD );
    }
}
