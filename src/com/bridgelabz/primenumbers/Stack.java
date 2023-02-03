package com.bridgelabz.primenumbers;

public class Stack<E extends Comparable<E>> {
    LinkedList<E> stack;

    public Stack(){
        stack = new LinkedList<>();
    }


    public void push(E key) {
        stack.push(key);
    }

    public void peak() {
        System.out.println("Peak element is " + stack.head.key);
    }

    public void pop() {
        Node<E> temp = stack.head;
        stack.head = temp.next;
        temp.next = null;
        System.out.println("Element popped successfully");
    }

    public int isEmplty(){
        if( stack.size() == 0 ){
            return 0;
        }
        return 1;
    }
}
