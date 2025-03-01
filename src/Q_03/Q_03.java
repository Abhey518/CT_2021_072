package Q_03;

import java.util.Scanner;
import javax.swing.*;

public class Q_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Your First Name: ");
        String fName = scan.nextLine();

        System.out.print("Enter Your Middle Name: ");
        String mName = scan.nextLine();

        System.out.print("Enter Your LAst Name: ");
        String lName = scan.nextLine();

        //System.out.print(fName + " " + mName + " " + lName);

        String initial = mName.substring(0,1);
        //System.out.print(initial);


        JFrame frame = new JFrame();
        frame.setSize(800,600);
        frame.setTitle(fName + " " + initial + ". " + lName);
        frame.setVisible(true);


    }
}
