package yu;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		System.out.println("input");
		System.out.println("q = the end");
		
		
//		do {
			System.out.println("-->");
			Scanner scanner = new Scanner(System.in);
			String scan = scanner.nextLine();
			System.out.println(scan);
//		} while (!scanner.equals("q"));
		
	}
}
