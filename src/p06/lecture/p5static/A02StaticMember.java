package p06.lecture.p5static;

public class A02StaticMember {
	public static void main(String[] args) {
		MyClass2.i = 5;
		System.out.println(MyClass2.i);
		
		MyClass2.method();
		
//		MyClass2.j = 3;            <-- "j" 는 instance field 이기 때문에 불가.
//		MyClass2.method1();        <-- "method1" 은 instance method 이기 때문에 불가. 
		
		MyClass2 o1 = new MyClass2();
		o1.j = 10;
		
		MyClass2 o2 = new MyClass2();
		o2.j = 20;
		
		System.out.println(o1.j);
		System.out.println(o2.j);
		
		o1.i =9;
		
		System.out.println(o1.i);
		System.out.println(o2.i);
		System.out.println(MyClass2.i);
	}
}
