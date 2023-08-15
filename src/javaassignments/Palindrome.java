package javaassignments;

public class Palindrome {
	public static void main(String[] args) {
		String str= "Malayalam";
		String lowerstr = str.toLowerCase();
				  
		String reversestr="";
	  
	    for (int i=0; i<lowerstr.length(); i++)
	    {
	      reversestr=  lowerstr.charAt(i) + reversestr; 
	    }
	    
	    //Check for palindrome
	    if(lowerstr.equals(reversestr)) {
	    	System.out.println("It is a palindrome :) .");
	    }
	    else {
	    	System.out.println("It is not a palindrome :( .");
	    }
	    	  
	}

}
