package com.bridgelabz.sort.binarysearch;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    static int binarySearch(String[] arr, String x)
    {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            int res = x.compareTo(arr[m]);
            // Check if x is present at mid
            if (res == 0)
                return m;
            // If x greater, ignore left half
            if (res > 0)
                l = m + 1;
                // If x is smaller, ignore right half
            else
                r = m - 1;
        }
        return -1;
    }
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("D:\\Day16-17PracticeProblems\\src\\com\\bridgelabz\\sort\\binarysearch\\binarysearch.txt");
        Scanner scan = new Scanner(file);
        String[] lineArray = new String[0];
        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            lineArray = line.split(",");
        }
        Arrays.sort(lineArray);
        Arrays.stream(lineArray).toArray();
        for (int i = 0; i < lineArray.length - 1; i++) {
            System.out.println(i + " " + lineArray[i]);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word to search");
        String searchString = scanner.next();
        int result = binarySearch(lineArray, searchString);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at " + " index " + result);
    }
}