package p18.lecture.network;

import java.net.InetSocketAddress;
import java.net.Socket;

public class A03SocketClient {
	public static void main(String[] args) {
		Socket socket = null;
		
		try {
			socket = new Socket();
			 System.out.println("[연결 요청]");
			socket.connect(new InetSocketAddress("1.233.188.140", 5001));
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (socket != null) {
				try {
					Socket.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
					
				}
			}
		}
	}
}
