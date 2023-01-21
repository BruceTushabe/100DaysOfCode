import java.util.Random;

class GenerateRandom{

    public static void main(String args[]) {

        Random rand  = new Random();

        int upperbound = 25;

        // Generating numbers from 0 to 24
        // using nextInt()

        int int_random = rand.nextInt(upperbound);

        // Generating random using nextDouble

        double double_random = rand.nextDouble();

        float float_random = rand.nextFloat();

        System.out.println(int_random);
        System.out.println(double_random);
        System.out.println(float_random);
        

        
    }
}