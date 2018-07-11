	/* package whatever; // don't place package name! */
	
	import java.util.*;
	import java.util.Arrays;
	import java.lang.*;
	import java.io.*;
	
	/* Name of the class has to be "Main" only if the class is public. */
	class distinctArray
	{
		public static int[] arrayDistinct(int arr[]){
			
			int arr1[] = new int[arr.length];
			int temp = 0;
			boolean b = true;
			for(int i = 0; i < arr.length; i++){
				b = true;
				int j;
				//temp = i;
				
				for(j = 0; j < arr1.length; j++){
					if(arr[i] == arr1[j]){
						b = false;
						break;
					}
						
				}
				if(b){
					arr1[temp] = arr[i];
					temp++;
					//System.out.print(arr1[i]+" ");
				}
			}
			return arr1;
			
			
		}
		public static void main (String[] args) throws java.lang.Exception
		{
			// your code goes here
			int arr[] = {1, 2, 3, 3, 4, 1, 2, 5, 5, 7, 5};
			System.out.print(Arrays.toString(arrayDistinct(arr)));
		}
	}