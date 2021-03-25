package p02.lecture;

public class A07TypeCharEx1 {
	public static void main(String[] args) {
		String str = "lorem, ipsum";
		
		int count = 0;
		for (int i =0; i < str.length(); i++) {
			char c = str.charAt(i);
			
			if (('a' <= c && c <= 'z') || ('A' <= c && c < 'Z')) {
				count++;
			}
		}
		System.out.println(count);
	}
}
