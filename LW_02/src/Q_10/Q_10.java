package Q_10;

import java.util.Scanner;

public class Q_10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the loan amount: ");
        double l_amount = input.nextDouble();

        System.out.print("Enter the annual interest rate(%): ");
        double a_i_rate = input.nextDouble();

        System.out.print("Enter the loan period(in years): ");
        double l_period = input.nextDouble();
        double months = 12.0;

        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");

        double m_i_rate = (a_i_rate / 100.0 / months) ;
        System.out.printf("The monthly interest rate for the loan: %.6f%%%n", m_i_rate);

        double no_payments = (l_period * months);
        System.out.printf("Number of payments: %.0f%n", no_payments);

        double m_payment = (l_amount * m_i_rate) / (1 - Math.pow( (1 / (1 + m_i_rate)), no_payments));
        System.out.printf("The monthly payment amount: $ %.2f%n", m_payment);

        double t_payment = m_payment * no_payments;
        System.out.printf("The total payment amount: $ %.2f%n", t_payment);

        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
    }
}
