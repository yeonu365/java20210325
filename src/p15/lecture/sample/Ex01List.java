package p15.lecture.sample;

import java.util.Arrays;
import java.util.List;

public class Ex01List {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(7, 9, -100, 20, 90, 700);

		System.out.println(list);

		int sum = sum(list);
		System.out.println(sum);

		int max = max(list);
		System.out.println(max);

		int indexOfMax = indexOfMax(list);
		System.out.println(list.get(indexOfMax));
	}


	public static int max(List<Integer> list) {
		int index = 0;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < list.size(); i++) {
			if (max < list.get(i)) {
				max = list.get(i);
				index = i;
			}
		}
		return index;
	}
	
	private static int indexOfMax(List<Integer> list) {
		int max = Integer.MIN_VALUE;
		for (int n : list) {
			if (max < n) {
				max = n;
			}
		}
		return max;
	}

	public static int sum(List<Integer> list) {
		int sum = 0;
//		for (int n : list) {
		for (int i=0; i<list.size();i++) {
//			sum += n;
			sum += list.get(i);
		}
		return sum;
	}

}
