package com.bridgelabz.palindromchecker;

import java.util.Scanner;

public class PalindromChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<Character> characterDeque = new Deque<>();
        System.out.println("Enter any string to check wheather it is palindrom or not");
        String string = scanner.next();
        for(int i = 0; i < string.length(); i++ ){
            char character = string.charAt(i);
            characterDeque.addRear(character);
        }

        int flag = 0;

        while (characterDeque.size() > 1) {
            if (characterDeque.removeFront() != characterDeque.removeRear()) {
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is not palindrome");
        }
    }
}
