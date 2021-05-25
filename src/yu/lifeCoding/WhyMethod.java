package yu.lifeCoding;

public class WhyMethod {

		
	public static void main(String[] args) {
		printTwoTimes("a", "-");
		System.out.println(twoTimes("a", "-"));
		
		
		printTwoTimes("b", "*");
	}
	
	public static String twoTimes(String text, String delimiter) {
		String out="";
		out = out + delimiter + "\n";
		out = text + "\n";
		out = text + "\n";
		return out;
	}
	
	
	public static void printTwoTimes(String text, String delimiter) {
		System.out.println(delimiter);
		System.out.println(text);
		System.out.println(text);
	}
	
}
