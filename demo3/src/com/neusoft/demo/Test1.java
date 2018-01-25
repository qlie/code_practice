/**
 * 
 */
package com.neusoft.demo;

/**
 * DESC: 
 * 2017Äê7ÔÂ13ÈÕ
 * @author BKF
 */
public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String s = "asdasfwewefwerwer";
		
		int sum = 0;
		for(int i = 0; i < s.length(); i++) {
			if( s.charAt(i) == 'e' ) {
				sum++;
			}
		}
		System.out.println( sum );
		
		
		
		
//		int len1 = s.length();
//		int len2 = s.replaceAll("e", "").length();
//		
//		System.out.println( len1 - len2 );
//		System.out.println( s );
	}

}
