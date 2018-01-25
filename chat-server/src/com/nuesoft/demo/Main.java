package com.nuesoft.demo;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import com.nuesoft.demo.thread.ChatThread;

/**
 * DESC: 
 * 2017��7��14��
 * @author BKF
 */
public class Main {

	public static void main(String[] args) {

		ServerSocket ss = null;
		try {
			ss = new ServerSocket(6666);
			System.out.println( "�����������ɹ�!" );
			while(true) {
				final Socket socket = ss.accept();
				new ChatThread(socket).start();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				ss.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	
	}
	
}
