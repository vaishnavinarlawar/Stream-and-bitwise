package com.java;

import java.util.Scanner;

public class SBI {
	
   /* String s=" Vaishnavi ";
	int a=123456;
	float d=247.45f;
	
	
	void details(String aa,int bb, float cc) {
		s=aa;
		a=bb;
		d=cc;
			}	

	void display() {
		System.out.println(a + s+ d);

	}*/
	int account_no;
	String name;
	float flt;
	
	public SBI(int account_no, String name, float flt) {
		super();
		this.account_no = account_no;
		this.name = name;
		this.flt = flt;
	}

	public static void main(String[] args) {
		/* SBI s1= new SBI();
			s1.display();*/
	Scanner sc=new Scanner(System.in);
		System.out.println("Enter an banking deta");
		int account_no = sc.nextInt();
		System.out.println("Enter account no");
		String name= sc.next();
		System.out.println("Enter name");
		float flt=sc.nextFloat();
		System.out.println("Enter salary");
		
		SBI s1=new SBI(account_no ,name, flt);
		System.out.println(s1.account_no);
		System.out.println(s1.account_no);
		System.out.println(s1.account_no);
			}

			
		
	}

		


