//9.Program to sort the array in ascending order
package javaassignments;

import java.util.Arrays;

public class AscendingArray {

	public static void main(String[] args) {
		
		int arr[]= { -5, -9, 8, 12, 1, 3 };
		 
        System.out.print("Original array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
 
        // Using Arrays.sort() method to sort array
        Arrays.sort(arr);
 
        System.out.println();
 
        // Displaying elements of array after sorting
        System.out.println("Array sorted in ascending order : " + Arrays.toString(arr));

	}

}
