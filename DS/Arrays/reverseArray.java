/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DS.Arrays;

/**
 *
 * @author Saarthak
 */
import java.util.*;
public class reverseArray {
    
      /* First way to reverse a string using stringbuilder*/
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder ss = new StringBuilder();
        ss.append(s);
        
        ss.reverse();
        for (int i = 0; i < ss.length(); i++) {
            System.out.print(ss.charAt(i));
        }
            
    }
    
    /* Sencond way to reverse a string*/
//    public static void main(String[] args) {
//        String s = "What's up";
//        char arr[] = s.toCharArray();
//        for (int i = arr.length-1; i >= 0; i--) {
//            System.out.print(arr[i]);
//        }
//    }
    
}
