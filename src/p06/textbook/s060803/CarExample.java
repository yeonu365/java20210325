package p06.textbook.s060803;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		int spd = myCar.getSpeed();
		System.out.println("현재속도: " + spd + "km/h");
		
		
		myCar.keyTurnOn();
		myCar.run();
		
		spd = myCar.getSpeed();
		System.out.println("현재속도: " + spd + "km/h");
		
	}
}
