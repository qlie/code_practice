package com.neusoft.demo;

import java.util.Arrays;

public class ArrDemo2 {

	public static void main(String[] args) {

		int []a = {9,3,7,5,1};
		int []b = new int[4];
		
//		Arrays.sort(a);
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a.length - i - 1; j++) {
				if( a[j] > a[j+1] ) {
					int t = a[j];
					a[j] = a[j+1];
					a[j+1] = t;
				}
			}
		}
		
		
		for(int x : a) {
			System.out.println(x);
		}
//		System.arraycopy(a, 1, b, 0, 4);
		
	}

}
