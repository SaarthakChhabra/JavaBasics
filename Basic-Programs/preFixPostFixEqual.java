/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasics;

import java.util.Scanner;

/**
 *
 * @author Saarthak
 */
public class preFixPostFixEqual {
    public static void checkPrefix(String str){
        int size = 0;
        for (int i = 1; i <= str.length() - 1; i++) {
            if(str.substring(0, i).contentEquals(str.substring(str.length() - i, str.length()))){
                size = str.substring(0, i).length();
                continue;
            }
        }
        System.out.println(size);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int i = 0; i < t; i++) {
            String s1 = s.next();
            checkPrefix(s1);
        }
    }
}
