package p02.lecture;

public class A02Scope {
	public static void main(String[] args) {

		int a;
		if (3 > 0) {
			int b;
			b = 3;
			System.out.println(b);
			
			if (2>0) {
				System.out.println(b);
			}
		}

	}
}
