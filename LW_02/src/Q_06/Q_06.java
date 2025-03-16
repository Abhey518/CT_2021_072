package Q_06;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class Q_06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your birth year: ");
        int b_year = input.nextInt();

        GregorianCalendar cal = new GregorianCalendar();
        int current_year = cal.get(GregorianCalendar.YEAR);
        //System.out.print(current_year);
        int age = current_year - b_year;

        System.out.printf("You were born in %d and will be %d years old this year", b_year, age);
    }
}
