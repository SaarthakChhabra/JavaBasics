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
public final class matrixSpiralPrint {
    public static void main(String[] args) {
        matrixSpiralPrint matrixSpiralPrint = new matrixSpiralPrint();
    }
    
    public matrixSpiralPrint(){
        int[][] matrix = { {1, 2, 3, 4, 99, 00}, 
                            {5, 6, 7, 8, 82, 12, 122},
                            {9, 10, 11, 12, 12, 12}
                        };
        matrixSpiral(matrix);
    }
    
    public static void matrixSpiral(int mat[][]){
        int rowStart = 0;
        int rowLength = mat.length-1;
        
        int colStart = 0;
        int colLength = mat[0].length-1;
        
        while(rowStart <= rowLength && colStart <= colLength){
            for (int i = rowStart; i <= colLength; i++) 
                System.out.print(mat[rowStart][i]+" ");
            
            for(int j = rowStart+1; j <= rowLength; j++)
                System.out.print(mat[j][colLength]+" ");
            
            if(rowStart+1 <= rowLength){
                for(int k = colLength-1; k >= colStart; k--)
                    System.out.print(mat[rowLength][k]+" ");
            }
            
            if(colStart+1 <= colLength){
                for(int k = rowLength-1; k > rowStart; k--)
                    System.out.print(mat[k][colStart]+" ");
            }
            
            rowStart++;
            rowLength--;
            colStart++;
            colLength--;
        }
    }
}
    

