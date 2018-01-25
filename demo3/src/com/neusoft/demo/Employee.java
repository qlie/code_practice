/**
 * 
 */
package com.neusoft.demo;

/**
 * DESC: 
 * 2017��7��13��
 * @author BKF
 */
public class Employee extends Human {

	private Double salary;

	// �޲ι��췽����Ĭ����JVM�ṩ���ڱ�д���вι��췽���󣬾Ͳ����ṩ����Ҫ�Լ���д�޲ι��췽��
	public Employee() {
	}

	public Employee(String name, int age, Double salary) {
//		super.setName(name);
//		super.setAge(age);
		super(name, age);
		this.salary = salary;
	}

	/**
	 * ��д���ǶԸ������з��������¶���
	 * 1. ���ʷ�Χ����С�ڱ���д�ķ���
	 * 2. ������ǩ��������ֵ���͡��������ơ������б�Ҫ��ͬ
	 */
	@Override
	public String toString() {
		return "[" + super.getName() + "," + super.getAge() + "," + salary + "]";
	}

	/**
	 * @return the salary
	 */
	public Double getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(Double salary) {
		this.salary = salary;
	}

//	@Override
//	public String getName() {
//		System.out.println( "ssss" );
//		return super.getName();
//	}

	public boolean equals(Object obj) {
        
		if(obj == null) return false;
		if(!(obj instanceof Employee)) {
			return false;
		} else {
			Employee e = (Employee) obj;
			if(this.getName() .equals( e.getName() ) && this.getAge() == e.getAge()) {
				return true;
			}
		}
		
		return false;
    }
}
