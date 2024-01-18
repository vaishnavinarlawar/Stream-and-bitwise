package com.java;

 public class OverRiding extends Test {

	public static void main(String[] args) {
		Test aa=new OverRiding();
		aa.add(10, 10);

	}
	
	public void add(int a, int b) {
		System.out.println(a+b+1000);
	}

}
class Test{
	
	
	public void add(int a, int b) {
		
		System.out.println(a+b);
	}
}
