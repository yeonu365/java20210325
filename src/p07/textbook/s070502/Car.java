package p07.textbook.s070502;

public class Car {

	public int speed;
	
	public void speedUp() { speed +=1; }
	
	public final void stop() {
		System.out.println("멈춤");
		speed = 0;
	}
}
