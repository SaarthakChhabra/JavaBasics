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
public class twoDArray {
        /* print the wave like 1 4 7 8 5 2 3 6 9 */
    	public static void waveForm(int arr[][], int m, int n){
		int i = 0, j = 0;
                int dir = 0;//dir = 0 for top to down
		while(j < n){
			if(dir == 0){
				for(i = 0; i < m; ++i){
					System.out.print(arr[i][j]+" ");
                                }
                                dir = 1;
                                j++;
			}
			else{
				for(i = m-1; i >= 0; --i){
					System.out.print(arr[i][j]+ " ");
				}
                                j++;
                                dir = 0;
			}
		}
	}
    public static void print2D(int mat[][], int m, int n){
        for(int i = 0; i < n; i++){
            for (int j = 0; j < m; j++) {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int m = 3, n = 3;
        int arr[][] = { {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9} };
        //print2D(arr, m, n);
        waveForm(arr, m, n);
        
        
    }
}
