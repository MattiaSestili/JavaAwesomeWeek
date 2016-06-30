package Day4;

import com.sun.javafx.scene.layout.region.StrokeBorderPaintConverter;
import com.sun.org.apache.xml.internal.serializer.utils.SystemIDResolver;
import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.*;
import java.util.Scanner;

/**
 * Created by student on 30-Jun-16.
 */
public class SimpleInputOutput {

    public static void  main(String[] args)
    {
        //user input
        /*
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a String: ");

        //read line input
        String str = input.nextLine();
        System.out.println("Using Scanner: " + str);

        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );

        try {
            String st = br.readLine();
            writeToFile(st);
        } catch (IOException e) {
            e.printStackTrace();
        }
        */

        SimpleInputOutput si = new SimpleInputOutput();
        si.readFromFile();
    }

    static void writeToFile (String st)
    {
        System.out.println(System.getProperty("user.dir"));
        try
        {

            FileWriter fw = new FileWriter( "result.txt" );
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(st);
            bw.close();

        } catch (IOException ex)
        {
            System.out.println("Error writing to a file: " + ex);
        }
    }

    void readFromFile()
    {
        Scanner fileReader = new Scanner(getClass().getResourceAsStream("result.txt"));

        while (fileReader.hasNextLine())
        {
            String st = fileReader.nextLine();
            System.out.println(st);
        }
        fileReader.close();
    }

}
