/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasics;

/**
 *
 * @author Saarthak
 */
public class Swapping {
    
    public static void main(String[] args) {
        int i=2;
        int j=3;
        int temp; 
        
        System.out.println("Before Swapping: " + i +" "+ j);
        
        temp = i;
        i = j;
        j = temp;
        System.out.println("After swapping: "+i+" "+j);
        
        
    }

    
}
