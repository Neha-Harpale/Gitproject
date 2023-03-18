package controlStatement;

public class CalculatorMulti {
	
	public void Multiplication (int num1, int num2) 
	{
	int	Multiplication = num1*num2;
	System.out.println(" Multiplication = " + Multiplication);
	
	
	}
	public static void main(String[] args) 
	{
		CalculatorMulti M = new CalculatorMulti();
		M.Multiplication(20, 4);
	}

}
