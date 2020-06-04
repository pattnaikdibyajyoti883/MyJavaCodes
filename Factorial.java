package practisePrograms;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) 
	{
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter the number for which you want to find factorial - ");
		int num = reader.nextInt();
		
		int factorial = 1;
		
		for (int i = 1; i <=num; i++) 
		{
//			factorial = factorial*i;
			factorial*=i;
		}
		System.out.println("The factorial of " + num + " is = " + factorial);

	}

}
