package Q_02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("0.Magenta");
        System.out.println("1.Cyan");
        System.out.println("2.Red");
        System.out.println("3.Blue");
        System.out.println("4.Green\n");
        System.out.print("Select one color from the above list: ");

        int selection = scanner.nextInt();

        switch (selection) {
            case 0:
                System.out.println("\n* You selected Magenta");
                break;

            case 1:
                System.out.println("\n* You selected Cyan");
                break;

            case 2:
                System.out.println("\n* You selected Red");
                break;

            case 3:
                System.out.println("\n* You selected Blue");
                break;

            case 4:
                System.out.println("\n* You selected Green");
                break;

            default:
                System.out.println("\n* Invalid selection");
        }
    }
}
