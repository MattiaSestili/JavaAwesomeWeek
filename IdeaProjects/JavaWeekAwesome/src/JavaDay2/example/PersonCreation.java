package JavaDay2.example;

/**
 * Created by student on 28-Jun-16.
 */
public class PersonCreation {
    //int or byte are value type: represent data
    //reference type: variable is a reference to storage
    final static Person alex = new Person();
    final static Person john = new Person("John", "Doe");

    static void setPerson()
    {
        alex.setFirstName("Alex");
        alex.setLastName("Kennedy");
    }

}



