package practisePrograms;

public class FactorialWithRecursion {

	public static void main(String[] args) 
	{
		int num = 4;
		int factorial = multiplyNumbers(num);
		System.out.println("Factorial of " + num + " is = " + factorial);
	}

	public static int multiplyNumbers(int num) 
	{
		if (num>=1) 
		{
			return num * multiplyNumbers(num-1);
			
		}
		else
		return 1;
	}

}
