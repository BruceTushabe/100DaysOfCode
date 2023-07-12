package com.arrays;

import java.util.*;

class JavaArray{
    public static void main(String[] args){

        // Array Declaaration
        int[] priceOfGoat = new int[5];
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter 5 members of an array: ");

            for (int i=0; i < priceOfGoat.length; i++ )
            priceOfGoat[i] =  sc.nextInt();
        }

        for (int i=0; i < priceOfGoat.length; i++)
        System.out.println(priceOfGoat[i] + "");
    }
}