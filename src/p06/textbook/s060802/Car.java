package p06.textbook.s060802;

public class Car {
	int gas;
	
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if(gas==0) {
			System.out.println("no gas");
			return false;
		}
		System.out.println("okay gas");
		return true;
	}
	void run() {
		while(true) {
			if(gas >0) {
				System.out.println("RUN. (gas lefts: " + gas + ")");
				gas -=1;
			} else {
				System.out.println("STOP. (gas lefts: " + gas + ")");
				return;
			}
		}
	}
}
