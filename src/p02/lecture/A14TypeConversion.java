package p02.lecture;

public class A14TypeConversion {
	public static void main(String[] args) {
		//다른 타입끼리 녀산시 큰 타입으로 자동 형변환
		int intVar1 =33;
		int intVar2 =44;
		
		int intVar3 = intVar1 + intVar2;
		
		long longVar1 =55;
		
//		int intVar4 = intVar1 + longVar1;   불가
		long longVar2 = intVar1 + longVar1;
		
		double doubleVar1 =3.14;
//		int intVar5 = intVar1 + doubleVar1; 불가
		double doubleVar2 = intVar1 + doubleVar1;
		
		// 정수끼리 연산의 결과는 항상  int.
		byte b1 = 3;
		byte b2 =9;
//		byte b3 = b1 + b2; 불가
		int res = b1 + b2;
		
		char c1 ='a';
//		char c2 = c1 + 1; 
		
		byte b4 = 3 + 1;  // 선언과 동시 연산은 가능하다. 
		char c3 = 'a' + 1;
		
		
	}
}
