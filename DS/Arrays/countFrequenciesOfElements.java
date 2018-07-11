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
public class countFrequenciesOfElements {
    public void findCounts(int arr[], int n){
        int i = 0;
        while(i < n){
            
            if(arr[i] <= 0){
                i++;
                continue;
            }
            
            int elementIndex = arr[i] - 1;
            // If the elementIndex has an element that is not
            // processed yet, then first store that element
            // to arr[i] so that we don't loose anything.
            if(arr[elementIndex] > 0){
                arr[i] = arr[elementIndex];
                arr[elementIndex] = -1;
            }
            else{
                // If this is NOT first occurrence of arr[i],
                // then increment its count.
                arr[elementIndex]--;
                arr[i] = 0;
                i++;
            }
        }
        System.out.println("Counts of elements:- ");
        for (int j = 0; j < n; j++) {
            System.out.println(j+1 +" - "+ Math.abs(arr[j]));
        }
    }
    public static void main(String[] args) {
        countFrequenciesOfElements count = new countFrequenciesOfElements();
//        int arr[] = {2, 3, 3, 2, 5};
//        count.findCounts(arr, arr.length);
// 
//        int arr1[] = {1};
//        count.findCounts(arr1, arr1.length);
// 
//        int arr3[] = {4, 4, 4, 4};
//        count.findCounts(arr3, arr3.length);
// 
        int arr2[] = {1, 3, 5, 7, 9, 1, 3, 5, 7, 9, 1, 4};
        count.findCounts(arr2, arr2.length);
    }
    
}
