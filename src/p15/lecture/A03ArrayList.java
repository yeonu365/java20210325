package p15.lecture;

import java.util.Arrays;

public class A03ArrayList {
	public static void main(String[] args) {
		int[] arr1 = new int[3];
		arr1[0] = {99,100,101};
		
		
		arr1 = Arrays.copyOf(arr1, 4);
		arr1[3] = 102;
		
		System.out.println(Arrys.toString(arr1));
		List<Integer> list = new ArrayList<>();
				
	}
}
