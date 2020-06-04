package interviewProgrammingQuestions;

import java.util.Scanner;

public class PrintEvenNumbers {

	public static void main(String[] args) 
	{
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter the number- " );
		int number  = reader.nextInt();
		
		for (int i = 2; i <=number; i++) 
		{
			if (i%2==0) 
			{
				System.out.println("Final series is - " + i);

			}
					}

	}

}
