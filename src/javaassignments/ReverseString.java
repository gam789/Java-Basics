package javaassignments;

public class ReverseString {
	public static void main(String[] args) {
		
		  String str= "Gibi", reversestr="";
	      char ch;
	       
	      System.out.print("Original String is: ");
	      
	      System.out.println("Gibi"); 
	       
	      for (int i=0; i<str.length(); i++)
	      {
	        ch= str.charAt(i);
	        //System.out.println(ch);
	        reversestr=  ch + reversestr; 
	        System.out.println(reversestr);
	      }
	      System.out.println("Reverse String is: "+ reversestr);
	}

}
