
class TestingArrya {
    public static void main(String[] arg) {

        // declare an array of integers

        int[] arr;

        // allocating memoery for 5 integers

        arr = new int[5];

        // initialise the first elements of an array

        arr[0] = 10;

        // initialise the second element of an array

        arr[1] =21;

        arr[2] = 13;
        arr[3] = 17;
        arr[4] = 35;

        // accessing the lements of the specified Array

        for (int i = 0; i < arr.length; i++)
        System.out.println("Element at index " + i + ":" + arr[i]);
    }
}