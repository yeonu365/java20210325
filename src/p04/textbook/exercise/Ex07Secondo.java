package p04.textbook.exercise;

import java.util.Scanner;

public class Ex07Secondo {
	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("----------------------------");
			System.out.println("1.예금 2.출금 3.잔고 4.종료");
			System.out.println("----------------------------");
			System.out.println("선택-->");
			int scan = scanner.nextInt();
			
			switch (scan) {
				case 1:
					System.out.println("예금액");
					int money1 = scanner.nextInt();
					balance += money1;
					break;	 
				case 2:
					System.out.println("출금액");
					int money2 = scanner.nextInt();
					if (money2 > balance) {
						System.out.println("잔고가 부족합니다.");
					} else {
					balance -= money2; }
					break; 
				case 3: 
					System.out.println("잔고");
					System.out.println(balance);
					break;
				case 4:
					run=false;
					break;
			}
		}
		System.out.println("종료");
	}
}
