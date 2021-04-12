package p06.textbook.exercise.ex20;

import java.util.Scanner;

public class BankAllication {
	private static Account[] accountArray = new Account[100];
	
	private static int size =0;
	
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("---------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("---------------------------------------------------");
			System.out.println("선택> ");
				
		int selectNo = scanner.nextInt();
		
		if(selectNo ==1) {
			createAccount();
		} else if(selectNo ==2) {
			accountList();
		} else if(selectNo ==3) {
			deposit();
		} else if(selectNo ==4) {
			withdraw();
		} else if(selectNo ==5) {
			run = false;
		}
	}
		scanner.close();
		System.out.println("프로그램 종료");
}
	private static void createAccount() {
	System.out.println("---계좌생성---");
	System.out.println("계좌번호: ");	
	String ano = scanner.next();
		
	System.out.println("계좌주: ");
	String owner = scanner.next();
	
	System.out.println("초기 입금액: ");
	int money = scanner.nextInt();
	
	Account newAccount = new Account(ano, owner, money);
	accountArray[size++] = newAccount;
	
		System.out.println("계좌가 생성되었습니다.");
	}
	
	private static void accountList() {
		System.out.println("---계좌목록---");
		
		for (int i =0; i < size; i++) {
			System.out.print(accountArray[i].getAno() + "\t");
			System.out.print(accountArray[i].getOwner() + "\t");
			System.out.println(accountArray[i].getBalance());
		}
	}
	private static void deposit() {
		System.out.println("---예금---");
		System.out.println("계좌번호: ");	
		String ano = scanner.next();
		System.out.println("입금액: ");
		int money = scanner.nextInt();
		
		Account account = findAccount(ano);
		account.setBalance(account.getBalance() + money);
		
		System.out.println("결과: 예금성공");
	}
	
	private static void withdraw() {
		System.out.println("---출금---");
		System.out.println("계좌번호: ");
		String ano = scanner.next();
		System.out.println("출금액: ");
		int money = scanner.nextInt();
		
		Account account = findAccount(ano);
		
		if (account !=null) {
			account.setBalance(account.getBalance() - money);
			System.out.println("결과: 출금성공");
		}
		
//		if (Account account != findAccount(ano)) {
//			System.out.println("없는 계좌입니다.");
//		}
	}
	
	private static Account findAccount(String ano) {
		for (int i = 0; i < size; i++) {
			if (accountArray[i].getAno().equals(ano)) {
				return accountArray[i];
			}
		}
		System.out.println("없는 계좌입니다.");
		return null;
	}
}

