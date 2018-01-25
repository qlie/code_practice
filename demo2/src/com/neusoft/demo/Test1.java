package com.neusoft.demo;

public class Test1 {

	public static void main(String[] args) {

		char[] sarr = {'n','e','u','s','o','f','t'};
		char[] darr = new char[7];
		
		System.arraycopy(sarr, 0, darr, 0, sarr.length);
		
		for( char c : darr ) {
			System.out.print( c );
		}
	}

}
