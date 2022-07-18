package arithmeticcalculator;

// Importing Scanner class for taking user input 
import java.util.*;

public class Calculator {
	static int n1, n2;
	Calculator(int n1,int n2){
		this.n1=n1;
		this.n2=n2;
	}
	Scanner sc = new Scanner(System.in);
	int addition()
	{
		System.out.println("Enter first number for addition");
		n1=sc.nextInt();
		System.out.println("Enter second number for addition");
		n2=sc.nextInt();
		return n1+n2;
	}
	int subtraction()
	{
		System.out.println("Enter first numbers for subtraction");
		n1=sc.nextInt();
		System.out.println("Enter second numbers for subtraction");
		n2=sc.nextInt();
		return n1-n2;
	}
	int multiplication()
	{
		System.out.println("Enter first numbers for multiply");
		n1=sc.nextInt();
		System.out.println("Enter second numbers for multiply");
		n2=sc.nextInt();
		return n1*n2;
	}
	int division()
	{
		System.out.println("Enter first numbers for divide");
		n1=sc.nextInt();
		System.out.println("Enter second numbers for divide");
		n2=sc.nextInt();
		return(n1/n2);
	}
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the operation that you want to perform by writing the correct form as mention below:- \n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division");
		String str = s.nextLine();
		Calculator obj = new Calculator(n1,n2);
		int n=0;
		switch(str)
		{
		case "Addition":
			n=obj.addition();
			break;
		case "Subtraction":
			n=obj.subtraction();
			break;
		case "Multiplication":
			n=obj.multiplication();
			break;
		case "Division":
			n=obj.division();
			break;
		default:
			System.out.println("Wrong operations selected or Character don't match with the input");
		}
		System.out.println("Answer = "+n);
	}
}