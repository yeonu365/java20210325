package p06.textbook.s060802;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.setGas(5);
		
		boolean gasState = myCar.isLeftGas();
		if (gasState) {
			System.out.println("DEPARTURE");
			myCar.run();
		}
		
		if(myCar.isLeftGas()) {
			System.out.println("ENOUGH GAS");
		} else {
			System.out.println("NEED GAS");
		}
	}
	
	
}
