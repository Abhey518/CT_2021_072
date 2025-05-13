package Q_03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int N = input.nextInt();

        System.out.printf("\n------ Multiplication Table of %d ------\n", N);

        for (int i = 1; i <= 10; i++ ) {
            if (i == 10) // if selection used for better formatted output
                System.out.printf("\t\t\t%d  *  %d  =  %d\n", N, i, (N * i));
            else
                System.out.printf("\t\t\t%d  *  %d   =  %d\n", N, i, (N * i));
        }
    }
}
