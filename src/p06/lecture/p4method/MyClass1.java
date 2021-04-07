package p06.lecture.p4method;

public class MyClass1 {
	//fields  (변수 선언)
	int age;
	String name;
	// constructors
	 MyClass1() {
		 
	 }
	 MyClass1(String name) {
		 this.name = name;
	 }
		
	// mehtods
	 /*
	 리턴타입 메소트명(파라미터 리스트) {
		 실행될 명령문들
	 }
	 */
	 // 메소드명: $, _, 영문대소문자, 숫자 조합. (단, 숫자가 맨압에 오면 안됨.)
	 // 작명 관습: lowerCamelCase
	 // 파라미터 목록: [타입 명], [타입 명]
	 //               0개 이상 작성 가능 (없어도 된다~)
	 // 리턴타입 : 메소드가 반환해야 하는 값의 타입
	 //           void일 경우 반환하지 않아도 됨
	 void method1(String param1, int param2) {
		 // statements...
		 System.out.println("method1 호출~~~~~");
	 }
	 int method2() {
		 System.out.println("method2 호출!!!!");
		 return 3;
	 }
}
