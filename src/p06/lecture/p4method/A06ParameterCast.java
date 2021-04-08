package p06.lecture.p4method;

public class A06ParameterCast {
	public static void main(String[] args) {
		int a =5;
		double b;
		b = a;
//		double b = 3.14;
//		int c = (int) b;
		
		MyClass6 o1 = new MyClass6();
		o1.method1(a);
		// o1.method1(b);
		o1.method2(b);
		o1.method2(a);
//		o1.method1(c); <--YU. (double)을 (int)로 변환시킨후 int method 로 출력 가능.
	}
}
