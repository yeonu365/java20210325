package p11.lecture.regex;

import java.util.regex.Pattern;

public class A01RegularExpressionKr {
	public static void main(String[] args) {
		String regex1 = "[가-힣]+";
		String str1 = "김이박쵴ㅋㅋ";
		System.out.println(Pattern.matches(regex1, str1));
		
		regex1 = "\\p{IsHangul}+";
		str1 = "김이박쵴ㅋㅋ";
		System.out.println(Pattern.matches(regex1, str1));
	}
}
