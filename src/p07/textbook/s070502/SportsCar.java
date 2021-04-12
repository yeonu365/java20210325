package p07.textbook.s070502;

public class SportsCar  extends Car {
	@Override
	public void speedUp() { speed +=10; }
	
//	@Override  <--Car class 에서 final void stop() 메소드이기 때문에 override 불가.
//	public final void stop() {
//		System.out.println("스포츠카를 멈춤");
//		speed = 0;
//	}

}
