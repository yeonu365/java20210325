package p18.textbook;

import java.io.*;

public class BufferedOutputStreamExample {
	public static void main(String[] args) throws Exception {
		FileInputStream fis =null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		int data = -1;
		long start = 0;
		long end = 0;
		
		String src = "src/p18/textbook/BufferedOutputStreamExample.java";
		String des = "src/p18/textbook/BufferedOutputStreamExample.copy";

		fis = new FileInputStream(src);
		bis = new BufferedInputStream(fis);
		fos = new FileOutputStream(des);
		bos = new BufferedOutputStream(fos);
		
		start = System.currentTimeMillis();
		while((data = bis.read()) != -1) {
			fos.write(data);
		}
		fos.flush();
		end = System.currentTimeMillis();
		fos.close();bis.close();fis.close();
		System.out.println("사용하지 않았을때: " + (end-start) + "ms");
		
		fis = new FileInputStream(src);
		bis = new BufferedInputStream(fis);
		fos = new FileOutputStream(des);
		bos = new BufferedOutputStream(fos);
		
		start = System.currentTimeMillis();
		while((data = bis.read()) != -1) {
			bos.write(data);
		}
		bos.flush();
		end = System.currentTimeMillis();
		bos.close();bis.close();fis.close();fos.close();
		System.out.println("사용하지 했을때: " + (end-start) + "ms");
		
	}
}
