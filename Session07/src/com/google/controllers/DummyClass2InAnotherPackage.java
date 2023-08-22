package com.google.controllers;

public class DummyClass2InAnotherPackage {
	
	public static void main(String[] args) {
		DefaultModifierDummyClassInAnotherPackage o = new DefaultModifierDummyClassInAnotherPackage();
		
		DummyClassInAnotherPackage d = new DummyClassInAnotherPackage();
		System.out.println(d.a);
//		System.out.println(d.b);
		System.out.println(d.c);

	}

}
