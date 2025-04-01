package Q_04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Bicycle name: ");
        String B_name = input.next();

        System.out.print("Enter the Owner name: ");
        String ownerName = input.next();

        System.out.print("Enter the Phone number: ");
        String phoneNo = input.next();

        Bicycle bikes = new Bicycle(ownerName, phoneNo);
        bikes.set_OwnerName(ownerName);
        bikes.set_PhoneNo(phoneNo);

        System.out.println("\n*** Details of the bike ***");
        System.out.println("Bicycle name: " + B_name);
        System.out.println("Name of the owner: " + bikes.get_OwnerName());
        System.out.println("Phone number of the owner: " + bikes.get_PhoneNo());

    }
}
