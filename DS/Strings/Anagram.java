/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String_ques;

import java.util.Arrays;

/**
 *
 * @author Saarthak
 */
public class Anagram {
    public static void isAnagram(String s1, String s2){
        String copyS1 = s1.replaceAll(" ", "").toLowerCase();
        String copyS2 = s2.replaceAll(" ", "").toLowerCase();
        
        char[] ch1 = copyS1.toCharArray();
        char[] ch2 = copyS2.toCharArray();
        
        boolean status = true;
        if(ch1.length != ch2.length)
            status = false;
        
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        
        status = Arrays.equals(ch1, ch2);
        
        if(status)
            System.out.println(s1+" and "+s2+" are anagrams.");
        else
            System.out.println(s1+" and "+s2+" are not anagrams.");
        
    }
    public static void main(String[] args) {
        isAnagram("Mother In Law", "Hilter Woman");
        isAnagram("keEp", "peeK");
        isAnagram("Toss", "Shot");
        isAnagram("joy", "enjoy");
    }
}
