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
public class Dating_age {

    public static void main(String[] args) {
        int my_age, allowed_age;
        
        
        for ( my_age = 25; my_age <= 65; my_age+=5) {
            
            allowed_age = my_age / 2 + 7;
            System.out.println("My age: " + my_age);
            System.out.println("Allowed age: "+ allowed_age);
            
            
        }
        
    }
    
}
