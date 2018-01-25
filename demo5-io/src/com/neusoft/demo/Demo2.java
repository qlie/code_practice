/**
 * 
 */
package com.neusoft.demo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * DESC: 
 * 2017年7月14日
 * @author BKF
 */
public class Demo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Person p  = new Person("张三", 20);
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream("d:\\person");
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(p);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			try {
				oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
