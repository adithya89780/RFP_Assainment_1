package com.bridgelabz;

import java.util.Scanner;

public class PowerOf2 {
    public static void main(String[] args) {

        // read in one command-line argument
        int n = 6;

        System.out.println(" 2 Power of :" );


        int i = 0;                // count from 0 to N
        int powerOfTwo = 1;       // the ith power of two

        // repeat until i equals n
        while (i <=n) {
            System.out.println(i + " " + powerOfTwo);
            powerOfTwo = 2 * powerOfTwo;                // double to get the next one
            i = i + 1;
               // print out the power of two
        }
    }
}