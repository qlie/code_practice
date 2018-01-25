package com.neusoft.demo;

import java.util.Arrays;

public class Test4 {

	public static void main(String[] args) {

		int a[] = {18, 25, 4, 17, 25, 82, 4, 69};
		
		for(int i = 0; i < a.length - 1; i++) {
			
			for(int j = i + 1; j < a.length; j++) {
				
				if(a[i] == a[j]) {
					a[j] = 0;
				}
			}
		}
		
		System.out.println( Arrays.toString(a) ); 
	}

}
