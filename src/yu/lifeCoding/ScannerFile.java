package yu.lifeCoding;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerFile {
	public static void main(String[] args) {
		try {
		File file = new File("out.txt");
		Scanner scan = new Scanner(file);
		while(scan.hasNextInt()) {
			System.out.println(scan.nextInt()*100);
		}
		scan.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
