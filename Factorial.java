package com.bridgelabz;

public class Factorial {
    public static void main(String[] args) {
        int num ;
        num = 5;
        System.out.println("Factorial of "+ num + " is");
        long fact = 1;
        for(int i=1; i<=num; i++){
            fact = fact * i;
        }
        System.out.println("Answer = "+fact);
    }
}
