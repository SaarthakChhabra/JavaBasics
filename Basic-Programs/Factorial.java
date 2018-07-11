package javabasics;

/**
 *
 * @author Saarthak
 */
import java.util.Random;
import java.util.Scanner;
public class Factorial 
{
    public static void main(String[] args) 
    {/*
        int n, f = 1;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        System.out.println("Enter a number: "+n);
        
        for (int i = 1; i <= n; i++) 
        {
            f = f*i;
            
        }
        System.out.println("Factorial: "+f);
       */
        
        //Square of a number
        int n;
        Random ss = new Random();
        n = ss.nextInt(10);
        System.out.println("Enter a number: "+n);
        
        int nn = n*n;
        int nnn = nn*n;
        System.out.println("Square and cube of the number: "+nn+" and "+nnn);
    }
         
        
    
}
