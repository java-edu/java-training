package com.aug.sessions;


/**
 * 
 * 
 * 
 */
public class DataTypes {

	public static void main(String[] args) {
		SampleDataTypes s = new SampleDataTypes();
		System.out.println(s.b); // here we are trying to print default value of variable b
		System.out.println(s.c);
	}
	
	/*
	 * This method adds two variables 
	 * 
	 * 
	 * */
	public void doSum() {
		
	}
	
	public void add() {
		
	}

}

class SampleDataTypes {
	boolean b;
	char c = '\u002A';
	char C;
	byte by = 127;
	
	final static int maxspeed = 123;
}
