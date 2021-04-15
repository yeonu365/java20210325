package yu;

import java.util.Arrays;

public class Textbook {
	public static void main(String[] args) {

// 101 page
//		int score = 85;
//		String grade = (score > 90) ? "A" : "B";
// 책에서 char 를 썼는데 String 으로 해도 됨. 단, 'A' -> "A" (String 이기 때문에 따옴표두개!)
//		System.out.println(grade + "등급이야");
//
// 162 page
//		String qs = new String("123");
//		int num = Integer.parseInt(qs);
//		System.out.println(num);
		
		String[] str = new String [3];
		str[0] = "JAVA";
		str[1] = "JAVA";
		str[2] = new String("JAVA");
		System.out.println(Arrays.toString(str));
		System.out.println(str[0] == str[2]);
		System.out.println(str[0].equals(str[2]));
	}
}
