package Q_01;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num1 = input.nextInt();

        System.out.print("Enter an integer: ");
        int num2 = input.nextInt();

        System.out.print("Enter an integer: ");
        int num3 = input.nextInt();

        int sInt = num1;

        if (sInt >= num2) {
            sInt = num2;
        }
        if (sInt >= num3) {
            sInt = num3;
        }
        System.out.print(sInt + " is the smallest integer");
    }
}
