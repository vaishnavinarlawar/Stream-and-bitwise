package com.java;

import java.util.HashMap;
import java.util.Map;

public class AllStreamProg {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 3, 4, 5, 8, 1, 9 };
		Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
		System.out.println(hm);
		for (int b : a) {
			if (hm.containsKey(b)) {
				hm.put(b, hm.get(b) + 1);
			} else {
				hm.put(b, 1);
			}
		}
		for (Map.Entry<Integer, Integer> h1 : hm.entrySet()) {
			if (h1.getValue()== 3) {
				System.out.println(h1.getKey() + " ");
			}
		}
			System.out.println(hm);
		
	}
}
