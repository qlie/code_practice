/**
 * 
 */
package com.neusoft.demo;

/**
 * DESC: 封装类示例
 * 2017年7月13日
 * @author BKF
 */
public class Demo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int num1 = 1000;
		Integer num2 = 2000;
		Integer.parseInt("200");
		
		int num3 = num2;
		
		System.out.println( num3 == num2 );
		
		String s1 = "abcabcbbc";
		String s3 = "abc";
		String s2 = new String("abc");
		
		System.out.println( s1.indexOf('c') );
		System.out.println( s1.lastIndexOf('c') );
		
//		System.out.println( s1.charAt(1) );
//		System.out.println( s1==s3 );
	}

}
