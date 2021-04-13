package p03.textbook;

public class Exercise03ex08again {
	public static void main(String[] args) {
		double x = 5.0;
		double y = 0.0;
		
		double z = x % y;
		
		if(Double.isNaN(z)) {
			System.out.println("나눌 수 없다.");
		} else {
			double result = z + 10;
			System.out.println("결과: " +result);
		}
	}
}
