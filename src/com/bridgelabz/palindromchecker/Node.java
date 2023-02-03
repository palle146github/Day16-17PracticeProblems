package com.bridgelabz.palindromchecker;

public class Node<E extends Comparable<E>> {
    E key;
    Node<E> next;
    Node<E> prev;

    public Node(){
        this.prev = null;
        this.next = null;
    }
    public Node(E key) {
        this.key = key;
    }
}
