package p04.lecture;

import java.util.Scanner;

public class A05IfSampleScanner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("input>");
		String str = scanner.nextLine();
		
		System.out.println("output>");
		System.out.println(str);
		
		System.out.println("number in>");
		int in = scanner.nextInt();
		
		System.out.println("number out>");
		System.out.println(in);
	}
}
