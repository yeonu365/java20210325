package p02.textbook;

public class VariableScopeExample {
	public static void main(String[] args) {
		int v1 = 15;
		if (v1 > 10) {
			int v2 = v1 - 10;
		}
//		int v3 = v1 + v2 + 5;  <-- V2 는 if문 안에서만 사용. 끝.
	}
}
