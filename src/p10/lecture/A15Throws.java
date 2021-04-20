package p10.lecture;

public class A15Throws {
	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println("실행");
		method1();
		System.out.println("종료");
	}
	
	public static void method1() throws ClassNotFoundException {
		method2();
	}
	
	public static void method2() throws ClassNotFoundException {
		method3();
	}
	
	public static void method3() throws ClassNotFoundException {
			Class.forName("java.lang.Number2");
		}
	}
	// method3() 에서 오류가 나도 try{} catch{} 로 잡아 주었기 때문에 
	// 나머지들이 다 잘 실행 된다.
	// 오류
	// 첫번째. 최소 발생지.
	// 내가 할일. (java: line number) 를 찾아서 수정한다.
	// e.printStackTrace(); <-- 오류를 보여준다. 

