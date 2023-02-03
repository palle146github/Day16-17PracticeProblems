package com.bridgelabz.datastructures;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import static com.bridgelabz.datastructures.Permutations.recursivePermutations;

public class AnagramDetection {
    public static int anagramDetection (String str1, String str2){
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
           if(partial.get(i).equals(str2)){
               return 1;
           }
        }
        return 0;
    }
    public static void main(String[] args) {
        if(anagramDetection("abcd","dcba") == 1){
            System.out.println("Two strings are Anagrams");
        }
        else{
            System.out.println("Two strings are not Anagrams");
        }
    }
}

