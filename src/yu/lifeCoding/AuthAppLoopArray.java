package yu.lifeCoding;

import java.util.Scanner;

public class AuthAppLoopArray {
	public static void main(String[] args) {

//		String[] users = {"egoing", "jinhuck", "youbin"};
		String[][] users = {
				{"egoing", "1111"},
				{"jinhuck", "2222"},
				{"youbin", "3333"}
		};
//		Scanner scanner = new Scanner (System.in);
		
//		System.out.println("input");
//		String scan = scanner.next();

		String inputId = args[0];
		String inputPass = args[1];
//		System.out.println(users[i]);
		
		boolean isLogined = false;
		for(int i=0; i<users.length; i++) {
			String[] current = users[i];
			if(current[0].equals(inputId) && current[1].equals(inputPass)) {
				isLogined = true;
				break;
			}
		}
		System.out.println("Hi,");
		if (isLogined) {
			System.out.println("Master!!");
		} else {
			System.out.println("Who are you?");
		}
		
		
		
	}
}
