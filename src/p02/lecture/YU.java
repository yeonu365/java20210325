package p02.lecture;

public class YU {
	public static void main(String[] args) {
		char a = 'l';
		int uniCode = a;
		System.out.println(uniCode);
		
		char chVar = 101;
		int intVar = chVar;
		System.out.println((char)intVar);
		
		int intValue = 'A';
		char charValue = (char) intValue;
		System.out.println(charValue);
		
		int intValue5 = 101;
		char charValue5 = (char) intValue5;
		System.out.println(charValue5);
		
		char ai = 'A';
		int result = ai + 1;
		char na = (char) result;
		System.out.println(na);
	}
}
