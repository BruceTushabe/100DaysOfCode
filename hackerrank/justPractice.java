public class car {

    int maxSpeed = 180;
    int minSpeed = 0;
    double weight = 4089;
    boolean isTheCarOn = false;
    char condition = 'A';


    public void printVariables(){

        System.out.println("This car has max speed og: " + maxSpeed + " weight of " + weight + "and could be running? " + isTheCarOn);

    }

    public static void main(String[] args) {

        Car kia = new car();
        kia.printVariables();
    
    }
    
}
