package p04.textbook.exercise;

public class Ex04Secondo {
	public static void main(String[] args) {

		int d1 = 0;
		int d2 = 0;

		do {	
			 d1 = (int) (Math.random() * 6) + 1;
			 d2 = (int) (Math.random() * 6) + 1;	
							
			System.out.println(d1 + "," + d2);
		} while ((d1 + d2) != 5);

		
		/*
		 int d1 = (int) (Math.random() * 6) + 1;
		 int d2 = (int) (Math.random() * 6) + 1;
		
		do {	
			System.out.println(d1 + "," + d2);
		} while ((d1 + d2) != 5);
		*/
		// 주사위를 여러번 던져야 한다. Math.random() 이 do {} 안으로 들어와야하고,
		// d1 과 d2 를 do{} while{} 모두에서 사용 해야하니, 밖으로 빼주기.
		
	} 
}

