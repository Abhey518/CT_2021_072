package Q_05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a word or phrase: ");
        String text = input.nextLine();

        String temp = text.toLowerCase();
        String word = temp.replaceAll("[^a-zA-Z0-9]", "");

        //System.out.print(word);

        int size = word.length();
        int start;
        int end = size - 1;
        int status = 0;

        if (size ==0)
            System.out.println("-- No valid characters were entered");

        else if (size == 1)
            System.out.println("-- Only one valid character has been entered");

        else {
            for (start = 0; start <= end; start++) {
                if (word.charAt(start) == word.charAt(end)) {
                    status = 1;
                    end--;

                } else {
                    status = 0;
                    break;
                }
            }

            if (status == 1)
                System.out.printf("-- The entered data, \"%s\" is a palindrome", text);

            else
                System.out.printf("-- The entered data, \"%s\" is not a palindrome", text);

        }
    }
}
