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

public class OrderedList<E> {
    Node<E> head;
    Node<E> tail;
    int size = 0;

    public void push(int key) {
        Node<E> newNode = new Node<>(key);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.nextNode = head;
            head = newNode;
        }
    }

    public void append(int key) {
        Node<E> newNode = new Node<>(key);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.nextNode = newNode;
            tail = newNode;
        }
        size++;
    }



    public void display() {
        Node<E> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.nextNode;
        }
        System.out.println("");
    }

    public boolean searchKey(int searchKey) {
        Node<E> temp = head;
        while (temp.nextNode != null) {
            if (temp.data == searchKey) {
                return true;
            }
            temp = temp.nextNode;
        }
        return false;
    }




    public void ascendingOrderList() {
        Node current = head, index = null;
        int temp;
        if (head == null) {
            return;
        } else {
            while (current != null) {
                index = current.nextNode;
                while (index != null) {
                  if (current.data > index.data) {
                        temp = current.data;
                        current.data = index.data;
                        index.data = temp;
                    }
                    index = index.nextNode;
                }
                current = current.nextNode;
            }
        }
    }

    void deleteNode(int key) {
        Node<E> temp = head, prev = null;

        if (temp != null && (temp.data == key)) {
            head = temp.nextNode; // Changed head
            return;
        }
        while (temp != null && (temp.data == key)) {
            prev = temp;
            temp = temp.nextNode;
        }
        if (temp == null)
            return;
        prev.nextNode = temp.nextNode;
        size--;
    }

    public void add(int Key) {
        int position = 0;
        Node<E> temp = head;
        for(int i = 0; i < size; i++) {
            if(temp.data > Key) {
                position = i;
                break;
            }else {
                position = i+1;
            }
            temp = temp.nextNode;
        }
        addAtPosition(position, Key);
    }
    public boolean addAtPosition(int position, int Key) {
        Node<E> newNode = new Node<>(Key);
        if(position == 0) {
            push(Key);
        }else if(position == size) {
            append(Key);
        }else {
            Node<E> temp = head;
            for(int i = 0; i < position - 1; i++) {
                temp = temp.nextNode;
            }
            Node<E> temp1 = temp.nextNode;
            temp.nextNode = newNode;
            newNode.nextNode = temp1;
        }
        return true;
    }



//    public void readFileandAddintoListasNode() throws IOException {
//        Scanner scanner = new Scanner(new File("D:\\Day16-17PracticeProblems\\src\\com\\bridgelabz\\orderedlist\\data.txt"));
//            while(scanner.hasNextInt()){
//                append((E)scanner.nextInt());
//            }
//        }
    }

