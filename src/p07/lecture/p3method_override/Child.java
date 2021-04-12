package p07.lecture.p3method_override;

public class Child extends Parent {

	@Override  // annotation
	public void method1() {
		//재정의 & super 의 위치는 상관없다 (생성자에서는 상관 있다.!)
		System.out.println("method1 - child");
		super.method1();
	}
}
