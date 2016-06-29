package JavaDay2.AddressBookProgramme;

/**
 * Created by student on 28-Jun-16.
 */
public class AddressBook {

    private Contact[] contacts = new Contact[100];
    int counter = 0;

    public void addNewContact(Contact contact)
    {
        contacts[counter + 1] = contact;
        counter++;
    }

    public Contact[] getContacts()
    {
        return contacts;
    }

    public <T> Contact searchContactDetails(T input, T option) {
        return null;
    }
    enum  options { FN, LN, AD, PH, EM}

    public void sortByFirstName()
    {
        boolean swapped;
        int n = counter;

        do {
            swapped = false;
            for (int i = 0; i < n; i++) {
                String name1 = contacts[i].getPerson().getFirstName();
                String name2 = contacts[i + 1].getPerson().getFirstName();

                if (name1.compareToIgnoreCase(name2) > 0)
                {
                    Contact temp = contacts[i];
                    contacts[i] = contacts[i + 1];
                    contacts[i + 1] = temp;
                    swapped = true;
                }

                n = n - 1;
            }
        } while (swapped);
    }
}
