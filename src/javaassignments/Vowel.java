package javaassignments;

public class Vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "I Love Java";
        str = str.toLowerCase();
        int vowelCount = 0;
 
        for (int i = 0; i < str.length(); i++) {
           if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
               vowelCount++;
            }
        }
 
        
        System.out.println("Total no of vowels in string are: " +vowelCount);	
		
	
	
	
	}

}
