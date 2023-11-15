package com.practice.javaoops;

class Encap1{
	
	private int id;
	private String name;
	private String designation;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
}

public class Encapsulation {
	public static void main(String[] args) {
		
		Encap1 e = new Encap1();
		
		e.setId(1);
		System.out.println(e.getId());
		
		
		e.setName("Mathew Alex");
		System.out.println(e.getName());
		
		e.setDesignation("ASE");
		System.out.println(e.getDesignation());
		
	}

}
