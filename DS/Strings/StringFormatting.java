/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Saarthak
 */
public class StringFormatting {
    
    public static void findFormattedString(String a, String b) {
        
        try{
        char[] e = a.toCharArray();
        char[] f = b.toCharArray();
        StringBuilder c = new StringBuilder();
        int counter = 0;
        
        for (int i = 0; i < b.length(); i++) {
            
            
            if(f[i] == '{'){
            
                switch (f[i++]) {
                    case ' ':
                        c.append(e[counter]);
                        counter++;
                        break;
                    case '4':
                        c.append("best");
                        break;
                    case '3':
                        c.append("comparison");
                        break;
                    default:
                        break;
                }
            }
            c.append(f[i]);
        }
        
        System.out.println(c);
        
        }catch(ArrayIndexOutOfBoundsException p){}
        
        
//        int start = 0, len = 0;
//        for (int i = 0; i < a.length(); i++) {
//            
//            if(a.substring(i)==" "){
//                c.append(a.substring(start, len));
//                while(i<a.length() && a.substring(i)==" ")
//                    i++;
//                start = i;
//                len = 0;
//            }
//            len++;
//        }
//        
//        if(a.substring(a.length()-1) != "")
//            c.append(a.substring(start, a.length()-start));
//        
//        
//        int counter = 0, startFrom = 0;
//        while(true){
//        
//            int index = b.indexOf(b, counter);
//        }
    }
    
    public static void main(String[] args) {
        
        String l = "Smartprix site India comparison best";
        String m = "{} is {4} online {3} shopping {} in {}";
        findFormattedString(l, m);
        
    }
    
}