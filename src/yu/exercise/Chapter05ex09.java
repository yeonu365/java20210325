package yu.exercise;

import java.util.Scanner;

public class Chapter05ex09 {
	public static void main(String[] args) {
		boolean run = true;
		int stuNum =0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("------------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("------------------------------------------------------");
			System.out.println("선택-->");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo ==1) {
				System.out.println("학생수->");
				stuNum = scanner.nextInt();
				scores = new int[stuNum];				
				
			} else if(selectNo ==2) {
				for (int i =0; i < scores.length; i++) {
					System.out.println("scores[" + i + "]->");
					scores[i] = scanner.nextInt();
				}
								
			} else if(selectNo ==3) {
				for (int i =0; i< scores.length; i++) {
					System.out.println("scores[" + i + "]" + scores[i]);
				}
				
			} else if(selectNo ==4) {
				int max = 0;
				for( int i =0; i<scores.length; i++) {
					if (max<scores[i]) {
					max = scores[i];
				    }
				}
				System.out.println("max= " +max);
				
				
			} else if(selectNo ==5) {
				run = false;
			}
		}
		
		System.out.println("종료");
	}
}
