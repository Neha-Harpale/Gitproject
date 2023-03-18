package controlStatement;

public class CalculatorDiv {

	public void division(int num1 ,int num2 )
	{
		int Division = num1/num2;
		System.out.println(" Division = " + Division);
		
	}
	public static void main(String[] args) {
		CalculatorDiv d = new CalculatorDiv();
		d.division(10,5);
	}
}
