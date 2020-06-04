package practisePrograms;

import java.util.Scanner;

public class QuotientAndReminder {

	public static void main(String[] args)
	{
		/*
		 * According to mathematics the division formula is like 
		 * Dividend = divisor*quotient+reminder
		 * 
		 * where, quotient = (dividend/divisor)-reminder; And 
		 * reminder = dividend/(divisor*quotient)
		 */
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter the dividend - ");
		int dividend  = reader.nextInt();
		
		System.out.print("Enter the divisor - ");
		int divisor = reader.nextInt();
		
		System.out.print("Enter the reminder - ");
		int reminder = reader.nextInt();
		
		System.out.println("Finally the quotient = " + ((dividend/divisor)-reminder));
		
		int quotient = (dividend/divisor)-reminder;
		
		System.out.print("Finally the reminder = " + (dividend/(divisor*quotient)));
		
		
		
		
		
				

	}

}
