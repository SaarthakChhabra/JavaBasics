//Right angled triangle
package javabasics;


public class RightAngledTriangle {

    public static void main(String[] args) {
        /* 
        //Straight Right angled triangle
        for (int i = 1; i <= 5; i++) {
            
            for (int j = 1; j <= i; j++) {
                
                System.out.print("*");
                
            }
            System.out.print("\n");
            
        }
        */
        //Reverse right angled triangle
//        for (int i = 5; i >= 1; i--) {
//            
//            //System.out.print("");
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//                
//            }
//            System.out.println("");
//            
//        }
        
        //Normal pyramid
        // This is all about spacing, ie, spacing is the most important thing in this program 
        
        int l=0;
        for (int j = 1; j <= 4; j++, l=0) { //decides the level or length of the triangle
                                            // 4 is the no of rows    l plays a important rol in this
            for (int k = 1; k <=4-j ; k++) { //this loop is for spacing
                System.out.print("  ");
            }
            while(l != 2*j-1){ //this loop is for placing stars at the right spot
            
                System.out.print("* ");
                ++l;
            }
            System.out.println("");
            
        }
        
        
        //inverted pyramid
        
        for (int p = 4; p >= 1; p--) {
            
            for (int o = 0; o < 4-p; o++) 
                System.out.print(" ");
            
            for (int u = 0; u < 2*p-1; u++) 
                System.out.print("* ");
            
            for (int u = 0; u < p-1; u++) 
                System.out.print("* ");
            
            System.out.println("");
            
        }
    }
    
    
}
 