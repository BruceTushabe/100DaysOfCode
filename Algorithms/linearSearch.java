import java.util.Scanner;

class linear {

    // Function for linear search

    public static int search (int arr[], int x)
    {
        int n = arr.length;

        // Traverse arrar arr[]

        for (int i = 0; i < n; i++) {
            // if element found then
            // return that index

            if ( arr[i] == x)
            return i;
        }
        return -1;
    }

    public static void main (String args[]){

        // Given arr[]

        int arr[] = {2,3,4,10,40};

        // Element to search

        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the Number to Check in the Array: ");
        
        int x = input.nextInt();

        // Function call

        int result = search (arr, x);
        if (result == -1)
        System.out.println("Element is not present in the array");

        else 

        System.out.println("Element is present at index " + result);
    }


    
}
