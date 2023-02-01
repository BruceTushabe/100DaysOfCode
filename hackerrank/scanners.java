import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        int i = 4;
        double d = 4.0;
        String s = "HackerRank";
        
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        System.out.println(x + i);
        
        Scanner db = new Scanner(System.in);
        double y = db.nextDouble();
        System.out.println(d + y);
        
        Scanner st = new Scanner(System.in);
        String z = st.nextLine();
        System.out.println(s + z);
    }
}