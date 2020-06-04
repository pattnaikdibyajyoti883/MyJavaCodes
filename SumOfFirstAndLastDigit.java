package interviewProgrammingQuestions;

import java.util.Scanner;

public class SumOfFirstAndLastDigit {

	public static void main(String[] args) 
	{
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the number = ");
		int number = reader.nextInt();
		
		int lastDigit = number%10;//FINDING THE LAST DIGIT FROM THE GOVEN NUMBER.
		int firstDigit = number;
		
		while (firstDigit>=10) 
		{
			firstDigit = firstDigit/10;
		}
		System.out.println("First Digit of the number = " + firstDigit);
		System.out.println("Last Digit of the number = " + lastDigit);
		System.out.println("Sum of first & last digit = " + (firstDigit+lastDigit));

	}

}
