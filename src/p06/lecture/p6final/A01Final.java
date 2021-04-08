package p06.lecture.p6final;

public class A01Final {
	static final int f; 
	// static 과 final 위치 이동가능
	final static double PI = 3.1415;  // fianl static 변수 사용시 ALL CAPITAL LETTERS
	
	
	static {
		f = 55;
	}
	
	int a;
	final int b =9;
	
//	A01Final() {
//		this.b =9;
//	}
	
		
	public static void main(String[] args) {
		// final 변수(지역변서/파라미터/필드) 는
		// 값을 한 번만 할당 받을 수 있음
		
		final int i;
		int j;
		j=3;
		j=5;
		
		i=9;
//		i=10  <-- final 변수로 두번째는 없다.
		
	}
	
	static void method1(final int i) {
		System.out.println(i);
//		i = 3;  <-- final 변수로 두번째는 없다.
	}
	
}
