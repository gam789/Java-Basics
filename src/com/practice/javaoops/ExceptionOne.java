package com.practice.javaoops;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionOne {
	
	
	public static void main(String[] args) throws FileNotFoundException, InterruptedException {
		/*try {
			int a = 10;
			int b = 0;
			
			int c = a/b;
			System.out.println(c);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			
		}
		finally {
			System.out.println("Stopped.");
		}*/
		
		
		
		FileInputStream f = new FileInputStream("G:\\Resume\\File.pdf");
		Thread.sleep(3000);
		System.out.println("Started");
		
		
		
	}

}
