package controlStatement;

public class CalculatorAdd
 {
	
	public void Addition ( int num1, int num2) 
	{
		int  Addition = num1+num2;
		System.out.println(" Addition = " + Addition);
	}
	
	public static void main(String[] args) {
		
		CalculatorAdd A = new CalculatorAdd();
		A.Addition(10, 20);
		
		
	}

}
