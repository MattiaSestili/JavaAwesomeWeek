package JavaDay2;


import java.util.Scanner;

/**
 * Pyramids Number
 * Created by student on 28-Jun-16.
 */
public class PyramidsNumber {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int number = Integer.parseInt(input.nextLine());

       pyramids(number);
    }


    public static void pyramids(int number){

        int blank = 0;

        for (int count = 1; count <= number; count++){
            blank = number - count;

            for(int b = 0; b < blank; b++){
                System.out.print(" ");

            }

            for (int y = 0; y < count ; y++ ) {
                System.out.print(count + " ");
            }

            if (count < number){
                System.out.println();
            }
        }
    }
}


