/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Saarthak
 */
public class reverseStringWordbyWord {
    
    public StringBuffer reverse(String s){
        String[] splitS = s.split(" ");
        
        StringBuffer sBuffer = new StringBuffer();
        for(int i = splitS.length-1; i >= 0; i--){
            sBuffer.append(splitS[i]);
            sBuffer.append(" ");
        }
        return sBuffer;
    }
    public static void main(String[] args) {
        String s = "What is the matter";
        reverseStringWordbyWord obj = new reverseStringWordbyWord();
        System.out.print(obj.reverse(s));
    }
    
}
