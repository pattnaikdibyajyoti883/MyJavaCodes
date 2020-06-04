package practisePrograms;

import java.util.Scanner;

public class NaturalNumberSum {

	public static void main(String[] args) 
	{
		int sum = 0;
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter the range for which you want the sum of natural number ");
		int number = reader.nextInt();
		
		
		for (int i = 0; i <=number; i++) 
		{
//			sum = sum+i;
			sum +=i;
		}
		System.out.println(sum + " is the sum of the given range of natural numbers");

	}

}
