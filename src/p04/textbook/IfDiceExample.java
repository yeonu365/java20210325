package p04.textbook;

public class IfDiceExample {
	public static void main(String[] args) {
		int num = (int)(Math.random()*6) +1;
		
		if (num == 1) {
			System.out.println("one");
		} else if (num == 2) {
			System.out.println("two");
		} else if (num == 3) {
			System.out.println("tree");
		} else if (num ==4) {
			System.out.println("four");
		} else if (num == 5 ) {
			System.out.println("five");
		} else {
			System.out.println("six");
		}
	}
}
