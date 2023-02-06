package com.bridgelabz.sort.mergesort;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;


public class MergeSort {
    static void merge(String[] a, int beg, int mid, int end)
    {
        int i, j, k;
        int n1 = mid - beg + 1;
        int n2 = end - mid;

        //temporary arrays
        String[] LeftArray = new String [n1];
        String[] RightArray = new String [n2];

        /* copy data to temp arrays */
        for (i = 0; i < n1; i++)
            LeftArray[i] = a[beg + i];
        for (j = 0; j < n2; j++)
            RightArray[j] = a[mid + 1 + j];

        i = 0; /* initial index of first sub-array */
        j = 0; /* initial index of second sub-array */
        k = beg;  /* initial index of merged sub-array */

        while (i < n1 && j < n2)
        {
            int compare = LeftArray[i].toUpperCase().compareTo(RightArray[j].toUpperCase());
            if( compare <= 0)
            {
                a[k] = LeftArray[i];
                i++;
            }
            else
            {
                a[k] = RightArray[j];
                j++;
            }
            k++;
        }
        while (i<n1)
        {
            a[k] = LeftArray[i];
            i++;
            k++;
        }

        while (j<n2)
        {
            a[k] = RightArray[j];
            j++;
            k++;
        }
    }

    static void mergeSort(String[] a, int beg, int end)
    {
        if (beg < end)
        {
            int mid = (beg + end) / 2;
            mergeSort(a, beg, mid);
            mergeSort(a, mid + 1, end);
            merge(a, beg, mid, end);
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("D:\\Day16-17PracticeProblems\\src\\com\\bridgelabz\\sort\\mergesort\\mergesort.txt");
        Scanner scan = new Scanner(file);
        String[] lineArray = new String[0];
        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            lineArray = line.split(",");
        }
        String[] strAr = {"Ani", "Sam", "Joe"};
        mergeSort(lineArray,0, lineArray.length - 1);
        for (int i = 0; i < lineArray.length; i++) {
            System.out.println(i + " " + lineArray[i]);
        }
    }
}

