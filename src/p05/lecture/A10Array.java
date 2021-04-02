package p05.lecture;

import java.util.Arrays;

public class A10Array {
	public static void main(String[] args) {
		// array : 여러개의 값을 갖는 자료형
		
		int i;
		i = 5;
		
//		 int[] arr = new int[3];  이렇게 한번에 입력도 가능.
		 
//		 int[] arr = new int[] {5,7};  
		// int[] arr = {5,7}; 스트링값을 바로 주듯이 값을 바로 입력 가능ok.
		
		int[] arr; //배열도 참조타입
		arr = new int[3];
		arr[0] = 5;
		arr[1] = 7; // 값을 주지 않으면 기본값 0 이다.
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		System.out.println(Arrays.toString(arr));
		// array 값 한번에 출력하기
				
		
	}
}
