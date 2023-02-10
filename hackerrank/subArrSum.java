//find the sum of all sub-arrays of the given array. 

public class subArrSum {

    // Computes sum all sub-array
    public static long SubArraySum(int arr[], int n)
    {
        long result = 0, temp = 0;

        // Pick starting point
        for (int i = 0; i < n; i++) {
            // Pick ending point
            temp = 0;
            for (int j = i; j < n; j++) {
                // sum subarray between current
                // starting and ending points
                temp += arr[j];
                result += temp;
            }
        }
        return result;
    }

    /* Driver code */
    public static void main(String[] args)
    {
        int arr[] = { 1, 2, 3 };
        int n = arr.length;
        System.out.println("Sum of SubArray : "
                + SubArraySum(arr, n));
    }
}
