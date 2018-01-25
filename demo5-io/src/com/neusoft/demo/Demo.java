/**
 * 
 */
package com.neusoft.demo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * DESC: 
 * 2017Äê7ÔÂ14ÈÕ
 * @author BKF
 */
public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String file = "d:\\person";
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream(file);
			ois = new ObjectInputStream(fis);
			
			Person p = (Person)ois.readObject();
			System.out.println( p.getName() );
			
		} catch (Exception e) {
			
		} finally {
			try {
				fis.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			try {
				ois.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
