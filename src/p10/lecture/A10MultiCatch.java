package p10.lecture;

public class A10MultiCatch {
	public static void main(String[] args) {
		
		try {
			
		String[] arr1 = {"300", "abc"};
		int i = Integer.parseInt(arr1[0]);
//		System.out.println(arr1[0]);
		} catch(NumberFormatException e) {
			System.out.println("수 형식 오류");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 인덱스 참조 오류");
		} finally {
			System.out.println("항상 실행 코드");
		}
		System.out.println("종료");
	}
}
