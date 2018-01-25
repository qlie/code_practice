package com.neusoft.demo;

/**
 * DESC: ����ĳ�������
 * 2017��7��13��
 * @author BKF
 */
public class Human {

	private String name;
	private int age;

	public Human() {
	}

	public Human(String name, int age) {
		this.name = name;
		this.age = age;		
	}

	// getter ����
	public final String getName() {
		return name;
	}

	// setter ����
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) throws AgeException {
		if(age > 0 && age < 120) {
			this.age = age;
		} else {
			AgeException e = new AgeException("�趨�����䲻���ϳ�������");
			throw e;
		}
	}

	
}
