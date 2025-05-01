package Q_01;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num1 = input.nextInt();

        System.out.print("Enter an integer: ");
        int num2 = input.nextInt();

        System.out.print("Enter an integer: ");
        int num3 = input.nextInt();

        if (num1 >= num2 && num3 >= num2) {
                System.out.print(num2 + " is the smallest integer");

        } else if (num2 >= num1 && num3 >= num1) {
                System.out.print(num1 + " is the smallest integer");

        } else {
            System.out.print(num3 + " is the smallest integer");

        }
    }
}