package javaassignments;



public class PascalsTriangle {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int numRows = 5; // Desired number of rows

        for (int i = 0; i < numRows; i++) {
            int number = 1;
            
         // Print spaces to center-align the triangle
            for (int spaces = 0; spaces < numRows - i; spaces++) {
                System.out.print(" ");
            }
            
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1);
            }
            
            System.out.println();

	}

}
}
