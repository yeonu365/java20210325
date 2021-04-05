package p05.lecture;

import java.util.Arrays;

public class A28ArrayOfArray {
	public static void main(String[] args) {
		int[][] arr = new int[2][];
		
		arr[0] = new int[] {9,8,7};
		arr[1] = arr[0];
		
		for (int[] row:arr) {
			System.out.println(Arrays.toString(row));
		}
		System.out.println(Arrays.toString(arr[1]));
		
		System.out.println();

		arr[1][0] =10;
		arr[1][1] =20;
		arr[1][2] =30;
		System.out.println(Arrays.toString(arr[0]));
		
		System.out.println();
		for (int[] row : arr) {
			System.out.println(Arrays.toString(row));
		}
	}
}
