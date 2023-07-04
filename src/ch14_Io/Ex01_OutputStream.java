package ch14_Io;

import java.io.*;

public class Ex01_OutputStream {
	public static void main(String[] args) {
		try {
			OutputStream os = new FileOutputStream("c:/Temp/test.db");
			byte a = 10, b = 20;
			int c = 30;
			os.write(a);
			os.write(b);
			os.write(c);
			
			byte[] array = {10, 20, 30, 40 , 50};
			os.write(array);
			
			os.flush();
			os.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
