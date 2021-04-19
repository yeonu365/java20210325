package p10.lecture;

public class A08TryCatch {
	public static void main(String[] args) {

		System.out.println("실행");

		try {
			System.out.println("try 시작");

			int[] arr1 = { 5, 6, 7 };
			System.out.println(arr1[2]);   
			//<--exception 발생 할경우 catch{} 으로 넘어간다. (16번 실행X)
			//<--exception 발생 안할경우 catch{} 실행 되지 않는다.
			
			System.out.println("try 종료");
		
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("catch 시작");
			System.out.println(e.getMessage());
			System.out.println("catct 종료");
		}

		System.out.println("종료");
	}

}
