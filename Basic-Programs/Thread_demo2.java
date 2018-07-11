package javabasics;

class A implements Runnable
{
    public void run()
    {
        for (int i = 0; i < 10; i++) 
        {
            System.out.println("Thread A:- "+i);
        }
    }
}

class B implements Runnable
{
    public void run()
    {
        for (int i = 0; i < 10; i++) 
        {
            for (int j = 0; j < 10; j++) 
            {
                System.out.println("Thread B:- "+j);
            }
        }
    }
}
public class Thread_demo2 
{
    public static void main(String[] args) 
    {
        Thread a = new Thread(new A());
        Thread b = new Thread(new B());
        a.start();
        b.start();
        a.setPriority(10);//10 is maximum, 5 is normal and 0 is minimium
        b.setPriority(1);
        
    }
}
