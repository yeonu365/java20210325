package p02.lecture;

public class A12TypeConversion {
	public static void main(String[] args) {
		//실수
		float floatVar1 = 3.14F;
		double doubleVar1;
		
		//자동 형변환
		doubleVar1 = floatVar1;
		
		//강제 형변화 (casting)
		floatVar1 = (float) doubleVar1;
		
		// 정수 -> 실수 
		int intVar1 = 3;
		float floatVar2 = intVar1;
		double doubleVar2 = intVar1;
		
		//실수 -> 정수 !강제 형변화를 시켜줘야한다.!
		double doubleVar3 =3.14;
		int intVar3 = (int) doubleVar3;
		System.out.println(intVar3);
		
		
	}
}
