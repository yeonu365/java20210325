package yu;

public class Operations {
	public static void main(String[] args) {
		int x=10;
		int y=10;
		int z;
		
		x++;
		System.out.println(x);  //x= 11
		
		--x;
		System.out.println(x);  //x= 10
		
		z = x++;
		System.out.println("z= " + z);  //z= 10
		System.out.println("x= " + x);  //x = 11
		
		z = --y;
		System.out.println("z= " + z);  //z= 9
		System.out.println("y= " + y);  //z= 9

	}
}
