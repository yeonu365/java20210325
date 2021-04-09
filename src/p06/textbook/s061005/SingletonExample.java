package p06.textbook.s061005;

public class SingletonExample {
	public static void main(String[] args) {
//		Singleton obj1 = new Singleton();    <-- private
//		Singleton obj2 = new Singleton();    <-- private
		
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();

		if(obj1 == obj2) {
			System.out.println(" the same Singleton object");
		} else {
			System.out.println(" different Singleton object");
		}
	}
}
