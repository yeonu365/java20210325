package p09.textbook.exercise.ex6;

public class Chatting {
	void startChat(String chatId) {
		String nickName = chatId;
		
		Chat chat = new Chat() {   
			
//chat 이라는 interface를 만들때 class를 함께 만듦. 아래의 class chat을 상속받아서 instace를 만듦.
			
			@Override
			public void start() {
				while(true) {
					String inputData = "안녕하세요";
					String message = "[" + nickName + "]" + inputData;
					sendMessage(message);					
				}
			}
		};
		chat.start();
	}
	
	class chat {
		void start() {	}
		void sendMessage(String message) {}
	}
}
