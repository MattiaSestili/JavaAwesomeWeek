package Day4.CouponApp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


/**
 * Created by student on 30-Jun-16.
 */
public class CouponApp extends JFrame implements ActionListener {

    JPanel panel;
    JButton saveButton;
    JComboBox couponsBox;
    private String[] cupons = new String[]{"Shoes Coupon £14.89", "Clothes Coupon £20.00", "Accessory Coupon £50.00"};


    public CouponApp()
    {
        setSize(100,200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setSize(100,200);
        panel.setLayout(new FlowLayout());
        add(panel);

        couponsBox = new JComboBox(cupons);
        panel.add(couponsBox);
        saveButton = new JButton("Save the Coupon please");
        saveButton.addActionListener(this);
        saveButton.setSize(20,40);
        panel.add(saveButton);

        setVisible(true);

    }

    void readFromFile() {

        Scanner fileReader = new Scanner(getClass().getResourceAsStream("Coupons.txt"));

        while (fileReader.hasNextLine())
        {
            String st = fileReader.nextLine();
            couponsBox.addItem(st);
        }
        fileReader.close();
    }

    void writeFromFile(String st){

        System.out.println(System.getProperty("user.dir"));

        try
        {
            FileWriter fw = new FileWriter( "Coupons.txt" );
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(st);
            bw.close();

        } catch (IOException ex)
        {
            System.out.println("Error writing to a file: " + ex);
        }

    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        String st = (String) couponsBox.getSelectedItem();
        writeFromFile(st);

    }


    public static void main(String[] args)
    {
        CouponApp app = new CouponApp();
        app.readFromFile();
    }


}
