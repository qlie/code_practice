/**
 * 
 */
package com.neusoft.demo;

/**
 * DESC: static & final 示例
 * 2017年7月13日
 * @author BKF
 */
public class Demo1 {

	// 静态常量，只有一次赋值机会，可以在声明的时候赋值，也可以延迟到 静态代码块赋值
	public static final Double PI;
	// 普通常量，也只有一次赋值机会，可以延迟到构造方法中初始化
	public final Integer MAX_VALUE;

	// 静态代码块：在类被加载到JVM的时候，被执行一次
	static {
		PI = Math.PI;
	}
	
	public Demo1() {
		MAX_VALUE = Integer.MAX_VALUE;
	}
	
	public void changePi() {
//		PI = Math.PI;
	}
	
}
