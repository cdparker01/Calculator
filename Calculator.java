import java.util.Scanner;
public class Calculator
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer");
		int input = scan.nextInt();
		int x = input;
		
		System.out.println("Enter an opperation: +, -, /, %, *");
		char opp = scan.next().charAt(0);
		
		System.out.println("Enter a second integer");
		int input2 = scan.nextInt();
		int y = input2;	
		

		if(opp == '+')
		{
			Calculator.addition(x,y);
		}
		else if(opp == '-')
		{
			Calculator.subtraction(x,y);
		}
		else if(opp == '/')
		{
			Calculator.division(x,y);
		}
		else if(opp == '*')
		{
			Calculator.multiplication(x,y);
		}
		else if(opp == '%')
		{
			Calculator.mod(x,y);
		}

	}
	public static void addition(int x, int y)
	{
		int sum = x + y;
		System.out.println(x + " + " +  y +  " = " + sum);
	}
	public static void subtraction(int x, int y)
	{
		int dif = x - y;
		System.out.println(x + " - " +  y +  " = " + dif);
	}
	public static void division(int x, int y)
	{
		int q = x / y;
		System.out.println(x + " / " +  y +  " = " + q);	
	}
	public static void multiplication(int x, int y)
	{
		int pro = x * y;
		System.out.println(x + " X  " +  y +  " = " + pro);
	}
	public static void mod(int x, int y)
	{
		int rem = x % y;
		System.out.println(x + " % " +  y +  " = " + rem);
	}
	
}

