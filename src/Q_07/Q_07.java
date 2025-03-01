package Q_07;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Q_07 {
    public static void main(String[] args) {
        Date time = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss a");
        //System.out.print(sdf.format(time));

        JFrame frame = new JFrame();
        frame.setSize(600,300);
        frame.setTitle(sdf.format(time));
        frame.setVisible(true);

    }
}
