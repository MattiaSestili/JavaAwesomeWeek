package JavaDay2.AddressBookProgramme;

import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;


/**
 * Created by student on 28-Jun-16.
 */
public class Programme {

    static AddressBook book = new AddressBook();

    public static void main(String[] args)
    {
            int choice;
            do{
                System.out.println("Welcome to BOOM Address Book");
                System.out.println("1. Add a new contact");
                System.out.println("2. Edit a new contact");
                System.out.println("3. Sort contacts");
                System.out.println("4. Remove a contact");
                System.out.println("5. Exit");
                System.out.println("Choose an option: ");

                Scanner s = new Scanner(System.in);
                choice = s.nextInt();
                System.out.println();

            }while (choice < 1 || choice > 5);

            switch (choice)
            {
                case 1:
                    getDetails(inputScreen());
                    break;
                case 2:
                    editContact();
                    break;

            }
    }
    static Contact inputScreen()
    {
        String firstName, lastName, email, phoneNumber, address;

        System.out.println("Enter First name: ");
        Scanner s = new Scanner(System.in);
        firstName = s.nextLine();


        System.out.println("Enter Last name: ");
        lastName = s.nextLine();

        System.out.println("Enter your address: ");
        address = s.nextLine();
        String[] data = address.split(", ");

        System.out.println("Enter phone number: ");
        phoneNumber = s.nextLine();

        System.out.println("Enter email: ");
        email = s.nextLine();

        Contact temp = new Contact(new Person(firstName,lastName),
                new Address(data[0],data[1],data[2],data[3]), phoneNumber, email);

        return temp;
    }

    static void getDetails(Contact contact)
    {

        book.addNewContact(contact);

        for(Contact c : book.getContacts())
            if (c != null)
            System.out.println(c.getPerson().getFirstName()+ " " +
                    c.getPerson().getSecondName());

    }

    static void editContact ()
    {
        String firstName, lastName, email, phoneNumber, address;

        System.out.println("Enter contact First Name: ");
        Scanner s = new Scanner(System.in);
        firstName = s.nextLine();

        for(int i = 0; i < book.getContacts().length -1; i++)
        {
            if(book.getContacts()[i].getPerson().getFirstName()
                        .compareToIgnoreCase(firstName) > 0)
            {
                book.getContacts()[i] = inputScreen();
            }
        }
    }
}
