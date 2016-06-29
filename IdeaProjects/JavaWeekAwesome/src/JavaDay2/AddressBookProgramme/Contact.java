package JavaDay2.AddressBookProgramme;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 28-Jun-16.
 */
public class Contact {
    //person reference to a single person in a single contact
    private Person p;
    private List<Address> addresses = new ArrayList<>();
    private String phoneNumber;
    private String email;

    //set a contact with a single person and a single address
    public Contact(Person p, Address address, String phoneNumber, String email) {
        this.p = p;
        addresses.add(address);
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    //add an address to a collection
    public void addAddress(Address address)
    {
        addresses.add(address);
    }

    //remove an address to a collection based on index number
    public void removeAddress(int index)
    {
        addresses.remove(index);
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Person getPerson() {
        return p;
    }

    public void setPerson(Person p) {
        this.p = p;
    }
}
