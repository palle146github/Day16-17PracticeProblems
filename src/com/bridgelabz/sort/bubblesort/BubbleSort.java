package com.bridgelabz.sort.bubblesort;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    static void bubbleSort(int[] arr) throws FileNotFoundException {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    //swap elements
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
    }
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\Day16-17PracticeProblems\\src\\com\\bridgelabz\\sort\\bubblesort\\bubblesort.txt");
        Scanner scan = new Scanner(file);
        String[] lineArray = new String[0];
        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            lineArray = line.split(" ");
        }
        int[] ints = new int[lineArray.length];
        for (int i = 0; i < lineArray.length - 1; i++) {
            ints[i] = Integer.parseInt(lineArray[i]);
        }
        bubbleSort(ints);
        for (int i = 0; i < ints.length - 1; i++) {
            System.out.println(i + " " + ints[i]);
        }
    }
}
