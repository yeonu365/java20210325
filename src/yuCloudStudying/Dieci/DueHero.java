package yuCloudStudying.Dieci;

public class DueHero {
	public static void main(String[] args) {
		Hero ironMan = new Hero("Ironman", 160);
		Hero captain = new Hero("Captain", 160);

		captain.punch(ironMan);
		ironMan.punch(captain);
		ironMan.punch(captain);
//		Hero 객체를 받아오는 코드.
//		captain 객체가 주체가 되어 punch method를 수행할때
//		그 입력값으로 객체 ironMan을 던진다.
	}
//	객체또한 메소드의 파라미터로 전달 가능하다.
//	Hero 라는 class 가 있다. 안에는 punch method가 있고
//	parameter는 Hero type의 enemy 라는 변수가 정의 되어있다.
//	(= 전달값으로 Hero 객체를 받을 수 있다.)
//	 
}

class Hero {
	String name;
	int hp;

	public Hero(String s, int i) {
		name = s;
		hp = i;
	}

	void punch(Hero enemy) {
		System.out.println(name + "의 펀치!!");
		System.out.println(enemy.name + "의 hp: " + enemy.hp);
		enemy.hp -= 10;
		System.out.println("-> " + enemy.hp);
	}
}