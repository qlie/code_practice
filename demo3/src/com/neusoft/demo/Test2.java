/**
 * 
 */
package com.neusoft.demo;

import java.util.Arrays;

/**
 * DESC: 
 * 2017Äê7ÔÂ13ÈÕ
 * @author BKF
 */
public class Test2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int [] arr = new int[10];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 100 );
		}
		
		Arrays.sort(arr);
		System.out.println( Arrays.toString(arr) );
		
	}

}
