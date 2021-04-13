package p07.textbook.s070706;

public class InstanceofExample {
	public static void method1(Parent parent) {
		if(parent instanceof Child) {
			Child child = (Child) parent;
			System.out.println("method1 - Child ok");
		} else {
			System.out.println("method1 - Child not ok");
		}
	}
	
	public static void method2(Parent parent) {
		Child child = (Child) parent;
		System.out.println("method2 - Child ok");
	}
	
	public static void main(String[] args) {
		Parent parentA = new Child();
		method1(parentA);
		method2(parentA);
		
		Parent parentB = new Parent();
		method1(parentB);
		method2(parentB);
		
	}
}
