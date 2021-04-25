package yuCloudStudying;

public class CalculateKcal {
	public static void main(String[] args) {
		int per = 3;
		
		double res = calcu(per);
		
		System.out.printf("삼겹살 %d인분: %.2f kcal", per, res);
	
	}
	
	public static double calcu (int a) {
		return a * 180 * 5.179;
	}
	
}

