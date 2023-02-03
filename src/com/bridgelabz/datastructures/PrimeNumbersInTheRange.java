package com.bridgelabz.datastructures;

import java.util.Scanner;

public class PrimeNumbersInTheRange {
    static boolean isPrime(int num){
        if(num < 2 ) {
            return false;
        }
        for( int i = 2 ; i < num; i++){
            if( num % 2 == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number1 = 0, number2 = 1000;
        for( int j = number1; j <= number2; j++){
            if( isPrime(j)){
                System.out.println(" " + j);
            }
        }
    }
}