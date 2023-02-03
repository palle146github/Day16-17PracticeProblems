package com.bridgelabz.primenumbers;

import java.util.Arrays;

public class QueueMain {
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
    static boolean areAnagrams(int a, int b)
    {
        // Converting numbers to strings
        char[] c = (String.valueOf(a)).toCharArray();
        char[] d = (String.valueOf(b)).toCharArray();
        Arrays.sort(c);
        Arrays.sort(d);
        return (Arrays.equals(c, d));
    }
    public static void main(String[] args) {
    Queue<Integer> integerQueue = new Queue<>();
        int A[][] = new int[1000][1];
        int B[] = new int[1000];
        int C[][] = new int[1000][3];
        int i = 0, j;
        int k = 1;
        while (i < 1000) {
            if (isPrime(k) == true) {
                B[i] = k;
                C[i][0] = k;
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
        for( i = 0; i < 1000; i++){
            int c = 0;
            int one = A[i][0];
            for( j = 0; j < 1000; j++){
                int two = A[j][0];
                if(areAnagrams(one,two)){
                    c++;
                }
            }
            if( c >= 2){
                integerQueue.enqueue(A[i][0]);
            }
        }
        integerQueue.queue.display();
    }
}
