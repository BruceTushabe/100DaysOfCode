import java.util.Scanner;

public class findDivisable {

    public static void main(String[] args) {


        System.out.println("Enter a number divisible by 2: ");

        Scannner sc = new Scanner(System.in);
        int x = input.nextInt();
        
        if (x % 2 == 0)
          System.out.println("The integer you entered is divisible by 2");
        

        else 
            System.out.println("The integer you entered is not divisible by 2, enter another");

            if (x % 5 == 0)
                {System.out.println("The integer you entered is divisible by 5");}
            
            else {
                
                System.out.println("The integer you entered is not divisible by 5");
            
            
        }
    }
    
}
