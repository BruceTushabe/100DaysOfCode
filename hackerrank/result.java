package hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class result {


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

    public static void plusMinus(List<Integer> arr) {
    }


    // Write your code here

    }