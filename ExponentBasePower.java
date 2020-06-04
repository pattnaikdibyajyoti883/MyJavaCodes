package practisePrograms;

import java.util.Scanner;

public class ExponentBasePower {

	public static void main(String[] args) 
	{
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter the base = ");
		int base = reader.nextInt();
		
		System.out.print("Enter the exponential = ");
		int exp = reader.nextInt();
		
		double power = Math.pow(base, exp);
		
		System.out.println("the power of the base is = " + power);
	}
	
}
