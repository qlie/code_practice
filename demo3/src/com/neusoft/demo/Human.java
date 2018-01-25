package com.neusoft.demo;

/**
 * DESC: 人类的抽象描述
 * 2017年7月13日
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

	// getter 方法
	public final String getName() {
		return name;
	}

	// setter 方法
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
			AgeException e = new AgeException("设定的年龄不符合常理！！！");
			throw e;
		}
	}

	
}
