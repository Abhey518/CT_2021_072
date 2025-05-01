package Q_05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double eCost, sdCost, dCost;
        int qtyE = 0, qtySD = 0, qtyD = 0;
        int Entree, sDish, Drink;
        // Assume that the maximum quantity allowed per item is 10 at a time

        Scanner input = new Scanner(System.in);

        System.out.println("*** Welcome to MyJava Lo-Fat Burgers ***");

        System.out.println("\n****  Entree Menu  ****");
        System.out.println("1 -> Tofu Burger     $3.49");
        System.out.println("2 -> Cajun Chicken   $4.59");
        System.out.println("3 -> Buffalo Wings   $3.99");
        System.out.println("4 -> Rainbow Fillet  $2.99");

        System.out.println("\n*** Side Dish Menu ***");
        System.out.println("1. Rice Cracker    $0.79");
        System.out.println("2. No-Salt Fries   $0.69");
        System.out.println("3. Zucchini        $1.09");
        System.out.println("4. Brown Rice      $0.59");

        System.out.println("\n*** Drink Menu ***");
        System.out.println("1. Cafe Mocha      $1.99");
        System.out.println("2. Cafe Latte      $1.90");
        System.out.println("3. Espresso        $2.49");
        System.out.println("4. Oolong Tea      $0.99");

        // Entree
        System.out.print("\nEntree item (Enter 0 to skip): ");
        Entree = input.nextInt();
        while (Entree < 0 || Entree > 4) {
            System.out.println("Invalid Entree choice. Please enter again");
            System.out.print("\nEntree item (Enter 0 to skip): ");
            Entree = input.nextInt();
        }

        if (Entree == 1)
            eCost = 3.49;
        else if (Entree == 2)
            eCost = 4.59;
        else if (Entree == 3)
            eCost = 3.99;
        else if (Entree == 4)
            eCost = 2.99;
        else
            eCost = 0.00;

        if (Entree != 0) {
            System.out.print("Quantity: ");
            qtyE = input.nextInt();
            while (qtyE < 1 || qtyE > 10) {
                System.out.println("Invalid quantity. Please enter again");
                System.out.print("Quantity: ");
                qtyE = input.nextInt();
            }
        }

        // Side Dish
        System.out.print("\nSide Dish item (Enter 0 to skip): ");
        sDish = input.nextInt();
        while (sDish < 0 || sDish > 4) {
            System.out.println("Invalid Side Dish choice. Please enter again");
            System.out.print("\nSide Dish item (Enter 0 to skip): ");
            sDish = input.nextInt();
        }

        if (sDish == 1)
            sdCost = 0.79;
        else if (sDish == 2)
            sdCost = 0.69;
        else if (sDish == 3)
            sdCost = 1.09;
        else if (sDish == 4)
            sdCost = 0.59;
        else
            sdCost = 0.00;

        if (sDish != 0) {
            System.out.print("Quantity: ");
            qtySD = input.nextInt();
            while (qtySD < 1 || qtySD > 10) {
                System.out.println("Invalid quantity. Please enter again");
                System.out.print("Quantity: ");
                qtySD = input.nextInt();
            }
        }

        // Drink
        System.out.print("\nDrink item (Enter 0 to skip): ");
        Drink = input.nextInt();
        while (Drink < 0 || Drink > 4) {
            System.out.println("Invalid Drink choice. Please enter again");
            System.out.print("\nDrink item (Enter 0 to skip): ");
            Drink = input.nextInt();
        }

        if (Drink == 1)
            dCost = 1.99;
        else if (Drink == 2)
            dCost = 1.90;
        else if (Drink == 3)
            dCost = 2.49;
        else if (Drink == 4)
            dCost = 0.99;
        else
            dCost = 0.00;


        if (Drink != 0) {
            System.out.print("Quantity: ");
            qtyD = input.nextInt();
            while (qtyD < 1 || qtyD > 10) {
                System.out.println("Invalid quantity. Please enter again");
                System.out.print("Quantity: ");
                qtyD = input.nextInt();
            }
        }

        if (Entree == 0 && sDish == 0 && Drink == 0) {
            System.out.println("\nNo items selected");
        } else {
            double total = (eCost * qtyE) + (sdCost * qtySD) + (dCost * qtyD);
            System.out.println("\n*** Your Order ***");
            System.out.println("\nCategory    Price    Qty    Amount");
            System.out.println("-----------------------------------");
            System.out.printf("Entree:     $%.2f     %d     $%.2f", eCost, qtyE, (eCost * qtyE));
            System.out.printf("\nSide Dish:  $%.2f     %d     $%.2f", sdCost, qtySD, (sdCost * qtySD));
            System.out.printf("\nDrink:      $%.2f     %d     $%.2f", dCost, qtyD, (dCost * qtyD));
            System.out.println("\n-----------------------------------");
            System.out.printf("Total:                      $%.2f", total);
            System.out.println("\n-----------------------------------");
        }

    }
}
