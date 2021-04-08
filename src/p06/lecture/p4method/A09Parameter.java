package p06.lecture.p4method;

public class A09Parameter {
	public static void main(String[] args) {
		// method overloading
		// 메소드 명이 같아도 파라미터의 차입, 순서, 개수가 다르면
		// 다른 메소드이다. (returnType 은 관련이 없다. 동일명으로 생성불가.)
		MyClass9 o1 = new MyClass9();
		
		o1.method();
		o1.method(0);
		o1.method(3.14);
		o1.method(1,2);
		o1.method(1, "hello");
		o1.method("hello", 2);
	}
}
