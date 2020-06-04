package interviewProgrammingQuestions;

import java.util.Scanner;

public class SumOfGivenNumbersByUser {

	public static void main(String[] args) 
	{
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the first number =  ");
		int num1 = reader.nextInt();
		
		System.out.println("Enter the second number = ");
		int num2 = reader.nextInt();
		
		System.out.println("Enter the third number = ");
		int num3 = reader.nextInt();
		
		int sum = num1+num2+num3;
		
		System.out.println("Sum of all the numbers entered by the user = " +sum);

	}

}
