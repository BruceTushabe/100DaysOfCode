

/* Write a program that prints the numbers from 1 to 100 and for multiples of ‘3’ 
print “Fizz” instead of the number and for the multiples of ‘5’ print “Buzz”. */


class fizz {

    public static void main(String[] args) {

        int n = 100;

        // loop for 100 times

        for (int i = 1; i <= n; i++){

            if (i%3==0)
            System.out.println("Fizz");

            else if (i%5== 0)
            System.out.println("Buzz");

            else System.out.println(i);
    
        }
        
    }
    
}
