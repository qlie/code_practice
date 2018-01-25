/**
 * 
 */
package com.neusoft.demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * DESC: NIO示例
 * 2017年7月14日
 * @author BKF
 */
public class Demo1 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) {

//		Files.copy(Paths.get("D:\\jdk-8u65-windows-x64.exe"), Paths.get("D:\\jdk.exe"));
//		Files.delete(Paths.get("D:\\jdk.exe"));
		
//		String file = "D:\\demo.txt";
//		FileReader reader = new FileReader(file);
//		char[] cbuf = new char[10];
//		int len = 0;
//		while( (len = reader.read(cbuf)) != -1 ) {
//			System.out.print( new String(cbuf, 0, len) );
//		}
//		
//		reader.close();
		
		
		String file1 = "D:\\jdk-8u65-windows-x64.exe";
		String file2 = "D:\\jdk.exe";
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream(file1);
			fos = new FileOutputStream(file2);

			byte[] buffer = new byte[10240];
			int len = 0;
			while( (len = fis.read(buffer)) != -1 ) {
				fos.write(buffer, 0, len);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
	}

}
