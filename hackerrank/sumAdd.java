import java.io.*;
import java.util.*;

public class sumAdd {
 

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter integer a: ");
        int a = input.nextInt();
        System.out.println("And now enter inter b");
        int b = input.nextInt();

        System.out.println(Integer.sum(a,b));

        input.close();

    }
}
