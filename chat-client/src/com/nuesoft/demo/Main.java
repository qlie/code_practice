/**
 * 
 */
package com.nuesoft.demo;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * DESC: 
 * 2017年7月14日
 * @author BKF
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String ip = "127.0.0.1";
		Socket socket = null;
		try {
			socket = new Socket(ip, 6666);
			System.out.println( "已成功建立连接！" );
			DataInputStream dis = new DataInputStream(socket.getInputStream());
			DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

			new Thread(new Runnable() {
				@Override
				public void run() {
					while(true) {
						try {
							String msg = Input.readLine();
							dos.writeUTF(msg);
						} catch (IOException e) { }
					}
				}
			}).start();

			new Thread(new Runnable() {
				@Override
				public void run() {
					while(true) {
						try {
							String msg = dis.readUTF();
							System.out.println( "Server:" + msg );
						} catch (Exception e) {}
					}
				}
			}).start();
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
