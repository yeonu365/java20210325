package p07.lecture.p6polymorphism.ex2;

public class A01Override {
	public static void main(String[] args) {
		KindaCat k1 = new Cat();
		k1.cry();
		
		KindaCat k2 = new Tiger();
		k2.cry();
	}
}
