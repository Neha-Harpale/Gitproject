package controlStatement;

public class CalculatorSub {
	
	public void Substraction (int num1, int num2) 
	{
	int	Substraction = num1*num2;
	System.out.println(" Substraction = " + Substraction);
	
	
	}

	public static void main(String[] args) {
		CalculatorSub s = new CalculatorSub();
		s.Substraction(50, 25);
		
	}

}
