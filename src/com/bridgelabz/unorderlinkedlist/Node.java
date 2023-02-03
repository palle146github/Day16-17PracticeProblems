package com.bridgelabz.unorderlinkedlist;

public class Node<E> {

    public E data;
    public Node<E> nextNode;

    //constructor
    public Node(){

    }
    public Node( E data) {
        this.data = data;
        this.nextNode = null;
    }
}
