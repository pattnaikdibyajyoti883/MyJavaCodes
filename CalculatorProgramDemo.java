package interviewProgrammingQuestions;

import java.util.Scanner;

public class CalculatorProgramDemo {

	public static void main(String[] args) 
	{
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the numbers ");
		int num1 = reader.nextInt();
		int num2 = reader.nextInt();
		System.out.print("Choose any operator from the given option(*,-,+,/) ");
		char operator = reader.next().charAt(0);
		double output = 0;
		
		switch (operator) 
		{
		case '*': 
			output = num1*num2;
			break;
			
		case '/': 
			output = num1/num2;
			break;
			
		case '+': 
			output = num1+num2;
			break;
			
		case '-': 
			output = num1-num2;
			break;
		
		default:
			System.out.println("You have entered an invalid operator");
			break;
		}
		System.out.println(num1+" " + operator + " " +num2+ " = " + output );

	}

}
