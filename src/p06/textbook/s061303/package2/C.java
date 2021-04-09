package p06.textbook.s061303.package2;

import p06.textbook.s061303.package1.A;

public class C {
	public C() {
		A a =new A();
		a.field1 =1;
//		a.field2 =1;   <-- default 
//		a.field3 =1;   <-- private  
		
		
		a.method1();
//		a.method2();
//		a.method3();
	}
}
