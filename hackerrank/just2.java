package hackerrank;

import java.security.Key;
import java.util.*;

class just2 {

    // Get the count of all rectangles

    public static int getCount(int rows, int columns, int[][] sides) {
        // Initialise the result value map to store the ration to the rectangles

        int res = 0;
        Map<Double, Integer> ratio
                = new HashMap<Double, Integer>();
        // Calculate the rectangular ratio and save them

        for (int i = 0; i < rows; i++) {
            double rectRatio = (double) sides[i][0] /
                    sides[i][1];

            if (ratio.get(rectRatio) == null) {
                ratio.put(rectRatio, 0);
            }

            ratio.put(rectRatio, ratio.get(rectRatio) + 1);

            // Calculate pairs of similar rectangles from its common ratio

            for (double key : ratio.keySet()) {
                int val = ratio.get(key);

                if (val > 1) {
                    res += (val * (val - 1)) / 2;
                }
            }


            return res;

        }

        public static void main(String args[]){

            int [][] A = {{4,8}, {10, 20}, {15, 30}, {3, 6}};

            int columns = 2;
            int rows = 4;

            System.out.println(getCount(rows, columns, A));


        }
    }

}
