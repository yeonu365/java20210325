package p11.lecture.regex;

import java.util.regex.Pattern;

public class A01RegularExpression {
	// 정규표현식
	// 문자열의 패턴을 표현하는 문자열
	// meta-character, quantifier

	public static void main(String[] args) {
		String regex1 = "a";
		String str1 = "a";

		boolean p1 = Pattern.matches(regex1, str1);
		System.out.println(p1);

		regex1 = "java";
		str1 = "java";
		System.out.println(Pattern.matches(regex1, str1));
		
		regex1 = "9";
		str1 = "0";
		System.out.println(Pattern.matches(regex1, str1));
		
		regex1 = "\\d";
		str1 = "8";
		System.out.println(Pattern.matches(regex1, str1));
		
		regex1 = "\\d";
		str1 = "89";
		System.out.println(Pattern.matches(regex1, str1));
		
		regex1 = "\\d\\d";
		str1 = "67";
		System.out.println(Pattern.matches(regex1, str1));
		
		regex1 = "\\d{3}";
		str1 = "943";
		System.out.println(Pattern.matches(regex1, str1));
		
		regex1 = "\\d{3,}";
		str1 = "14159";
		System.out.println(Pattern.matches(regex1, str1));
		
		regex1 ="010-\\d{4}-\\d{4}";
		str1 = "010-9876-3333";
		System.out.println("전화번호패턴 " +Pattern.matches(regex1, str1));
		
		regex1 = "\\d{3,5}";
		str1 = "22";
		System.out.println("3에서 5사이 " +Pattern.matches(regex1, str1));
		
		regex1 = "\\d{3,5}";
		str1 = "2255";
		System.out.println(Pattern.matches(regex1, str1));
		
		regex1 = "\\d+"; // \\d{1, }
		str1 = "1";
		System.out.println("한개이상패턴 " +Pattern.matches(regex1, str1));
		
		regex1 = "\\d*"; // \\d{0, }
		str1 = "22";
		System.out.println("숫자가 0개이상 " +Pattern.matches(regex1, str1));
		
		regex1 = "\\d?"; // \d{0,1} 물음표 ? 는 앞의 패턴이 0개 or 1개.
		str1 = "22";
		System.out.println("물음표 ? 패턴 " + Pattern.matches(regex1, str1));
		
		regex1 ="010-?\\d{4}-?\\d{4}";
		str1 = "010-9876-3333";
		String str2 = "01098763333";
		String str3 = "010-98763333";
		System.out.println("전화번호패턴 " +Pattern.matches(regex1, str1));
		System.out.println("전화번호패턴 " +Pattern.matches(regex1, str2));
		System.out.println("전화번호패턴 " +Pattern.matches(regex1, str3));

		regex1 = "\\w";
		str1 = "s";
		str2 = "T";
		str3 ="8";
		String str4 = "_";
		String str5 = " ";
		System.out.println("\\w " +Pattern.matches(regex1, str1));
		System.out.println("\\w  " +Pattern.matches(regex1, str2));
		System.out.println("\\w  " +Pattern.matches(regex1, str3));
		System.out.println("\\w  " +Pattern.matches(regex1, str4));
		System.out.println("\\w  " +Pattern.matches(regex1, str5));
		
		regex1 = "\\w\\d+";
		str1 = "e34567";
		str2 = "234567";
		str3 = "_34567";
		System.out.println("\\w\\d+ " +Pattern.matches(regex1, str1));
		System.out.println("3에서 5사이 " +Pattern.matches(regex1, str2));
		System.out.println("3에서 5사이 " +Pattern.matches(regex1, str3));
		
		regex1 = "(java)+";
		str1 = "javajavajava";
		str2 = "javajavajavaj";
		System.out.println("그룹 " +Pattern.matches(regex1, str1));		
		System.out.println("그룹 " +Pattern.matches(regex1, str2));		
		
		regex1 = "(java|python)"; //또는
		str1 = "java";
		str2 = "python";
		str3 = "spring";
		System.out.println("또는 " +Pattern.matches(regex1, str1));	
		System.out.println("또는 " +Pattern.matches(regex1, str2));	
		System.out.println("또는 " +Pattern.matches(regex1, str3));
		
		regex1 = "(java|python)+";
		str1 = "java";
		str2 = "pyton";
		str3 = "pythonjavajavapython";
		System.out.println("그룹 " +Pattern.matches(regex1, str1));	
		System.out.println("그룹 " +Pattern.matches(regex1, str2));	
		System.out.println("그룹 " +Pattern.matches(regex1, str3));
		
		regex1 = ".";
		str1 = "$";
		str2 = ".";
		str3 = "A";
		str4 = "9";
		str5 = "_";
		System.out.println("모든/아무 문자 " +Pattern.matches(regex1, str1));	
		System.out.println("모든/아무 문자 " +Pattern.matches(regex1, str2));	
		System.out.println("모든/아무 문자 " +Pattern.matches(regex1, str3));	
		System.out.println("모든/아무 문자 " +Pattern.matches(regex1, str4));	
		System.out.println("모든/아무 문자 " +Pattern.matches(regex1, str5));	
		
		regex1 = "\\.";
		str1 = "$";
		str2 = ".";
		System.out.println("모든/아무 문자 " +Pattern.matches(regex1, str1));	
		System.out.println("모든/아무 문자 " +Pattern.matches(regex1, str2));
		
	}
}
