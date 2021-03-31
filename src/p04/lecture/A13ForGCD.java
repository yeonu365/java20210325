package p04.lecture;

import java.util.Scanner;

public class A13ForGCD {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("두 수를 입력하세요");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();

		System.out.println("입력 받은 두 수는 " + num1 + "과" + num2);

		for (int d = num1; d >= 1; d--) {
			if ((num1 % d) == 0 && (num2 % d) == 0) {
				System.out.println("최대공약수는 " + d);
				break;
			}
		}
		System.out.println("프로그램 종료합니다.");
		scanner.close();
	}
}
