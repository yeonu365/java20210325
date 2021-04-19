package p10.textbook.s100501;

public class FileInputStream implements AutoCloseable {
	private String file;

	public FileInputStream(String file) {
		this.file = file;
	}

	public void read() {
		System.out.println(file + "을 읽습니다.");
	}

	@Override   // AutoCloseable 의 추상 메소드 재정의 필요!
	public void close() throws Exception {
		System.out.println(file + "을 닫습니다.");
	}

}
