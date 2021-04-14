package p08.lecture.ex2;

public interface MyInterface {
	// public static final field
	public static final int MY_FIELD1 =1;
	int MY_FIELD2 =2;
	String MY_FIELD3 ="hello";
	
	//생성자 (불가) 
	// public static method (static or class method)
	public static void staticMethod1() {
		System.out.println("static method1");
	}
	static void staticMethod2() {
		System.out.println("static method2");
	}
	
	// public abstract method (instance method)
	public abstract void method1();  // <--- abstract!! {} 불가하다!
	void method2();
	
	// publid default method (instance method)
	public default void defaultMethod1() {
		System.out.println("default method1");
	}
	default void defaultMethod2() {
		System.out.println("default method2");
	}
	 
}
