package hackerrank;
public class just {

    // Function to calculate the count
    // of similar rectangles

    static int getCount (int rows, int columns, int[][] A){
        int res = 0;

        for (int i = 0; i < rows; i++){
            for(int j = 0; i < rows; j++){
                if (A[i][0] * A[j][1] ==
                A[i][i] * A[j][0]){
                    res++;
                }
            }
        } return res;
    }

    public static void main (String arg[]){

        // input
        int[][] A = {{4,8}, {10, 20},
        {15, 30},{3,6}};

        int columns = 2;
        int rows = 4;

        System.out.println(getCount(rows, columns. A));
    }
}
