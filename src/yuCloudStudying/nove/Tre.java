package yuCloudStudying.nove;

public class Tre {
	public static void main(String[] args) {
		Cat cat1 = new Cat();
		Cat cat2 = new Cat();
		
		cat1.meow();
		cat2.meow();
		cat1.claw();
		cat2.claw();
	}
	
}

class Cat {
	void meow () {
		System.out.println("야옹~");
	}
	void claw () {
		System.out.println("할퀴기!! 슥샥!");
	}
}