package com.bridgelabz.primenumbers;

public class Queue<E extends Comparable<E>> {
    LinkedList<E> queue;

    public Queue(){
        queue = new LinkedList<>();
    }

    public void enqueue(E key) {
        queue.append(key);
    }

    public void dequeue() {
        queue.popFirst();

    }
}
