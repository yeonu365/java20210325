package p08.textbook.exercise05;

public class ActionExample {
	public static void main(String[] args) {
		
//		Action action;
//		action = new Action() {
		Action action = new Action() {
			
			@Override
			public void work() {
				System.out.println("복사를 합니다.");
			}
		};
		action.work();
	}
}
