package com.bridgelabz.sort.insertionsort;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static String[] insertionSort(String[] array) {
        int f = array.length;
        String temp = "";
        for (int i = 0; i < f; i++) {
            for (int j = i + 1; j < f; j++) {
                if (array[i].compareToIgnoreCase(array[j]) > 0) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("D:\\Day16-17PracticeProblems\\src\\com\\bridgelabz\\sort\\binarysearch\\binarysearch.txt");
        Scanner scan = new Scanner(file);
        String[] lineArray = new String[0];
        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            lineArray = line.split(",");
        }

        insertionSort(lineArray);
        for (int i = 0; i < lineArray.length - 1; i++) {
            System.out.println(i + " " + lineArray[i]);
        }
    }
}