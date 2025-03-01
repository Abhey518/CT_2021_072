package Q_09;

import java.util.Scanner;

public class Q_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Input Text : ");
        String text = input.nextLine();

        int size;
        size = text.length();
        System.out.println(size);

        System.out.println(text.charAt(0));
        System.out.println(text.charAt(size-1));

    }
}
