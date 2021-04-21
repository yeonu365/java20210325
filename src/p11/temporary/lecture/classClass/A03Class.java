package p11.temporary.lecture.classClass;

import com.sun.corba.se.spi.orbutil.fsm.Action;

public class A03Class {
	public static void main(String[] args) {
		Class c1 = A03Class.class;
		
		System.out.println(c1.isInterface());
		
		Class c2 = Action.class;
		System.out.println(c2.isInterface());
	}
}
