package Q_03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Radius of the outer circle: ");
        double ro = input.nextDouble();

        System.out.print("Radius of the inner circle: ");
        double ri = input.nextDouble();

        Circle tempCircle = new Circle();

        tempCircle.setRadius(ro,ri);

        System.out.printf("Area of the circular region: %.2f square unit\n" ,tempCircle.computeArea());

        tempCircle.computeCircumference();

    }
}
