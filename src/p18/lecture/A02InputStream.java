package p18.lecture;

import java.io.FileInputStream;
import java.io.InputStream;

public class A02InputStream {
	public static void main(String[] args) throws Exception {
		String fileName = "src/p18/lecture/A02InputStream.java";
		InputStream is = new FileInputStream(fileName);
		
//		byte b1 = (byte) is.read();  <-- byte 단위로 읽기 때문에 byte 로 담아도 된다.
//		int b1 = is.read(); 
//		int b2 = is.read();
//		int b3 = is.read();
//		
//		System.out.println(b1);
//		System.out.println(b2);
//		System.out.println(b3);
		
		int b =0;
		int cnt = 0;
		while ((b=is.read()) != -1) {
			System.out.println(++cnt);
		}
		
		
		is.close();
	}
}

