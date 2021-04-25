package yuCloudStudying;

import java.util.Scanner;

public class UsingScanner {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("이름입력");
		String name = scan.nextLine();
		System.out.println("나이입력");
		int age = scan.nextInt();
		
		System.out.println("hello");
		System.out.println("I am " + name + ".");
		System.out.println("I`m " + age + "years old.");
		System.out.println("Thank you!");
				
	}
}
