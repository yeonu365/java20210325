package p07.textbook.exercise.ex5;

public class Child extends Parent {
	private int studentNo;
	
	public Child(String name, int studentNo) {
//		this.name = name;
		super(name);
		this.studentNo = studentNo;
	}
}
