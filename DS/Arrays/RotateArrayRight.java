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
/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/
//import for Scanner and other utility classes
import java.util.*;


class RotateArrayRight {
    
    // public static void rotate(int arr[], int d, int n){
    //     int i, j, k, temp;
    //     for(i = 0; i < gcd(d, n); i++){
            
    //         temp = arr[i];
    //         j = i;
            
    //         while(1 != 0){
    //             k = j + d;
    //             if(k >= n)
    //                 k = k-n;
    //             if(k == i)
    //                 break;
    //             arr[j] = arr[k];
    //             j = k;
    //         }
    //         arr[j] = temp;
    //     }
    // }
    
    // public static int gcd(int a, int b){
    //     if(b==0)
    //         return a;
    //     else 
    //         return gcd(b, a%b);
    // }
    
    
    public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        */
        //Scanner
        RotateArrayRight r = new RotateArrayRight();
        RotateArrayRight rr = new RotateArrayRight();
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0){
            int n = s.nextInt();
            int d = s.nextInt();
            int arr[] = new int[n];
            for(int i = 0; i < n; i++)
                arr[i] = s.nextInt();
            
            d %= n; 
            d = n-d;
            d %= n;
            
            int c = 1;
            while(c <= n){
                
                if(c < n)
                    System.out.print(arr[d]+" ");
                else
                    System.out.println(arr[d]+"\n");
                c++;
                d++;
                if(d == n)
                    d = 0;
            }
        }
    }
}

