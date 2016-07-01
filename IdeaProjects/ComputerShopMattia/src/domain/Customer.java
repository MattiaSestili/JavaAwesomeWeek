package domain;

/**
 * Created by student on 01-Jul-16.
 */
public class Customer extends Person{

    private String address;
    private String phoneNumber;

    public Customer(String firstName, String secondName, String address,
                    String phoneNumber)
    {
        super(firstName, secondName);
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
