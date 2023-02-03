package com.bridgelabz.orderedlist;

public class Node<E> {

    public int data;
    public Node<E> nextNode;

    //constructor
    public Node() {
        this.nextNode = null;
    }

    public Node(int data) {
        this.data = data;
        this.nextNode = null;
    }
}
