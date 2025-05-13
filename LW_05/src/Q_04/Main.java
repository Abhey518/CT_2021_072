package Q_04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();

        System.out.print("\n");

        for (int i = 1; i <= rows; i++) {
            for (int m = 1; m <= (rows + 1 - i); m++) {
                System.out.print("  ");

            }
            for (int j = 1; j <= (2 * i - 1); j++ ) {
                System.out.print("* ");

            }
            System.out.print("\n");

        }
    }
}
