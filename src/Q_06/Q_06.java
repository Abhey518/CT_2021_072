package Q_06;

import java.util.*;
import javax.swing.*;

public class Q_06 {
    public static void main(String[] args) {

        Scanner sizein = new Scanner(System.in);
        System.out.print("Enter The Width of The Window: ");
        int W = sizein.nextInt();

        System.out.print("Enter The Height of The Window: ");
        int H = sizein.nextInt();

        Scanner titlein = new Scanner(System.in);
        System.out.print("Enter The Title of The Window: ");
        String title = titlein.nextLine();
        
        JFrame window = new JFrame();
        window.setSize(W,H);
        window.setTitle(title);
        window.setVisible(true);
    }
}
