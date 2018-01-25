/**
 * 
 */
package com.neusoft.demo;

/**
 * DESC: 
 * 2017年7月13日
 * @author BKF
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Employee emp1 = new Employee("张三丰", 100, 20000D);
		Employee emp2 = new Employee("张三丰", 100, 20000D);
		
		

		System.out.println( emp1 == emp2 );
		System.out.println( emp1.equals(emp2) );
//		
//		Human h = emp;
//		
//		if( h instanceof Student ) {
//			Student s = (Student)h;
//		}
//		if( h instanceof Employee ) {
//			Employee e = (Employee)h;
//			
//		}
		
//		Employee e = new Employee();
//		try {
//			e.setAge(2000);
//		} catch (AgeException ex) {
//			System.out.println( ex.getMessage() );
//		}
		
		
		
		
		
		
		
		
		
	}

}
