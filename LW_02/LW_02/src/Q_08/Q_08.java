package Q_08;

import java.util.Scanner;

public class Q_08 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the sphere: ");
        double r = input.nextDouble();

        double PI = 3.14;
        double v = (4.0 / 3.0) * (PI * Math.pow(r, 3));
        System.out.printf("Volume of the sphere is: %.3f%n" ,v);
    }
}
