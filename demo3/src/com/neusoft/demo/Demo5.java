/**
 * 
 */
package com.neusoft.demo;

import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


/**
 * DESC: 日期示例
 * 2017年7月13日
 * @author BKF
 */
public class Demo5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

//		Date d1 = new Date();
//		System.out.println( d1 );
//		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		System.out.println( sdf.format(d1) );
			Date d2 = sdf.parse("07/10/96 4:5 PM, PDT", new ParsePosition(1));
			System.out.println( d2 );
		
		Calendar c1 = Calendar.getInstance();
		c1.set(2017, 6, 13);
		System.out.println( c1.get( 2 ) );
		
		
	}

}
