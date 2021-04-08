package p06.lecture.p5static;

public class MyClass4 {
	int i =3;
	int j;
	
	static int a = 30;
	static int b;
//	static int j=20;
	
	// static 값을 초기화 하고 싶을떄 static {} 블록 을  만들면된다.
	static {
		b = 50;
		System.out.println("static block");
	}
	
	static {
		System.out.println("static block2");
	}
	
	
	MyClass4() {
		// 인스턴스 필드 초기화
		this.j =5;
	}
}
