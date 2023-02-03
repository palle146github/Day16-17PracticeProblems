package com.bridgelabz.unorderlinkedlist;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UnorderListMain {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        UnorderedList<String> stringUnorderedList = new UnorderedList<>();
        stringUnorderedList.readFileandAddintoListasNode();
        stringUnorderedList.display();
        System.out.println("Enter element to search in the file ");
        String element = scanner.next();
        if (stringUnorderedList.searchKey(element)) {
            stringUnorderedList.deleteNode(element);

        } else {
            stringUnorderedList.push(element);
        }
        stringUnorderedList.display();

    }
}
