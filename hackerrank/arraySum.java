


public class arraySum {

    static int arr[] = {12, 3, 4, 15};
    // method for sum of elements in ana array

    static int sum()
    {
        int sum = 0; // initialise sum
        int i;

        // iterate through all elements and add them to sum

        for( i = 0; i < arr.length; i++)
        sum += arr[i];

        return sum;
    }
    // Driver method

    public static void main(String[] args){

        System.out.println("Sum of a given array is" + sum());

    }
}