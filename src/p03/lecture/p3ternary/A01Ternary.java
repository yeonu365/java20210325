package p03.lecture.p3ternary;

public class A01Ternary {
	public static void main(String[] args) {
		boolean b = true;
		System.out.println(b ? 3 : 4);
		
		b = false;
		System.out.println(b ? 3 : 4);
		
		int a = 5;
		String s = (a > 0) ? "양수" : "음수 또는 0";
		System.out.println(s);
	}
}
