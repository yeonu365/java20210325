package p09.lecture;

public class A02LocalClass {
	// non-static inner class
	class InnerClass {
		
	}
	
	// static nested class
	static class NestedClass {
		
	}
	
	void method1() {
		// local class
		class LocalClass {
			// field constructor method !! 해당 method 안에서만 사용가능하다.
		}
		LocalClass o1 = new LocalClass();
		 
	}
}
