package p10.textbook.s100201;

public class NullPointerExceptionExample {
	public static void main(String[] args) {
		System.out.println("실행");
		String data = null;
		if (data != null) {
			System.out.println(data.toString());
		}
		System.out.println("종료");
	}
}
