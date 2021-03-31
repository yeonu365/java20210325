package p04.textbook;

public class ForPrintFrom1To10Example {
	public static void main(String[] args) {

//		for(int i =1; i <=10; i++) {
//			System.out.println(i);
//		}

//		for(int i =1; i <=10; i++) {
//			if (i % 2 != 0) {
//			System.out.println(i);
//		    }
//		}
		for (int i = 1; i <= 10; i += 2) {
			System.out.println(i);
		}
//		for(int i =1; i <=10; i++) {
//			if (i % 2 == 0) {
//				System.out.println(i);
//			}
//		}
		for (int i = 2; i <= 10; i += 2) {
			System.out.println(i);
		}
		System.out.println();
//		for (int i =10; i > 0; i--) {
//			System.out.println(i);
//		}

//		for (int i = 10; i > 0; i--) {
//			if (i % 2 == 0) {
//				System.out.println(i);
//			}
//		}
		for (int i = 9; i > 0; i -= 2) {
			System.out.println(i);
		}
		System.out.println();
//		for (int i = 10; i > 0; i--) {
//			if (i % 2 != 0) {
//				System.out.println(i);
//			}
//		}
		for (int i = 10; i > 0; i -= 2) {
			System.out.println(i);
		}

	}
}
