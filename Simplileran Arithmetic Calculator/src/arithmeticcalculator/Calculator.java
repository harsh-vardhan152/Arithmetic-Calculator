package arithmeticcalculator;

// Importing Scanner class for taking user input 
import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		
		// Deceleration of variables
		double num1,num2,result;
		int op;
		
		// Creating scanner object for taking input from user
		System.out.println("Enter two number");
		Scanner sc = new Scanner(System.in);
		num1=sc.nextDouble();
		num2=sc.nextDouble(); 
		
		// Selecting the operations that should be performed with this calculator 
		System.out.println("Select the operations from \n1. Addtion\n2. Subtraction\n3. Multiplication\n4. Division");
		op= sc.nextInt();
		
		if(op==1)
		{
			result= num1+num2;
			System.out.println("Addition "+result);
		}
		else if(op==2)
		{
			result= num1-num2;
			System.out.println("Subtraction "+result);
		}
		else if(op==3) 
		{
			result= num1*num2;
			System.out.println("Multiplication "+result);
		}
		else if(op==4)
			{
			result= num1/num2;
			System.out.println("Division "+result);	
			}
		// if user input invalid number then this line of code is executed 
		else {
			System.out.println("Inavlid opertions is Selected/Invalid Request");
		}
	}
}
