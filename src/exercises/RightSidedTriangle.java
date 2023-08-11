package exercises;

public class RightSidedTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5; // Number of rows

        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 2; j <= i; j++) {
                System.out.print(" ");
            }

            // Print asterisks
            for (int j = 0; j <= n-i; j++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }

	}

}
