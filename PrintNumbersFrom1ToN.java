package interviewProgrammingQuestions;

import java.util.Scanner;

public class PrintNumbersFrom1ToN {

	public static void main(String[] args) 
	{
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter the number - ");
		int number = reader.nextInt();
		
		for (int i = 1; i <= number; i++) 
		{
			System.out.println("Numbers printed are = " +i);
		}
		
	}

}
