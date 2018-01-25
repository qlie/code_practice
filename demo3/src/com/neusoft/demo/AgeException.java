/**
 * 
 */
package com.neusoft.demo;

/**
 * DESC: 业务自定义异常类
 * 2017年7月13日
 * @author BKF
 */
public class AgeException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AgeException() {
	}

	public AgeException(String message) {
		super(message);
	}
	
	
}
