package com.java;

public class SwitchCase {

	public static void main(String[] args) {
		String country="India";
		String state="Maharastra";
		switch(country) {
		case"India":
		{
			System.out.println("India");
		
		}
		switch(state) {
		case"Maharastra":{
			System.out.println("Indian-Maharastra");
		
			break;
		}
		case"Gujrat":{
			System.out.println("Gujrat");
		break;
		}
		case"UP":{
			System.out.println("UP");
			break;
		}
		default:{
			System.out.println("null");
		}
		break;
		}
	}
		
}
}

	
