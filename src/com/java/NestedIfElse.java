package com.java;

public class NestedIfElse {

	public static void main(String[] args) {
		String country="India";
		String state="Maharastra";
		
		if(country=="India")
		{
		  if(state=="Maharastra") 
		  {
            System.out.println("you are Maharatrian");
		  }
		else { 
			System.out.println("you are Indian");
		}
			if(country!="India")
			{		
				System.out.println("you are not Indian");
		}
			else {
				System.out.println("you are Indian");
			}
		}
				
    }
}

