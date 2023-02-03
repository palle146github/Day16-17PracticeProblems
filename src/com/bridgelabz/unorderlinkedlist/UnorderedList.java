package com.bridgelabz.unorderlinkedlist;

import java.io.BufferedReader;
import java.io.File;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UnorderedList<E> {
    Node<E> head;
    Node<E> tail;

    public void push(E key) {
        Node<E> newNode = new Node<>(key);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.nextNode = head;
            head = newNode;
        }
    }

    public void append(E key) {
        Node<E> newNode = new Node<>(key);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.nextNode = newNode;
            tail = newNode;
        }
    }

    public void display() {
        Node<E> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.nextNode;
        }
        System.out.println("");
    }

    public boolean searchKey(E searchKey) {
        Node<E> temp = head;
        while (temp.nextNode != null) {
            if (temp.data.equals(searchKey)) {
                return true;
            }
            temp = temp.nextNode;
        }
        return false;
    }

    void deleteNode(E key) {
        Node<E> temp = head, prev = null;

        if (temp != null && temp.data.equals(key)) {
            head = temp.nextNode; // Changed head
            return;
        }
        while (temp != null && temp.data.equals(key) != true) {
            prev = temp;
            temp = temp.nextNode;
        }
        if (temp == null)
            return;
        prev.nextNode = temp.nextNode;
    }

    public void addElement(E insertElement, E searchElement) {
        Node<E> temp = head;
        Node<E> newNode = new Node<>(insertElement);
        while (temp.nextNode != null) {
            if (temp.data.equals(searchElement)) {
                Node<E> temp2 = temp.nextNode;
                temp.nextNode = newNode;
                newNode.nextNode = temp2;
                break;
            }
            temp = temp.nextNode;
        }
    }

    public void readFileandAddintoListasNode() throws IOException {
        FileInputStream fstream = new FileInputStream("D:\\Day16-17PracticeProblems\\src\\com\\bridgelabz\\unorderlinkedlist\\data.txt");
        DataInputStream in = new DataInputStream(fstream);
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String strLine;
        while ((strLine = br.readLine()) != null) {
            String[] splitOut = strLine.split(" ");
            for (int i = 0; i < splitOut.length; i++) {
                append((E) splitOut[i]);
            }
        }
    }
}



