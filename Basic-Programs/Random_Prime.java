package javabasics;

/**
 *
 * @author Saarthak
 */
import java.util.Random;
public class Random_Prime 
{
    public static void main(String[] args) 
    {
        int n, temp;
        boolean isPrime = true;
    
        Random r = new Random();
        n = r.nextInt(100);
        System.out.println("Number: "+n);
        
        for (int i = 2; i < n/2; i++) 
        {
            temp = n%i;
            if(temp==0)
            {
                isPrime = false;
                break;
            }
            
            
        }
        if(isPrime)
            System.out.println("Number is prime");
        else
            System.out.println("Number is not prime");
    }

}

