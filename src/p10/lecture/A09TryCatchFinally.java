package p10.lecture;

public class A09TryCatchFinally {
	public static void main(String[] args) {
		System.out.println("execute");
		
		try {
			System.out.println("try evoke");
			int[] arr1 = {2,3,4};
			System.out.println(arr1[0]);
			System.out.println("try ends");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("catch evoke");
			System.out.println(e.getLocalizedMessage());
			System.out.println("catch ends");
			
		} finally {
			System.out.println("finally {} always evoke");
		}
		// 항상 실행 되는 finally{}
		
		System.out.println("the end");
	}
}
