/**
 * 
 */
package com.neusoft.demo;

/**
 * DESC: �ַ���ʾ��
 * 2017��7��13��
 * @author BKF
 */
public class Demo3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String s1 = "aaa";
		String s2 = "bbb";
		String s3 = "ccc";
		String s4 = "ddd";
		
		System.out.println( s1 + s2.concat(s3).concat(s4) );
		
		StringBuffer buff = new StringBuffer();
		buff.append("aaa").append("bbb").append("ccc").append("ddd");
		
		String result = buff.toString();
		System.out.println( result );
	}

}
