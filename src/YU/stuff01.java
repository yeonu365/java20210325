package YU;

import java.util.Scanner;

public class stuff01 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("두 수를 입력하세요");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();

		System.out.println("입력 받은 두 수는 " + num1 + "과" + num2);
		int i;
		boolean isPrime = true;

		for (i = 2; i < num1; i++) {
			if (num1 % i == 0) {
				System.out.print(i + " ");
				isPrime = false;
			}
		}
		if (isPrime) {
			System.out.println("너는 소수");
		}

		System.out.println();

		for (int j = 2; j < num2; j++) {
			if (num2 % j == 0) {
				System.out.print(j + " ");
				isPrime = false;
			}
		}
		if (isPrime) {
			System.out.println("너도 소수");

		}
	}
}
