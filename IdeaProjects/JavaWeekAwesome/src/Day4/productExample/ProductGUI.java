package Day4.productExample;

import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

import static Day4.productExample.ProductGeneration.*;

/**
 * Created by student on 30-Jun-16.
 */
public class ProductGUI extends JFrame{

    private JTextField model, description, price, category;
    private JButton btnPrior, btnNext;
    int countIndex = 0;
    private JMenuItem createDb;

    Connection con;
    String username = "root";
    String password = "Password100";
    String url = "jdbc:mysql://localhost:3306/awesome?UseSSL=false";
    public static List<Blackberry> bb = new ArrayList<>();

    ProductGUI()
    {
        super("BlackBerry Warehouse");
        setSize(400,200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //Menu set up
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem newMenuItem = new JMenuItem("New");
        JMenuItem showItem = new JMenuItem("Show Phones");
        newMenuItem.addActionListener(event -> {});

        createDb = new JMenuItem("CreateDB");
        createDb.addActionListener(event ->
        {
            try {
                implementDb();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } );

        fileMenu.add(newMenuItem);
        fileMenu.add(createDb);
        menuBar.add(fileMenu);
        setJMenuBar(menuBar);

        createComponents();

        bb.add(passport);
        bb.add(priv);
        bb.add(leap);

        setVisible( true );
    }

    public void createComponents()
    {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));

        //Field panel set up
        panel.add(createFieldComponents(),BorderLayout.CENTER);
        panel.add(createButtonComponents(),BorderLayout.SOUTH);

        setContentPane(panel);
    }

    public JPanel createFieldComponents()
    {
        JPanel fieldPanel = new JPanel();
        fieldPanel.setLayout(new GridLayout(4,2,5,5));

        fieldPanel.add(new JLabel("Model"));
        model = new JTextField();
        fieldPanel.add(model);

        fieldPanel.add(new JLabel("Description"));
        description = new JTextField();
        fieldPanel.add(description);

        fieldPanel.add(new JLabel("Price"));
        price = new JTextField();
        fieldPanel.add(price);

        fieldPanel.add(new JLabel("Category"));
        category = new JTextField();
        fieldPanel.add(category);

        return fieldPanel;
    }

    public JPanel createButtonComponents()
    {
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));

        btnPrior = new JButton("Previous");
        btnPrior.addActionListener( event -> {backButton();} );
        buttonPanel.add(btnPrior);

        btnNext = new JButton("Next");
        btnNext.addActionListener( event -> {nextButton();} );
        buttonPanel.add(btnNext);

        return buttonPanel;
    }

    public void loadButton()
    {
        model.setText( bb.get(countIndex).getModel());
        description.setText( bb.get(countIndex ).getDescription() );
        price.setText( String.valueOf( bb.get( countIndex).getPrice() ) );
        category.setText( bb.get(countIndex).getCategory() );
    }

    public void nextButton()
    {
        model.setText( bb.get(countIndex).getModel());
        description.setText(bb.get(countIndex).getDescription());
        price.setText( String.valueOf( bb.get(countIndex).getPrice()));
        category.setText( bb.get(countIndex).getCategory());
        countIndex++;

        if(countIndex == bb.size())
        {
            countIndex = 0;
        }
    }

    public void backButton ()
    {
            countIndex --;

            if (countIndex < 0){

                countIndex = bb.size();
            }
        loadButton();


    }

    public void implementDb() throws Exception
    {
        //get the driver
        Class.forName("com.mysql.jdbc.Driver");

        con = DriverManager.getConnection(url,username,password);
        new MySQLDb(con).createDataBaseTables();
        con.close();
    }


    public static void main(String[] args)
    {
        new ProductGUI();
    }
}
