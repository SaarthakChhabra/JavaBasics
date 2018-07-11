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
public class trianglePattern1 {
    /*Pattern printed - 
    
            *
           * *
          * * *
         n = 3(here)
    */
    public static void main(String[] args) {
//        int row, c, temp;
//        int n = 8;
//        temp = n;
//        for (row = 1; row <= n; row++) {
//            for(c = 1; c < temp; c++){
//                System.out.print(" ");
//            }
//            temp--;
//            for (c = 1; c <= 2*row-1; c++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        int k = 1;
        for (int i = 1; i < 5; i++) {
            for(int j = 0; j<=k; j+=2)
                System.out.print("*");
            k = k+2;
            System.out.println("");
        }
    }
    
}
