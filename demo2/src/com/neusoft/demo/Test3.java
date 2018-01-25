package com.neusoft.demo;

public class Test3 {

	public static void main(String[] args) {
		
		int a[] = {18, 25, 4, 17, 82, 69};
		int b[] = new int[a.length];
		
		for(int i = a.length-1, j = 0; i>= 0; i--, j++) {
			b[j] = a[i];
		}
		
		for(int x : b) {
			System.out.print(x + "\t");
		}
		
//		int max = 0;
//		int index = 0;
//		
//		for(int i = 0; i < a.length; i++) {
//			if( a[i] > max ) {
//				max = a[i];
//				index = i;
//			}
//		}
//		System.out.println( "第" + (index+1) + "个数最大，为：" +  max );
	}
	
}
