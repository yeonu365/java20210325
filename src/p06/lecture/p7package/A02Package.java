package p06.lecture.p7package;

import p06.lecture.p7package.package2.MyClass2;
import p06.lecture.p7package.package1.*;

public class A02Package {
	public static void main(String[] args) {
//		p06.lecture.p7package.package1.MyClass1 o1 = new p06.lecture.p7package.package1.MyClass1();
//		import(3번 4번 줄) 를 사용 하면 주소를 full 로 안써도 된다.
//		4번줄의  .*;  를 사용 하면 해당 PKG 의 class 를 ㄷ ㅏ 사용 가능하다. 
//		cntl shit o  를 사용 하면 import를 불러온다.
		
		MyClass1 o1 = new MyClass1();
		MyClass2 o2 = new MyClass2();
		
		
		MyClass3 o3 = new MyClass3();
		
				
	}
}
