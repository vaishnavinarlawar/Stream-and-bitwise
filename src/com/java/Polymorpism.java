package com.java;

public class Polymorpism {
	public void add(int a, int b) {
		System.out.println(a+b);
	}
	public void add() {
		System.out.println(10);
	}
	public void add(float a, int b) {
		System.out.println(a+b);
	}
	public void add(short a, int b) {
		System.out.println(a+b);
	}
	public Polymorpism () {           //constructor overloading
		System.out.println(20);
	}
	
    
	public static void main(String[] args) {
		Polymorpism p=new Polymorpism();
		p.add(10, 20);
		p.add(20, 30);
		p.add();
	}

}
