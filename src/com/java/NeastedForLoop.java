package com.java;

public class NeastedForLoop {

	public static void main(String[] args) {
		/*
		 * for(int i=0; i<=10; i++) { for(int j=0; j<=10; j++) {
		 * System.out.println(i+" "+j); } System.out.println("outside the class"); }
		 */
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= 5; j++) {
				if (i == 2 && j == 2) {
					continue;
				}
				System.out.println(i + " " + j);

			}
		}
		System.out.println("out side the loop");

	}
}
