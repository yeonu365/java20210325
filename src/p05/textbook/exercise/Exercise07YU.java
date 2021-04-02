package p05.textbook.exercise;

public class Exercise07YU {
	public static void main(String[] args) {

		int[] array = {1,5,3,8,2};
		int max = array[0];
		int min = array[0];
		
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
				}
		}
		System.out.println("max: " + max);
		
		System.out.println();
		for(int i = 1;i<array.length;i++) {
			if (array[i] < min) {
				min = array[i];
				}
		}
		System.out.println("min: "+min);
		
		System.out.println();
		int sum =0;
		int avg;
		
		for (int i =0; i < array.length; i++) {
			sum += array[i];
	
		}
	    avg = sum / array.length;
	    
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		}
		

}



