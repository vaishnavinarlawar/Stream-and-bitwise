package com.java;

public class TypeCasting {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		int e=50;
		int f=10;
		
		short c=30;
		short d=40;
		
		c=(short)(c+d); //Explicit typecasting
		System.out.println(c);
		
		a+=b; //implicit typecasting
		System.out.println(a);
		
		a=a+=b;
		System.out.println(a);
		
		a=a+b; //it gives compile time error
		
		int g=(e<f)?e:f; //ternary 
		System.out.println(g);
		
		String s=(e<f)?"e is less than f":"e is greater than f";
		System.out.println(s);
		
		
		
	}

}
