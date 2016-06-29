package JavaDay2.AddressBookProgramme;

/**
 * Created by student on 28-Jun-16.
 */
public class Address {

    private String street;
    private String city;
    private String country;
    private String postcode;

    public Address(String street, String city, String country, String postcode) {
        this.street = street;
        this.city = city;
        this.country = country;
        this.postcode = postcode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }
}
