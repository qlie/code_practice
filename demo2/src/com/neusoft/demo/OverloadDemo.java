package com.neusoft.demo;


/**
 * ���������أ�ͬһ�����еĶ��ͬ��������һ���﷨����
 *  1. ��������ͬ
 *  2. �����б�ͬ�������ĸ��������������ͣ�������˳��
 *	3. �����ķ���ֵ����û��Ҫ��
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
