import java.util.Scanner;
import java.io.*;
import java.math.*;

class operators {

    public static void main(String[] args) {
    // Write your code here
    
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Kindly Enter the Meal Cost before Tip and Taxes: ");
    double mealCost = scan.nextDouble();
    System.out.println("So what is the Tip Percent: ");
    int tipPercent = scan.nextInt();
    System.out.println("Okay, what is tax taken by Uganda on this: ");
    int taxPercent = scan.nextInt();

    scan.close();

    double tip = mealCost * tipPercent / 100;
    double tax = mealCost * taxPercent /100;
    double total = mealCost + tip + tax;

    // turning total into int

    int totalCost = (int) Math.round(total);

    System.out.println("Wow, you are supposed to pay this amount: " + totalCost);
    System.out.println("Thank you for being our good Customer: You are Great!");
        

    }

}

