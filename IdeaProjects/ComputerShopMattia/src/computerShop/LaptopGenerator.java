package computerShop;

import domain.Laptop;
import domain.Ram;

/**
 * Created by student on 01-Jul-16.
 */
public class LaptopGenerator {
    public static Laptop hpPavillion = new Laptop("HP Pavilion", Ram.EIGHT,"Intel",3,
            "Samsung TB",1,"Nvidia","Notebook",15,229,8);
    public static Laptop acerAspire = new Laptop("Acer Aspire", Ram.FOUR,"AMD",2,
            "Segate TB",2,"HD Radeon","Notebook",15,229,8);
    public static Laptop dellXps = new Laptop("HP Pavilion", Ram.SIXTEEN,"Intel",3,
            "Samsung TB",1,"Nvidia","Notebook",17,450,8);
}
