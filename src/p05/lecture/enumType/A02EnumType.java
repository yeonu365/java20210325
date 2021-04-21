package p05.lecture.enumType;

public class A02EnumType {
	public static void main(String[] args) {
		String s = "VALUE1";

		switch (s) {
		case "VALUE1":
			System.out.println("value1");
			break;

		case "VALUE2":
			System.out.println("value2");
		default:
			System.out.println("neither one");
			break;
		}

		System.out.println("enum type");
		MyEnum e1 = MyEnum.VALUE1;

		switch (e1) {
		case VALUE1:
			System.out.println("value1");
			break;
		case VALUE2:
			System.out.println("value2");
			break;
		default:
			System.out.println("neither one");
			break;
		}
	}
}
