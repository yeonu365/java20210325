package yu.lifeCoding;

public class Reference {
	static void _value(int b) {
		b=2;
		System.out.println("b값은 " + b);
		
	}
	static void runValue() {
		int a =1;
		_value(a);
		System.out.println("a값은 " + a);

	}
	public static void main(String[] args) {
		runValue();
		
	}
}
