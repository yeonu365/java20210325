package p08.textbook.s080205;

public interface RemoteControl {
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리");
		} else {
			System.out.println("무음해제");
		}
	}
	
	static void changeBattery() {
		System.out.println("건전지 교환");
	}
}
