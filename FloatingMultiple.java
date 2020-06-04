package practisePrograms;

import java.util.Scanner;

public class FloatingMultiple {

	public static void main(String[] args) 
	{
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter the numbers - ");
		float num1 = reader.nextFloat();
		float num2 = reader.nextFloat();
		float num3 = reader.nextFloat();
		System.out.print("Product of numbers entered by the user is = " + (num1*num2*num3));

	}

}
