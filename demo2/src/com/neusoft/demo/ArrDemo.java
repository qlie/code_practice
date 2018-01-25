package com.neusoft.demo;

public class ArrDemo {

	public static void main(String[] args) {

		int []arr1 = {1,2,3,4};
		int[] arr2 = new int[4];
		int a[][] = new int[3][4];
		System.out.println( a.length );
		
		String[] sarr = {"aaa", "bbbb", "cccc"};
//		for(String s : sarr) {
//			System.out.println( s );
//		}
		for(int i = 0; i < sarr.length; i++) {
			System.out.println( sarr[i] );
		}
	}

}
