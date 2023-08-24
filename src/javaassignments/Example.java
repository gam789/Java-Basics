package javaassignments;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numbers[] = {1,2,3,4};
		
		int largest = 0;
		
		for(int i=0;i<numbers.length;i++) {
			
			if(numbers[i]>largest) {
				largest = numbers[i];
				
			}
			System.out.println(i);
		}
		
		System.out.println(largest);

	}

}
