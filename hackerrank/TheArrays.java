package hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class TheArrays {

    public static void main(String[] args){

        String[] colors = new String[5];

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first array: ");
        String arr1 = input.nextLine();
        System.out.println("Now Enter the second one: ");
        String arr2 = input.nextLine();
        System.out.println("Thanks! Lets have the third array now: ");
        String arr3 = input.nextLine();
        System.out.println("Wow, we are making good progress. Bring on the fourth ");
        String arr4 = input.nextLine();
        System.out.println("Thank you for your resilience, one last favour array! Let's enter the fifth array: ");
        String arr5 = input.nextLine();

        colors[0] = arr1;
        colors[1] = arr2;
        colors[2] = arr3;
        colors[3] = arr4;
        colors[4] = arr5;

        System.out.println("Wow, You are awesome! Look at these awesome colors we have! ");
        System.out.println(Arrays.toString(colors));
    }
}
