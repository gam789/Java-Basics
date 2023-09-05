//7.Program to find the largest number in an array
package javaassignments;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
        int arr[] = {25,2,3,4,5,10,30};  
        
        
        int largest = 0;  
       
        
        for (int i = 0; i < arr.length; i++) {  
           if(arr[i] > largest)  
               largest = arr[i];  
        }  
        System.out.println("Largest number in this array is: " + largest);  

	}

}
