/**
 * 
 */
package com.neusoft.demo;

/**
 * DESC: static & final ʾ��
 * 2017��7��13��
 * @author BKF
 */
public class Demo1 {

	// ��̬������ֻ��һ�θ�ֵ���ᣬ������������ʱ��ֵ��Ҳ�����ӳٵ� ��̬����鸳ֵ
	public static final Double PI;
	// ��ͨ������Ҳֻ��һ�θ�ֵ���ᣬ�����ӳٵ����췽���г�ʼ��
	public final Integer MAX_VALUE;

	// ��̬����飺���౻���ص�JVM��ʱ�򣬱�ִ��һ��
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
