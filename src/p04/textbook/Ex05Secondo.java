package p04.textbook;

public class Ex05Secondo {
	public static void main(String[] args) {
		
		// x, y 자연수이다. 1부터 시작해애
		for (int x =1; x<=10; x++) {
			for (int y=1; y <=10; y++) {
			    if ((4 * x) + (5 * y) == 60) {
				   System.out.println("(" + x + "," + y + ")");
		     	}
		    }
		}
	}
}