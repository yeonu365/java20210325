package p99.programmers;

import java.util.Scanner;

public class p12969 {
	public static void main(String[] args) {
		// 직사각형 별찍기
		Scanner sc = new Scanner(System.in);
		System.out.println("두개의 자연수 입력");
		int a = sc.nextInt();
		int b = sc.nextInt();

//		System.out.println(a + "," + b);
		
		for (int j = 0; j < b; j++) {
			for (int i = 0; i < a; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}