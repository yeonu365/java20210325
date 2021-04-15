package p04.textbook.exercise;

import java.util.Scanner;

public class Exercise07 {
	public static void main(String[] args)  {
		boolean run = true;
		int balance = 0;
		
		Scanner scanner = new Scanner(System.in);

		
		
		while(run) {
			System.out.println("------------------------------------");
			System.out.println("1.예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("------------------------------------");
			System.out.println("선택-> ");
			int choose = scanner.nextInt();
		
	
		switch (choose) {
			case 1: 
			System.out.println("예금액");
			int input = scanner.nextInt();
			balance += input;
//			System.out.println("입금액");
//			System.out.println("입금후 잔액: " + balance + aa + "원");
			break;
			
			case 2:
				System.out.println("출금액");
				int output = scanner.nextInt();
				balance -= output;
				break;
								
			case 3:
				
				System.out.println("잔고는 " + balance);
				break;				
				
			case 4:
				run = false;
				break;
		  }		
		}
		
	
		
		System.out.println("종료");
	}
}
