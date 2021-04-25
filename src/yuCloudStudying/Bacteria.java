package yuCloudStudying;

public class Bacteria {
	public static void main(String[] args) {
		int[] bacteriaCountLogs = new int[10];
		writeLog(bacteriaCountLogs);
//		printLog(bacteriaCountLogs);
	}

	private static void writeLog(int[] logs) {
		System.out.print("[");
		
		for (int i = 0; i < logs.length; i++) {
			logs[i] = (int) Math.pow(2, i);
			System.out.print(logs[i] + " ");
			//	System.out.printf("%d", logs[i]);
			
			if (i!= logs.length-1) {
				System.out.print(",");
			}
		}
		System.out.println("]");
	}
}