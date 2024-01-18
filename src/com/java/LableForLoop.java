package com.java;

public class LableForLoop {

	public static void main(String[] args) {
		/*aa:
			for(int i=0; i<=5; i++) {
				bb:
				for(int j=0; j<=5 ;j++) {
					
					if((i==2&&j==2)||(i==3&&j==3)) {
						
						continue bb; 
					}
					
					System.out.println(i+ " "+j);	
				}*/
		aa:
			for(int i=0; i<=5; i++) {
				bb:
					for(int j=0; j<=5; j++) {
						if((i==2&&j==2)||(i==3&&j==3)){
							break bb;
						}
						System.out.println(i+ " " +j);
					}
			}
			}
			
	}


