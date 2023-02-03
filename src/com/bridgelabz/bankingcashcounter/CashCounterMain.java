package com.bridgelabz.bankingcashcounter;
import java.util.*;

public class CashCounterMain {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        CashCounter q=new CashCounter();
        int ch = 0;
        do
        {
            System.out.println();
            System.out.println("------------Banking Cash Counter-----------");
            System.out.println("1.Deposit");
            System.out.println("2.Withdraw");
            System.out.println("3.Balance");
            System.out.println("4.Number of people in the Queue ");
            System.out.println("5.Exit");
            System.out.println();
            System.out.println("Enter your choice: ");
            int choice=s.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.println("Enter the amount you want to Deposit");
                    int depositAmount = s.nextInt();
                    q.deposit(depositAmount);
                    q.display();
                    break;
                case 2:
                    System.out.println("Enter the amount you want to Withdraw ");
                    int withdrawAmount = s.nextInt();
                    q.withdraw(withdrawAmount);
                    q.display();
                    break;
                case 3:
                    q.display();
                    break;
                case 4:
                    int j=q.getSize();
                    System.out.println("The Number of People in Queue is: "+j);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("You entered wrong choice");
                    break;
            }
        }
        while(ch<6);
    }
}
