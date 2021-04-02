package p05.lecture;

public class A13CallByValue {
	public static void main(String[] args) {
		System.out.println("main stat1");
		
		method1();
		method1();
		System.out.println("main stat2");
		
		method1();
		
		method2(5);
		method2(10);
		
	}
	
	public static void method1() {
		System.out.println("method1 stat1");
		System.out.println("method1 stat2");
	}
	
	public static void method2(int i) {
		System.out.println("method2 stat1");
		System.out.println(i);
		System.out.println("method2 stat2");
	}
	
}
