package yu;

public class ForWhile {
	public static void main(String[] args) {

		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println(sum);

		int i = 1;
		int plus = 0;
		while (i <= 100) {
			plus += i;
			i++;
		}
		System.out.println(plus);
	}
	
}
