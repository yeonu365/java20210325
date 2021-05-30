package yu.lifeCoding;
abstract class Calculator {
	int letf, right;
	public void setOprands(int left, int right) {
		this.letf = left;
		this.right = right;
	}
	// 아래 _sum 메소드는 default
	int _sum() {
		return this.letf + this.right;
	}
	public abstract void sum();
	public abstract void avg();
	public void run() {
		sum();
		avg();
	}
}

public class Abstract {
	public static void main(String[] args) {
		CalculatorPlus c1 = new CalculatorPlus();
		c1.setOprands(10, 20);
		c1.run();
		
		CalculatorMinus c2 = new CalculatorMinus();
		c2.setOprands(10, 20);
		c2.run();
	}

}
class CalculatorPlus extends Calculator {
	@Override
	public void sum() {
		System.out.println("+ sum:" + _sum());
	}
	@Override
	public void avg() {
		System.out.println("+ avg:" + _sum()/2);
	}
}
class CalculatorMinus extends Calculator {

	@Override
	public void sum() {
		System.out.println("- sum:" +(this.letf+this.right));
	}

	@Override
	public void avg() {
		System.out.println("- avg:" +(this.letf+this.right)/2);
	}
	
}
