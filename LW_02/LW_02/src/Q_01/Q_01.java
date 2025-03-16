package Q_01;

public class Q_01 {
    public static void main(String[] args) {

        // part a
        int A = 10;
        int B = 20;
        int C = 30;

        double answer_a = Math.sqrt( Math.pow(B,2) + (4 * A * C) );
        System.out.println(answer_a);

        // part b

        int X = 400;
        int Y = 5;

        double answer_b = Math.sqrt( (X + (4 * Math.pow(Y,3)) ) );
        System.out.println(answer_b);

        //part c

        double answer_c = Math.cbrt(X * Y);
        System.out.println(answer_c);

        // part d

        int r = 7;
        double answer_d_area =  Math.PI * Math.pow(r,2);
        System.out.println(answer_d_area);
    }
}
