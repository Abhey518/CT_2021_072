package Q_02;

import java.util.Scanner;
import javax.swing.*;

public class Q_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your First Name: ");
        String firstName = scan.nextLine();

        System.out.print("Enter your Last Name: ");
        String lastName = scan.nextLine();

        //System.out.println(firstName + " " + lastName);

        JFrame window = new JFrame();
        window.setSize(800,600);
        window.setTitle(firstName + " " + lastName);
        window.setVisible(true);

    }
}
