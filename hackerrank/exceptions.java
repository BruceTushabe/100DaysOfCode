public class exceptions{

    public static void main(String args[]) {

        try{
            // code that may rise exception

            int data = 100/0;

        } catch(ArithmeticException e)
        {System.out.println(e);}

        // Rest of the code

        System.out.println("Rest of the code.....");
    }
}