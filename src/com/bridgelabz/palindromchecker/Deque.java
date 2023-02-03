package com.bridgelabz.palindromchecker;

public class Deque<E extends Comparable<E>> {

    Node<E> front;
    Node<E> rear;
    int size = 0;

    //add front
    public void addFront(E c) {
        Node<E> newNode = new Node<>(c);
        if (front == null) //if no element in list
        {
            front = newNode;
            rear = newNode;
        } else  //if element in list
        {

            newNode.next = front;
            front.prev = newNode;
            front = newNode;
        }
        size++;
    }

    public void addRear(E key) {// add element at the rearer side
        Node<E> newNode = new Node<>(key);
        if (front == null) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            newNode.prev = rear;
            rear = newNode;
        }
        size++;
    }

    public void display() {
        Node<E> temp = front;
        while (temp != null) {
            System.out.print(temp.key + " -> ");
            temp = temp.next;
        }
        System.out.println("");
    }

    //remove front
    public E removeFront() {
        E val = null;
        if (front == null) {
            System.out.println("No elements to delete");
        } else {
            val = front.key;
            front = front.next;
        }
        size--;
        return val;
    }

    public E removeRear() {
        E val = null;
        if (front == null) {
            System.out.println("No element to delete");
        } else {
            val = rear.key;
            rear = rear.prev;
            rear.next = null;
        }
        size--;
        return val;
    }

    //to remove
    public boolean isEmpty() {
        if (front == null) return true;
        else return false;
    }

    //return size of deque
    public int size() {
        return size;
    }
}
