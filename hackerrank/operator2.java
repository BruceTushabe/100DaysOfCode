package hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class operator2 {

    /*
     * Complete the 'solve' function below.
     *
     * The function accepts following parameters:
     *  1. DOUBLE meal_cost
     *  2. INTEGER tip_percent
     *  3. INTEGER tax_percent
     */

    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);

        System.out.println("Enter meal cost here: ");
        double meal_cost = input.nextDouble();
        System.out.println("Enter tip percent: ");
        int tip_percent = input.nextInt();
        System.out.println("And now enter the tax percent: ");
        int tax_percent = input.nextInt();

        // Lets solve

        int foodCost = (int)Math.round(meal_cost);
        int tip = foodCost * tip_percent /100;
        int tax = foodCost * tax_percent /100;

        int totalCost = foodCost + tip + tax;

        System.out.println("The total cost of food is $" + totalCost);
        System.out.println("THANK YOU!");



    }

}

