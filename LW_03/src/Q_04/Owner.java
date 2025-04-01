package Q_04;

public class Owner {

    private String ownerName;
    private String phoneNo;

    //Constructor: Initializes the data member
    public Owner() {

        ownerName = "Unknown";
        phoneNo = "Not Assigned";
    }

    public Owner (String ownerName, String phoneNo) {
        this.ownerName = ownerName;
        this.phoneNo = phoneNo;
    }

    //Assigns the name of this bicycle's owner
    public void setOwnerName(String ownerName) {

        this.ownerName = ownerName;
    }

    //Returns the name of this bicycle's owner
    public String getOwnerName() {

        return ownerName;
    }

    //Assigns the phone number of this bicycle's owner
    public void setPhoneNo(String phoneNo) {

        this.phoneNo = phoneNo;
    }

    //Returns the phone number of this bicycle's owner
    public String getPhoneNo() {

        return phoneNo;
    }
}