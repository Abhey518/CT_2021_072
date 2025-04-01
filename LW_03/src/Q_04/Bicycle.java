package Q_04;

public class Bicycle {

    private final Owner owner;

    public Bicycle(String ownerName, String phoneNo) {

        owner = new Owner(ownerName,phoneNo);

    }

    //Assigns the name of this bicycle's owner
    public void set_OwnerName(String ownerName) {

        owner.setOwnerName(ownerName);
    }


    //Returns the name of this bicycle's owner
    public String get_OwnerName() {

        return owner.getOwnerName();
    }


    //Assigns the phone number of this bicycle's owner
    public void set_PhoneNo(String phoneNo) {

        this.owner.setPhoneNo(phoneNo);
    }


    //Returns the phone number of this bicycle's owner
    public String get_PhoneNo() {

        return owner.getPhoneNo();
    }
}
