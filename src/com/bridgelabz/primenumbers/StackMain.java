package com.bridgelabz.primenumbers;

public class StackMain {
    public static boolean isPrime(int n) {
        int c = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                c++;
        }
        if (c == 2)
            return true;
        else
            return false;
    }


    public static void main(String[] args) {

        Stack<Integer> integerStack = new Stack<>();

        int i = 0, j;
        int k = 1;
        while (i < 1000) {
            if (isPrime(k) == true) {
                integerStack.push(k);
                i++;
            }
            k++;
        }
        System.out.println("Prime numbers in reverse orders");
        integerStack.stack.display();
        System.out.println("Number of Prime numbers in Stack " + integerStack.stack.size());
    }
}
