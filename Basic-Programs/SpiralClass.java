package javabasics;

import java.util.ArrayList;
import java.util.List;

public class SpiralClass {
	// DO NOT MODIFY THE LIST
	
	
	public ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> a) {
		 ArrayList<Integer> result = new ArrayList<Integer>();
		 // Populate result
		 
		 int m, n;
		 
		 m = a.size();
		 n = a.get(0).size();
		 
		 if (m == 0)
		    return result;
		 
		 int len;
		 int dir = 0; // right
		 int row, col, layer;
		 row = col = layer = 0;
		 
		 result.add(a.get(0).get(0));
		 
        
        for (int step = 1; step < m * n; step++) {
            
            switch(dir) {
                
                // Go right
                case 0:
                    
                    if (col == n - layer - 1) {
                        dir = 1;
                        row++;
                    } else {
                        col++;
                    }
                    
                    break;
                    
                // Go down
                case 1:
                    
                    if (row == m - layer - 1) {
                        dir = 2;
                        col--;
                    } else {
                        row++;
                    }
                    
                    break;
                    
                // Go left
                case 2:
                    
                    if (col == layer) {
                        dir = 3;
                        row--;
                    } else {
                        col--;
                    }
                    
                    break;
                
                // Go up
                case 3:
                    
                    if (row == layer + 1) {
                        dir = 0;
                        col++;
                        layer++;
                    } else {
                        row--;
                    }
                    
                    break;
                
            }
            
            //System.out.println(row + " " + col);
            result.add(a.get(row).get(col));
            
        }
        
		 return result;
	}
}

