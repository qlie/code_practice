/**
 * 
 */
package com.neusoft.demo;

/**
 * DESC: 
 * 2017年7月13日
 * @author BKF
 */
public class Employee extends Human {

	private Double salary;

	// 无参构造方法，默认由JVM提供，在编写了有参构造方法后，就不再提供，需要自己编写无参构造方法
	public Employee() {
	}

	public Employee(String name, int age, Double salary) {
//		super.setName(name);
//		super.setAge(age);
		super(name, age);
		this.salary = salary;
	}

	/**
	 * 重写：是对父类现有方法的重新定义
	 * 1. 访问范围不能小于被重写的方法
	 * 2. 方法的签名（返回值类型、方法名称、参数列表）要相同
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
