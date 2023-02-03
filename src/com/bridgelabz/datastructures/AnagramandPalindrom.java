package com.bridgelabz.datastructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AnagramandPalindrom {

    public static int anagramDetection(String str1, String str2) {
        // base case
        if (str1 == null || str1.length() == 0) {
            return 0;
        }
        List<String> partial = new ArrayList<>();
        partial.add(String.valueOf(str1.charAt(0)));
        for (int i = 1; i < str1.length(); i++) {
            for (int j = partial.size() - 1; j >= 0; j--) {
                String s = partial.remove(j);
                for (int k = 0; k <= s.length(); k++) {
                    partial.add(s.substring(0, k) + str1.charAt(i) + s.substring(k));
                }
            }
        }
        for (int i = 0; i < partial.size(); i++) {
            // Print all elements of List
            if (partial.get(i).equals(str2)) {
                return 1;
            }
        }
        return 0;
    }

    public static int palindromCheck(int number) {
        int number2 = number;
        int n1, reverse = 0;
        while (number != 0) {
            n1 = number % 10;
            reverse = reverse * 10 + n1;
            number = number / 10;
        }
        if (number2 == reverse) {
            return 1;
        }
        return 0;
    }

    static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % 2 == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        List<Integer> palindrom = new ArrayList<Integer>();
        List<String> anagram = new ArrayList<>();

        Scanner s = new Scanner(System.in);
        int number1 = 0, number2 = 1000;
        for (int j = number1; j <= number2; j++) {
            if (isPrime(j)) {
                if (palindromCheck(j) == 1) {
                    palindrom.add(j);
                }
                String str = String.valueOf(j);
                if (anagramDetection(str, str) == 1) {
                    anagram.add(str);
                }
            }
        }
        System.out.println("Palindrom prime numbers between 0 and 1000 are ");
        System.out.println(palindrom);
        System.out.println("Anagram prime numbers between 0 and 1000 are ");
        System.out.println(anagram);

    }
}
