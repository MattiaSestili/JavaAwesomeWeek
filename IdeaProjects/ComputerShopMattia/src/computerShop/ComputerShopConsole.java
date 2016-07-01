package computerShop;
import domain.Computer;
import domain.Customer;
import domain.Laptop;
import domain.Ram;

import java.util.List;
import java.util.Scanner;


/**
 * Created by student on 01-Jul-16.
 */
public class ComputerShopConsole {

    static ComputerShop computers = new ComputerShop();
    static ComputerShop customers = new ComputerShop();
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args)
    {
        char choice;
        do{
            System.out.println("Welcome to Awesome Computer Shop");
            System.out.println("C. Create a new Computer");
            System.out.println("N. Create a new Customer");
            System.out.println("S. Search");
            System.out.println("M. Match");
            System.out.println("O. Order Computers");
            System.out.println("L. Sort Computers");
            System.out.println("Q. Exit");
            System.out.println("Choose an option: ");

            choice = s.nextLine().toUpperCase().charAt(0);
            System.out.println();

            switch (choice)
            {
                case 'C':
                    System.out.println("Please choose L. for Laptop " +
                            "\nor D. for Computer Desktop");
                    choice = s.nextLine().toUpperCase().charAt(0);
                    switch (choice)
                    {
                        case 'L':
                            addLaptop(getDetails());
                            break;
                        case 'D':
                            //addDesktop();
                            break;
                    }
                    break;
                case 'N':
                    addNewCustomer(displaCustomer());
                    break;
                case 'S':
                    break;
                case 'M':
                    break;
                case 'O':
                    break;
                case 'L':
                    break;
                default:
                    System.out.println("Please choose one of the option");
            }

        }while (choice != 'Q' );

    }

    static Laptop getDetails()
    {
        String make, cpu , graphicCard ,
                classification,hardDrive;
        int cpuSpeed,hardDriveCapacity ,
                sizeMonitor,weight,batteryDuration,ram;


        System.out.println("Enter laptop requirements");

        System.out.println("Enter the computer model: ");
        Scanner s = new Scanner(System.in);
        make = s.nextLine();

        System.out.println("Enter RAM (4), (8), (16): ");
        ram = s.nextInt();
        Ram createRam = null;
        switch (ram)
        {
            case 4:
                createRam = Ram.FOUR;
                break;
            case 8:
                createRam = Ram.EIGHT;
                break;
            case 16:
                createRam = Ram.SIXTEEN;
                break;
        }

        System.out.println("Enter CPU: ");
        cpu = s.nextLine();

        s.nextLine();

        System.out.println("Enter phone CPU SPEED: ");
        cpuSpeed = s.nextInt();

        System.out.println("Enter the HardDrive: ");
        hardDrive = s.nextLine();

        s.nextLine();

        System.out.println("Enter the capacity: ");
        hardDriveCapacity = s.nextInt();

        System.out.println("Enter the Graphic Card");
        graphicCard = s.nextLine();

        s.nextLine();

        System.out.println("Enter the type of Laptop(Notebook or Ultrabook: ");
        classification = s.nextLine();

        System.out.println("Enter size of the monitor: ");
        sizeMonitor = s.nextInt();

        System.out.println("Enter the weight: ");
        weight = s.nextInt();

        System.out.println("Enter the battery duration: ");
        batteryDuration = s.nextInt();

        Laptop laptop = new Laptop(make, createRam, cpu, cpuSpeed, hardDrive,
                hardDriveCapacity, graphicCard, classification,
                sizeMonitor,weight,batteryDuration);

        return laptop;
    }

    static void addLaptop(Laptop laptop)
    {
        computers.addNewLaptop(laptop);

        for(Laptop l : computers.getLaptop())
            if (l != null)
                System.out.println(l.getMake()+ " " +
                        l.getSizeMonitor() + "" + l.getRam());
    }

    static Customer displaCustomer()
    {
        String firstName,secondName,address, phoneNumber;

        System.out.println("Enter the new customer");

        System.out.println("Enter the First Name: ");
        firstName = s.nextLine();

        System.out.println("Enter the Second Name: ");
        secondName = s.nextLine();

        System.out.println("Enter the address: ");
        address = s.nextLine();

        System.out.println("Enter the Phone Number: ");
        phoneNumber = s.nextLine();

        Customer customer = new Customer(firstName,secondName,address,phoneNumber);

        return customer;
    }

    static void addNewCustomer(Customer customer)
    {
        customers.addNewCustomer(customer);

        for(Customer c : customers.getCustomers())
            if (c != null)
                System.out.println(c.getFirstName()+ " " +
                        c.getSecondName());
    }
}
