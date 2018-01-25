package com.neusoft.demo;

public class Test2 {

	public static void main(String[] args) {

		int arr[][] = new int[5][4];
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 4; j++) {
				arr[i][j] = i + j;
			}
		}
		
		System.out.println( arr.length );
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.print( arr[i][j] + "\t" );  ;
			}
			System.out.println(  );
		}
		
	}

}
