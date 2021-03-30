package p03.textbook;

public class Exercise03ex02 {
	public static void main(String[] args) {
		int x = 10;
		int y =20;
		System.out.println(y);
		
		int z = (++x ) + (y--);
		System.out.println(z);
		
		System.out.println(y);
		System.out.println(x);
		
		int score = 85;
		String result = (!(score>90))? "가" : "나";
		System.out.println(result);


	}
}
