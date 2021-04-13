package yu;

public class Textbook101p {
	public static void main(String[] args) {
		int score = 85;
		String grade = (score > 90) ? "A" : "B";
//책에서 char 를 썼는데 String 으로 해도 됨. 단, 'A' -> "A" (String 이기 때문에 따옴표두개!)
		System.out.println(grade +"등급이야");
	}
}
