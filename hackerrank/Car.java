package hackerrank;

public class Car {

    int maxSpeed = 180;
    int minSpeed = 0;
    double weight = 4089;
    boolean isTheCarOn = false;
    char condition = 'A';


    public void printVariables(){

        System.out.println("This car has max speed og: " + maxSpeed); 
        System.out.println(" weight of " + weight);  
        System.out.println("Is the Car Running ? " + isTheCarOn);
        System.out.println(condition);
    
    }

    public static void main(String[] args) {

        Car kia = new Car();
        kia.printVariables();
    
    }
    
}
