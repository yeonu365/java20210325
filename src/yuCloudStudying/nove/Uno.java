package yuCloudStudying.nove;

public class Uno {
	public static void main(String[] args) {
		Dog agi = new Dog();
		System.out.println("이름: " + agi.name);
		System.out.println("품종: " + agi.breeds);
		System.out.println("나이: " + +agi.age);
	}
}

class Dog {
	String name;
	String breeds;
	int age;

	void wag() {

	};

	void bark() {

	}
}
