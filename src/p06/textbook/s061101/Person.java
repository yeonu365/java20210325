package p06.textbook.s061101;

public class Person {
	final String nation = "Korea";
	final String ssn;
	String name;

	public Person(String ssn, String name) {

		this.ssn = ssn;    /// <-- 생성자에의해 정보를 받아랏.(this) (instance가 만들어질때) 
		this.name = name;
	}
}
