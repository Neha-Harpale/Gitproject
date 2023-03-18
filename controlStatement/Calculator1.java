package controlStatement;

public class Calculator1 {
	
	public double division(double num1 ,double num2 )
	{
		double Division = num1/num2;
		System.out.println(" Division = " + Division);
		return Division;
	}
	
	public int Multiplication (int num1, int num2) 
	{
	int	Multiplication = num1*num2;
	System.out.println(" Multiplication = " + Multiplication);
	return Multiplication;
	
	}
	
	public int Substraction (int num1, int num2) 
	{
	int	Substraction = num1-num2;
	System.out.println("Substraction  = " + Substraction);
	return Substraction;
	}
	
	public static void main(String[] args) {
		Calculator1 calc = new Calculator1();
	
		 double total = calc.division(8,2);
		int total1 = calc.Multiplication(10, 20);
		int total2 = calc.Substraction(30, 10);
		System.out.println("Total = " + total);
		System.out.println("Total1 = " + total1);
		System.out.println("Total2 = " + total2);
		
		System.out.println(total*10   );
		System.out.println(total1*10  );
		System.out.println(total2*10  );
		}

}
