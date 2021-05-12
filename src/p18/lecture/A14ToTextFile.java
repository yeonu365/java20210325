package p18.lecture;

import java.io.FileWriter;
import java.io.Writer;
import java.util.Scanner;

public class A14ToTextFile {
	public static void main(String[] args) throws Exception {
		String file = "src/p18/lecture/output4.txt";
		Scanner scanner = new Scanner(System.in);

		Writer fw = new FileWriter(file);
		String line = "";

		while (!line.equals("종료")) {
			System.out.print("입력->");
			line = scanner.nextLine();
			
			if (line.equals("종료")) {
				break;
			}
			
			fw.write(line + "\n");
		}
		fw.close();
		scanner.close();
	}
}
