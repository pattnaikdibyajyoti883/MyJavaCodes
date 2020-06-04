package interviewProgrammingQuestions;

import java.util.Scanner;

public class PerfectSquare {

	public static void main(String[] args) 
	{
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the number = ");
		int number = reader.nextInt();
		int Flag=0;
		for (int i = 1; i <= number; i++) 
		 {
			if (i*i==number) 
			{
				System.out.println("Given number is a perfect square of " + i);
				Flag=1;
				return;
			}
			/*
			 * else { System.out.println("Not a perfect square"); }
			 */
	}
		if(Flag==0)
			System.out.println("Not a perfect square");
}
}


