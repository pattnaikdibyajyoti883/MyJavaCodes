package practisePrograms;

import java.util.Scanner;

public class AddTwoInteger {

	public static void main(String[] args) 
	{
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter the numbers - ");
		int num1 = reader.nextInt();
		int num2 = reader.nextInt();
		double num3 = reader.nextDouble();
		System.out.print("Sum of the numbers entered by the user = " +(num1+num2+num3));

	}

}
