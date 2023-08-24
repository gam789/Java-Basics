package javaassignments;


public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*prime number is a natural number greater than 1 that has no positive divisors 
		other than 1 and itself*/
		
		int num = 6;
		
		
		if(num<=1) {
			System.out.println("Not a Prime Number");
		}
		
		else{
			boolean isPrime = true;
			for(int i = 2;i<num;i++) {
				if(num%i == 0) {
					isPrime = false;
					break;
				}
			}		
		
		if(isPrime) {
			System.out.println("Prime Number");
		}
		else {
			System.out.println("Not a Prime Number");
		}
	
		 
			
		}
		
	
	}
}