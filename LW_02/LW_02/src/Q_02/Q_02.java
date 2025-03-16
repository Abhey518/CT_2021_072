package Q_02;

import java.util.Scanner;

public class Q_02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the length in centimeters (cm): ");

        double cm = scan.nextDouble();

        // 1 foot (ft) = 30.48 cm
        // 1 inch = 2.54 cm

        double ft, inch , remainder ;

        ft = (int) (cm / 30.48);
        remainder = cm % 30.48;
        inch = remainder / 2.54;

        System.out.printf("Entered length in feet(ft) and inches(inch): %.1f ft and %.2f inch%n", ft, inch);
    }
}
