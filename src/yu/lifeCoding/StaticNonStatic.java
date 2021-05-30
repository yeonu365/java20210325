package yu.lifeCoding;
class Foo {
	public static String classVar = "I class Var";
	public String instanceVar = "I instance Var";
	public static void classMethod() {
		System.out.println(classVar);
//		System.out.println(instanceVar);  <--instance변수라 불가
	}
	public void instanceMethod() {
		System.out.println(classVar);
		System.out.println(instanceVar);
	}
}
public class StaticNonStatic {
	public static void main(String[] args) {
		System.out.println(Foo.classVar);
//		System.out.println(Foo.instanceVar);  <--class달라서 안됨
		Foo.classMethod();
//		Foo.instanceMethod();  <--class달라서 안됨
		
		Foo f1 = new Foo();
		Foo f2 = new Foo();
		
		System.out.println(f1.classVar);
		System.out.println(f1.instanceVar);
		
		f1.classVar = "changed by f1";     // <-- f1의 classVar 변경
		System.out.println(Foo.classVar);  // <--Foo 변경 ok
		System.out.println(f1.classVar);  // <--f1 변경 ok
		System.out.println(f2.classVar);  // <--f2 변경 ok
		
		f1.instanceVar = "changed by f1";  // <-- f2의 classVar 변경
//		System.out.println(Foo.instanceVar);   <--class달라서 접근 불가 
		System.out.println(f1.instanceVar);  // <--f1 변경 ok 
		System.out.println(f2.instanceVar);  // <--f2 NOT 변경
	}
}
