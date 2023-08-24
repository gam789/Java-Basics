package javaassignments;

public class MatrixAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int matrix1[][] = {
	            {1, 200, 3},
	            {4, 500, 6},
	            {7, 800, 9}
	        };

	        int matrix2[][] = {
	            {9, 8, 7},
	            {6, 5, 4},
	            {3, 2, 1}
	        };

	        int resultMatrix[][] = new int[3][3];

	        //Matrix addition
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
	            }
	        }

	        //Result matrix
	        System.out.println("Resultant matrix after addition:");
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                System.out.print(resultMatrix[i][j] + " ");
	            }
	            System.out.println();
	        }
	    
	}

}
