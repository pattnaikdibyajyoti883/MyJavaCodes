package practisePrograms;

import java.util.Scanner;

public class PositiveOrNegative {

	public static void main(String[] args) 
	{
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter the number you want to check");
		int number = reader.nextInt();
		
		if (number>0.0) 
		{
			System.out.println(number + " is a postive number");
		}
		else if (number<0.0) 
		{
			System.out.println(number + " is a negative number");
		}
		else
			 System.out.println("Number entered is invalid!!!!!!!!!!!");

	}

}
