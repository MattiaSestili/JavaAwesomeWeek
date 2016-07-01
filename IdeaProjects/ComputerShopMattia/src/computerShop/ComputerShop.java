package computerShop;

import domain.Computer;
import domain.Customer;
import domain.Laptop;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 01-Jul-16.
 */
public class ComputerShop {

    private Laptop[] laptops = new Laptop[1000];
    private Customer[] customers = new Customer[1000];
    int counter = 0;

    public void addNewCustomer(Customer customer)
    {
        customers[counter + 1] = customer;
        counter++;
    }
    public Customer[] getCustomers()
    {
        return customers;
    }


    public void addNewLaptop(Laptop laptop)
    {
        laptops[counter + 1] = laptop;
        counter++;
    }

    public Laptop[] getLaptop()
    {
        return laptops;
    }

    public void sortLaptopByName()
    {
        boolean swapped;
        int n = counter;

        do {
            swapped = false;
            for (int i = 0; i < n; i++) {
                String brand1 = laptops[i].getMake();
                String brand2 = laptops[i-1].getMake();

                if (brand1.compareToIgnoreCase(brand2) > 0)
                {
                    Laptop temp = laptops[i];
                    laptops[i] = laptops[i + 1];
                    laptops[i + 1] = temp;
                    swapped = true;
                }
                n = n - 1;
            }
        } while (swapped);
    }
}
