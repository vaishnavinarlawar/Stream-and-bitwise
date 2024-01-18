package com.java;

public class LogicalOperator {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=30;
		
		System.out.println(a<b && ++b<c && a<++c); //Logical And Increment
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		System.out.println(a<b && --b<c && a<--c); //Logical And Decrement
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		System.out.println(a>b & ++b<c & a<++c ); //Bitwise And Increment
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		System.out.println(a>b & --b<c & a<--c); //Bitwise And Decrement
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		System.out.println(a>b || ++b<c || a<++c); //logical Or Increment
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		System.out.println(a>b || --b<c || a<--c); //logical Or Decrement
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		System.out.println(a>b | ++b<c | a<++c ); //Bitwise Or Increment
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		System.out.println(a>b | --b<c | a<--c ); //Bitwise Or Decrement
		
        System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

}
