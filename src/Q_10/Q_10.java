package Q_10;

import java.util.Scanner;

public class Q_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Input Text : ");
        String text = input.nextLine();

        int length , place;
        length = text.length();
        //System.out.println(length);

        if (length % 2 == 1) {
            place = ((length + 1) / 2);
            //System.out.println(place);
            System.out.println(text.charAt(--place));

        }
        else {
            System.out.println("Not Acceptable. The Input Word must have an odd length");
        }
    }
}
