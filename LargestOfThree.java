package practisePrograms;

import java.util.Scanner;

public class LargestOfThree {

	public static void main(String[] args) 
	{
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter the numbers - ");
		int num1 = reader.nextInt();
		int num2 = reader.nextInt();
		int num3 = reader.nextInt();
		
		if (num1>num2 && num1>num3) 
		{
			System.out.println(num1 + " is greater ");
		}
		else if (num2>num3 && num2>num1) 
		{
			System.out.println(num2 + " is greater ");
		}
		else
			System.out.println(num3 + " is greater ");
	}
}
