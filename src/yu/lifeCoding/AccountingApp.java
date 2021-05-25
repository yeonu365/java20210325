package yu.lifeCoding;

public class AccountingApp {
	public static double valueOfSupply = 10000.0;
	public static double vatRate =0.1;
	
	public static double getVAT() {
		return valueOfSupply * vatRate;
	}
	public static double getTotal() {
		return valueOfSupply + getVAT();
	}
	
	public static void main(String[] args) {
	
//		double vat = valueOfSupply * vatRate;
//		double vat = getVAT();
//		double total = getTotal();
//		double total = valueOfSupply + vat;
		
		System.out.println("Value fo supply : " + valueOfSupply);
		System.out.println("VAT : " + getVAT());
		System.out.println("Total : " + getTotal());
	}
}
