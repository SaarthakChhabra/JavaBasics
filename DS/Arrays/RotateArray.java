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


    class RotateArray {
    /*Function to left rotate arr[] of size n by d*/
//    void leftRotate(int arr[], int d, int n) 
//    {
//        int i, j, k, temp;
//        for (i = 0; i < gcd(d, n); i++) 
//        {
//            /* move i-th values of blocks */
//            temp = arr[i];
//            j = i;
//            while (1 != 0) 
//            {
//                k = j + d;
//                if (k >= n) 
//                    k = k - n;
//                if (k == i) 
//                    break;
//                arr[j] = arr[k];
//                j = k;
//            }
//            arr[j] = temp;
//        }
//    }
// 
//    /*UTILITY FUNCTIONS*/
//     
//    /* function to print an array */
    public static void printArray(int arr[], int size) 
    {
        int i;
        for (i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
    }
// 
//    /*Fuction to get gcd of a and b*/
//    int gcd(int a, int b) 
//    {
//        if (b == 0)
//            return a;
//        else
//            return gcd(b, a % b);
//    }
   /*second approach of rotation*/ 
    public static void arrayRotate(int arr[], int d, int n){
        rotate(arr, 0, d-1);
        rotate(arr, d, n-1);
        rotate(arr, 0, n-1);
    }
    
    public static void rotate(int arr[], int start, int end){
        int temp =0;
        while(start < end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
 
    // Driver program to test above functions
    public static void main(String[] args) {
        //RotateArray rotate = new RotateArray();
        int arr[] = {1, 2, 3, 4, 5};
//        rotate.leftRotate(arr, 2, 5);
        arrayRotate(arr, 2, 5);
        printArray(arr, 5);
    }
}
    

