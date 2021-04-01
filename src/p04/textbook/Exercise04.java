package p04.textbook;

public class Exercise04 {
	public static void main(String[] args) {

		int dice1 = 0;
		int dice2 = 0;

		do {
			dice1 = (int) (Math.random() * 6) + 1;
			dice2 = (int) (Math.random() * 6) + 1;

			System.out.println("(" + dice1 + "," + dice2 + ")");
		} while ((dice1 + dice2) != 5);

	}
}
