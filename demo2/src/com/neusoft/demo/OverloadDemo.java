package com.neusoft.demo;


/**
 * 方法的重载：同一个类中的多个同名方法的一种语法现象
 *  1. 方法名相同
 *  2. 参数列表不同：参数的个数，参数的类型，参数的顺序
 *	3. 方法的返回值类型没有要求
 */
public class OverloadDemo {
	
	public void print() {
		System.out.println("Hello");
	}
	
	public int print(String name) {
		System.out.println("Hello, " + name);
		return 0;
	}
	
	public void print(String xxx, int age) {
		
	}
	
	public void print(int age) {
		
	}
	
	public void print(int age, String name) {
		
	}
}
