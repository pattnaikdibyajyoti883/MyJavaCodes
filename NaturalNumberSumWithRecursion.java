package practisePrograms;

/*What is recursion- Recursion basically means method calling its own method or itself for 
solving a problem.
*/
public class NaturalNumberSumWithRecursion {

	public static void main(String[] args) 
	{
		int number = 5; //Here i need to find sum of 20 natural number.
		int sum = addNumbers(number);
		System.out.println("Sum of natural numbers is = " + sum);
	}

	public static int addNumbers(int number) 
	{
		if (number!=0) 
		{
			return number + addNumbers(number-1);
		}
		
		else
			return number;
	}

}
