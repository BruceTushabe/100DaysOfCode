package hackerrank;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        // printing the original array
        System.out.println("Original array: " + Arrays.toString(numbers));

        // modifying the first element
        numbers[0] = 10;

        // printing the modified array
        System.out.println("Modified array: " + Arrays.toString(numbers));
    }
}