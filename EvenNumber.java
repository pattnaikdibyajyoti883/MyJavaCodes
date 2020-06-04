package practisePrograms;

import java.util.Scanner;

public class EvenNumber {

	public static void main(String[] args) 
	{
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter the number - ");
		int num = reader.nextInt();
		
		if (num%2==0) 
		{
			System.out.println(num + " is a even number ");
			
		}
		else 
			System.out.println(num +" is not a even number ");

	}

}
