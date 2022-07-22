package Encapsulation;

public class Main {

    public static void main(String[] args){

        employee e = new employee();

        e.setName("Bruce");
        e.setId(1888);
        e.setSalary(120000);

        System.out.println("Name: " + e.getName());
        System.out.println("ID: " + e.getId());
        System.out.println("Salary: " + e.getSalary());

    }
}
