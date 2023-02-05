package hackerrank;

public class Car {

    int maxSpeed = 180;
    int minSpeed = 0;
    double weight = 4089;
    boolean isTheCarOn = false;
    char condition = 'A';


    double maxFuel = 16;
    double currentFuel = 8;
    double npg = 26.4;

    int numberOfPeopleInCar = 1;
    public void printVariables(){

        System.out.println("This car has max speed og: " + maxSpeed); 
        System.out.println(" weight of " + weight);  
        System.out.println("Is the Car Running ? " + isTheCarOn);
        System.out.println("What condition is it in " + condition);
    
    }

    public void upgradeMinSpeed (){
        minSpeed = maxSpeed;
        maxSpeed = maxSpeed + 1;
    }

    public static void main(String[] args) {

        Car familyCar = new Car();
        System.out.println("This is the family car: ");
        familyCar.printVariables();
        familyCar.upgradeMinSpeed();
        familyCar.printVariables();
    
    }
    
}
