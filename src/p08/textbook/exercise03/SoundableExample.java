package p08.textbook.exercise03;

public class SoundableExample {
	private static void printSound(Soundable soundable) {
		soundable.sound();
		
//		System.out.println(soundable.sound());
//		pringln();  이것은 boolean Type?! 
	}
	
	public static void main(String[] args) {
		printSound(new Cat());
		printSound(new Dog());
	}
	
}
