package JavaDay3;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by student on 29-Jun-16.
 */
public class CharacterFinder extends JFrame implements ActionListener {

    JPanel panel;
    JLabel labelText;
    JLabel checkLabel;
    JTextArea textArea;
    JTextField checkArea;

    public CharacterFinder ()
    {
        super("Mattia Character Finder");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,200);
        setLocationRelativeTo(null);

        panel = new JPanel();
        panel.setSize(400,200);
        panel.setBackground(Color.RED);
        panel.setLayout(new FlowLayout());
        labelText = new JLabel("Enter text to be searched");
        textArea = new JTextArea("",10,40);
        JScrollPane sp = new JScrollPane(textArea);
        checkArea = new JTextField(5);
        checkLabel = new JLabel("Enter a character");
        checkArea.addActionListener(this);


        add(panel);
        panel.add(labelText);
        panel.add(sp);

        panel.add(checkLabel);
        panel.add(checkArea, BorderLayout.EAST);

        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        String userString = checkArea.getText();
        char character = userString.charAt(0);
        int count = 0;

        while(textArea.getText() != userString)
        {
            int userText = textArea.getText().indexOf(character, 0);
            count++;
            System.out.println(character + userText + count);
        }

    }

    public static void main(String[] args) { new CharacterFinder(); }
}
