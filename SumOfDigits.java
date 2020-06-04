package interviewProgrammingQuestions;

public class SumOfDigits {

	public static void main(String[] args) 
	{
		int num = 356;
		int sum = 0;
		int digit = 0;
		while(num>0)
		{
			digit = num%10;// extracting last digit with the help of % operator.
			sum = sum + digit;
			num = num/10;
		}
		System.out.println("Sum of digits of the given number is = " +sum);

	}

}
