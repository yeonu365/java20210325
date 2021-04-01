package p05.lecture;

public class A06StringEquals {
	public static void main(String[] args) {
		String s = new String("java");
		String t = "java";
		String u = "java";
		
		boolean d1 = s.equals(t);
		System.out.println(s == t);
		System.out.println(d1);
		
		System.out.println(s.equals(s));
		System.out.println(t.equals(u));
		
	}
}
