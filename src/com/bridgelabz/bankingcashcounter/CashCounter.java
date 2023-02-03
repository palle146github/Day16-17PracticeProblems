package com.bridgelabz.bankingcashcounter;

public class CashCounter<E> {

    public Node front, rear;
    public int size;

    /* Constructor */
    public CashCounter() {
        front = null;
        rear = null;
        size = 0;
    }

    /*  Function to check if queue is empty */
    public boolean isEmpty() {
        return front == null;
    }

    /*  Function to get the size of the queue */
    public int getSize() {
        return size;
    }

    /*  Function to insert an element to the queue */
    public void deposit(int data) {

        if (front == null) {
            Node newNode = new Node(data);
            front = newNode;
            rear = newNode;
        } else {
            Node temp = front, prev = null;
            int balance = rear.amount + data;
            Node newNode = new Node(balance);
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }
    public void display() {
        Node temp = front, prev = null;
        if (temp == null) {
            System.out.println("0 Rupees");
        }
        else{
            while (temp != null) {
                prev = temp;
                temp = temp.next;
            }
            System.out.println("Balance Amount :" + prev.amount);

        }
    }

    public void withdraw(int amount)
    {
        Node temp = front, prev = null;
        if (temp == null) {
            System.out.println("Balance is 0 Rupees");
        }
        else{
            rear.amount = rear.amount - amount;
            rear.next = null;
            size++;
        }
    }
}

    /*  Function to remove front element from the queue */

//
//    /*  Function to check the front element of the queue */
//    public int peek()
//    {
//        if (isEmpty())
//        {
//            throw new NoSuchElementException("Underflow Exception");
//        }
//        return front.getData();
//    }
//

//
//    /*  Function to display the status of the queue */
//    public void displays()
//    {
//        int ptr1=0;
//        System.out.print("Available Balance = ");
//        if (size == 0)
//        {
//            System.out.print("Empty");
//            return ;
//        }
//        Node ptr = front;
//        while (ptr != rear.getLink() )
//        {
//            ptr1=ptr1+ptr.getData();
//            System.out.println(ptr1);
//            ptr = ptr.getLink();
//        }
//        System.out.println();
//    }
//}
