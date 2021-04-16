package p09.textbook.s090303;

public class Outter {
	
	public void method1(final int arg) {
		final int localVariable =1;
//		arg = 100;            <-- final로 선언되었음.
//		localVariable = 100;  <-- final로 선언되었음.		
		
		class Inner {
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
	
	public void method2(int arg) {
		int localVariable = 1;
//		arg = 100;            <-- 묵시적 final 선언됨.
//		localVariable = 100;  <-- 묵시적 final 선언됨.
		class Inner {
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
}
