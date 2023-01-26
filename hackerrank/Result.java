import java.util.ArrayList;
import java.util.Scanner;

public class Result {


    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);

        ArrayList<String> values = new ArrayList<String>();

        // Reads values untill user enters STOP

        System.out.println("Enter a string: ");
        String input = sc.nextLine();
        while (!input.equals("STOP"))
        {
            values.add(input);
            System.out.println("Enter a string: ");
            input = sc.nextLine();
        }

        // Print out the values in ArrayList

        System.out.println("List contents: ");


        for (int i = 0; i < values.size(); i++)
        System.out.println(values.get(i));
    }


    // Write your code here

    }