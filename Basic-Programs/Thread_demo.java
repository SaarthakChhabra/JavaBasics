package javabasics;

import java.util.Scanner;

class Account
{
    private int bal;
    public Account(int bal)
    {
        this.bal = bal;
    }
    
    public boolean isSufficientBalance(int w)
    {
        if(bal>w)
            return(true);
        else
            return(false);
    }
    
    public void withdraw(int amt)
    {
        bal = bal-amt;
        System.out.println("Withdrawal money is: "+amt);
        System.out.println("Your current balance is: "+bal);
    }    
    
}


class Customer implements Runnable
{
    private Account account;
    public Customer(Account account)
    {
        this.account = account;
    }
    
    public void run()
    {
        Scanner kb = new Scanner(System.in);
        
        System.out.println("Enter amount to withdraw: ");
        int amt =kb.nextInt();
        synchronized(account)
        {
            if(account.isSufficientBalance(amt))
                account.withdraw(amt);
            else
                System.out.println("Insufficient balance");
        }
    }
}


public class Thread_demo
{
    public static void main(String[] args) 
    {
        Account a1 = new Account(1000);
        Customer c1 = new Customer(a1), c2 = new Customer(a1);
        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        t1.start();
        t2.start();
    }
}