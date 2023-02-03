package com.bridgelabz.orderedlist;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;
import java.util.*;

public class OrderedListMain {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        OrderedList<Integer> stringUnorderedList = new OrderedList<>();
        Scanner scanner = new Scanner(new File("D:\\Day16-17PracticeProblems\\src\\com\\bridgelabz\\orderedlist\\data.txt"));
        while (scanner.hasNextInt()) {
            stringUnorderedList.append(scanner.nextInt());
        }
        stringUnorderedList.display();
        stringUnorderedList.ascendingOrderList();
        stringUnorderedList.display();
        System.out.println("Enter an integer to search in a list");
        int integer = s.nextInt();

        if (stringUnorderedList.searchKey(integer)) {
            stringUnorderedList.deleteNode(integer);
        } else {
            stringUnorderedList.add(integer);
        }
        stringUnorderedList.display();
   }
  }
