package hackerrank;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        int i = 4;
        double d = 4.0;
        String s = "Hackerrank ";
        
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an Integer number: ");
        int x = input.nextInt();

        System.out.println("The enter a double number: ");
        double y = input.nextDouble();
        
        input.nextLine();

        System.out.println("Now enter a word: ");
        String z = input.nextLine();
        
        System.out.println(x + i);
        System.out.println(d + y);
        System.out.println(s +""+ z);
        input.close();


    }
}