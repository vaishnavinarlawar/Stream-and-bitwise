package com.java;

public class Instanceof1{

	public static void main(String[] args) {
		
		Instanceof1 a= new Instanceof1();
		
		System.out.println(a instanceof Object);
		
        System.out.println(a instanceof Runnable);
        
        System.out.println(a instanceof Instanceof1 );
	}
}
