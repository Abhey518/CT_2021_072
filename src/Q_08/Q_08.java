package Q_08;

import java.util.Scanner;

public class Q_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Text: ");
        String text = input.nextLine();

        int place , size;
        place = text.indexOf("!");
        //System.out.println(place);

        size = text.length();
        //System.out.println(size);

        String part01 , part02 ;
        part01 = text.substring(0,place);
        part02 = text.substring(++place,size);
        System.out.println(part01);
        System.out.println(part02.trim());

    }
}

