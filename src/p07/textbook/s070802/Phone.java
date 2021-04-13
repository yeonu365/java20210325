package p07.textbook.s070802;

public abstract class Phone {
	public String owner;
	
	public Phone(String owner) {
		this.owner = owner;
	}
	
	public void turnOn() {
		System.out.println("전원을 켭니다.");
			}
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
}
