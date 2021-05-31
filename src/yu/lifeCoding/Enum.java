package yu.lifeCoding;
//class Fruit {
//	public static final Fruit APPLE = new Fruit();
//}
enum Fruit {
	APPLE("red"), PEACH("pink"), BANANA("yellow");
	private String color;
	public String getColor() {
		return this.color;
	}
	Fruit (String color) {
		System.out.println("Call Constructor "+this);
		this.color = color;
	}
}
enum COMPAMY {
	GOOGLE, APPLE, ORACLE;
}


public class Enum {
	public static void main(String[] args) {
		for(Fruit f : Fruit.values() ) {
			System.out.println(f+", " +f.getColor());
		}
		
		Fruit type = Fruit.APPLE;
		switch(type) {
		case APPLE:
			System.out.println(57+" kacl, color "+Fruit.APPLE.getColor());
			break;
		case PEACH:
			System.out.println(34+" kacl, color "+Fruit.PEACH.getColor());
			break;
		case BANANA:
		System.out.println(93+" kacl, color "+Fruit.BANANA.getColor());
		}
	}
}
