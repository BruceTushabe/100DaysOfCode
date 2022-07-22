package org.encap; 

// Records in Java in action

public class Main {

    public static void main(String[] args){

        var cars = new Cars("Range Rover", 100000,2022);

        cars.model();
        cars.price();
        cars.year();

        System.out.println("I would like to get 2 SUVs of " + cars.model());
        System.out.println("My goal is to raise " + cars.price());
        System.out.println("I am particularly interested in the " + cars.year());

    }

}
