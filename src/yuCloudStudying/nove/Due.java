package yuCloudStudying.nove;

public class Due {
	public static void main(String[] args) {
		Bicycle b1 = new Bicycle();

		
		b1.name = "로드형 자전거";
		b1.weight = 7.25;
		b1.price = 326000;
				
		System.out.println("b1->{" + b1.name + ", " +b1.weight+ ", " + b1.price +"}");
		
	}
	
}

class Bicycle {

	public String name;
	public double weight;
	public int price;
}
