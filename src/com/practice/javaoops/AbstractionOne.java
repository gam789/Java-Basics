package com.practice.javaoops;

abstract class Google{
	
	abstract void search();
	
	public void message() {
		System.out.println("Thanks you for using Google.");
	}
	
}

class SearchAll extends Google{

	@Override
	void search() {
		// TODO Auto-generated method stub
		System.out.println("Click to search all.");
	}
	
}

class SearchImage extends Google{

	@Override
	void search() {
		// TODO Auto-generated method stub
		System.out.println("Click to search image.");
	}
	
}

class SearchVideo extends Google{

	@Override
	void search() {
		// TODO Auto-generated method stub
		System.out.println("Click to search video.");
		
	}
	
}


public class AbstractionOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SearchAll a = new SearchAll();
		a.search();
		a.message();
		
		SearchImage i = new SearchImage();
		i.search();
		i.message();
		
		SearchVideo v = new SearchVideo();
		v.search();
		v.message();

	}

}
