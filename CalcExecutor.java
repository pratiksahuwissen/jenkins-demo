import java.util.*;

public class CalcExecutor{
	public static void main(String args[]){
		Calculator calculator = new Calculator();
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[2]);
		System.out.println("a : " + a + "  b : " + b);
		if(args[1].equals("+"))
			System.out.println("Result of addition is : " + calculator.add(a, b));
		else if(args[1].equals("-"))
			System.out.println("Result of subtraction is : " + calculator.subtract(a, b));
		else if(args[1].equals("x"))
			System.out.println("Result of subtraction is : " + calculator.multiply(a, b));
		
	}
}