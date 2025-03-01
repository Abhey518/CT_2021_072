package Q_05;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Q_05 {
    public static void main(String[] args) {
        Date today = new Date();
        SimpleDateFormat df = new SimpleDateFormat("EEEE, MMMM dd, yyyy");
        System.out.print(df.format(today));

    }
}
