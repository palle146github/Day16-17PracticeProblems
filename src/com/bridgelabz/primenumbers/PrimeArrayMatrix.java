package com.bridgelabz.primenumbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeArrayMatrix {
    boolean isPrime(int n) {
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

    public static void main(String args[]) throws IOException {
        PrimeArrayMatrix ob = new PrimeArrayMatrix();
        int A[][] = new int[1000][1];
        int B[] = new int[1000];
        int i = 0, j;
        int k = 1;
        while (i < 1000) {
            if (ob.isPrime(k) == true) {
                B[i] = k;
                i++;
            }
            k++;
        }
        int x = 0;
        for( i = 0; i < 1000; i++){
            for( j = 0; j < 1; j++){
                A[i][j] = B[x];
                x++;
            }
        }
        System.out.println("Index    :  Prime number");
        for( i = 0; i < 1000; i++){
            for( j = 0; j < 1; j++){
                System.out.println(i+1 + "        :  " + A[i][j]);
            }
        }
    }
}
