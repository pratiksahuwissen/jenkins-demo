import java.util.*;

public class CalcExecutor{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Calculator calculator = new Calculator();
		System.out.println("Enter a<SPACE>operator<SPACE>b");
		String[] ab = sc.nextLine().split(" ");
		int a = Integer.parseInt(ab[0]);
		int b = Integer.parseInt(ab[2]);
		System.out.println("a : " + a + "  b : " + b);
		if(ab[1].equals("+"))
			System.out.println("Result of addition is : " + calculator.add(a, b));
		else if(ab[1].equals("-"))
			System.out.println("Result of subtraction is : " + calculator.subtract(a, b));
		
	}
}