package p09.lecture;

public class A04LocalClassAccess {
//	public static void main(String[] args) {
		
	void method(int param) {
		// param 과 localVar는 묵시적 final(effectively final)
		int localVar = 3;
		
//		localVar = 4;   <-- 살아나면 line 13 의 localVar 에 밑줄 생김.
		
		class LocalClass {
			void method1() {
				System.out.println(localVar);
				System.out.println(param);
			}
		}
	}
}
