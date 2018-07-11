
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Saarthak
 */
public class reverseString {
    public static void main(String[] args) {
        String inp = "Hello, how are you?";
        //1ST METHOD
        StringBuffer s = new StringBuffer();
        s.append(inp);
        s.reverse();
        System.out.println(s);
        
        //2ND METHOD
//        char[] ch = inp.toCharArray();
//        for (int i = ch.length-1; i >= 0; i--) {
//            System.out.printl(ch[i]);
//        }

        //3RD METHOD
//        char[] ch = inp.toCharArray();
//        int left = 0;
//        int right = ch.length-1;
//        for(left = 0; left < right; left++, right--){
//            
//            char temp = ch[left];
//            ch[left] = ch[right];
//            ch[right] = temp;
//        }
//        System.out.println(ch);

        //4TH METHOD
//        char[] ch = inp.toCharArray();
//        List<Character> l = new ArrayList<>();
//        for(char c : ch){
//            l.add(c);
//        }
//        
//        Collections.reverse(l);
//        ListIterator i = l.listIterator();
//        while(i.hasNext()){
//            System.out.print(i.next());
//        }
    }
    
}
