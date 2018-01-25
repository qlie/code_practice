/**
 * 
 */
package com.nuesoft.demo.thread;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

import com.nuesoft.demo.Input;

/**
 * DESC: 
 * 2017年7月14日
 * @author BKF
 */
public class ChatThread extends Thread {

	private Socket socket ;
	
	public ChatThread() {
	}

	public ChatThread(Socket socket) {
		super();
		this.socket = socket;
	}	
	
	@Override
	public void run() {
		System.out.println( "可以开始聊天了 ！" );
			try {
				 final DataInputStream dis = new DataInputStream(socket.getInputStream());
				 final DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
				// 独立完成客户端消息的接受，并显示在控制台
				new Thread(new Runnable() {
					@Override
					public void run() {
						while(true) {
							try {
								String msg = dis.readUTF();
								System.out.println( "client:" + msg );
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					}
				}).start();
				
				new Thread(new Runnable() {
					@Override
					public void run() {
						while(true) {
							try {
								String msg = Input.readLine();
								dos.writeUTF(msg);
							} catch(Exception e) {
								e.printStackTrace();
							}
						}
					}
				}).start();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
}
