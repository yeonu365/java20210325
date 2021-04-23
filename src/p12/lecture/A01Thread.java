package p12.lecture;

public class A01Thread {
	// Thread : 프로그램(프로세스) 내에서 실행되는 흐름의 단위
	
	// Thread 만드는 법 : 
	// 1. Thread 클래스 상속
//	  Thread 가 가지고 있는 run() 재정의
//	  instance 만들기
	// 2. Runnable 인터페이스 구현
	
	public static void main(String[] args) {
		Thread t1 = new Thread1();
		t1.start();  // <-- run()  을 실행시킴
		System.out.println("메인 메소드 실행");
	}
	
	
}

class Thread1 extends Thread {
	@Override
	public void run() {
		System.out.println("Thread1 실행");
	}
}

