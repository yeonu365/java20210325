package p03.textbook;

public class SignOperatorExample {
public static void main(String[] args) {
	int x = -100;
	int result1 = +x;
	int result2 = -x;
	System.out.println("reault1=" + result1);
	System.out.println("result2=" + result2);
	
	short s = 100;
//	short result3 = -s;  
	//s에 (-) 를 하는 연산 행위가 일어남. 
	//int (-) -> -s 는 int 타입이 된다 
	//short result3 = (short) -s;  <--- 강제 short 결과값 도출 가능!
	
	int result3 = -s;
	System.out.println("result3=" + result3);
	
	
}
}
