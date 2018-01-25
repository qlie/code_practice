/**
 * 
 */
package com.neusoft.demo;

/**
 * DESC: 
 * 2017年7月14日
 * @author BKF
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ThreadTest tt = new ThreadTest();
		Thread t1 = new Thread(tt);
		Thread t2 = new Thread(tt);

		t1.setName("线程1");
		t2.setName("线程2");
		
		t1.start();
		t2.start();
		

		for (int i = 0; i < 10; i++) {
			
			System.out.println( Thread.currentThread().getName() + ":" + i );
			try {
				Thread.sleep(1000L);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
