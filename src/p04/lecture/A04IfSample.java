package p04.lecture;

public class A04IfSample {
	public static void main(String[] args) {
		
		
		int user = 3;
		int dice = (int) (Math.random()*6) +1;
				
		if (user == dice) {
			System.out.println("축당첨");
		} else {
			System.out.println("재도전");
		}
	}
}
