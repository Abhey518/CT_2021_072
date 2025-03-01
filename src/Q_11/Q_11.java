package Q_11;

import java.util.Scanner;

public class Q_11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your Full Name (Format - FirstName MiddleName LastName) : ");
        String fullName = scan.nextLine();

        String fName, mName, mInitial, lName, remain;
        int f_Space, s_Space, length;

        // First Name -------------------------------------------------------------------------------------------------
        f_Space = fullName.indexOf(" ");
        fName = fullName.substring(0, f_Space);
        //System.out.println(fName);

        length = fullName.length();
        remain = fullName.substring(f_Space, length);
        remain = remain.trim();
        //System.out.println(remain);

        // Middle Name -------------------------------------------------------------------------------------------------
        s_Space = remain.indexOf(" ");
        mName = remain.substring(0, s_Space);
        //System.out.println(mName);

        length = remain.length();
        mInitial = mName.substring(0,1);
        //System.out.println(mInitial);

        // Last Name ---------------------------------------------------------------------------------------------------
        lName = remain.substring(s_Space, length);
        lName = lName.trim();
        //System.out.println(lName);

        // Output ------------------------------------------------------------------------------------------------------
        System.out.println(lName + "," + fName + " " + mInitial + ".");
    }
}
