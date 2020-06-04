package interviewProgrammingQuestions;

public class CountNumberOfDigits {

	public static void main(String[] args) 
	{
		int number = 236556784;
		/*
		 * int count = 0;
		 * 
		 * while (number!=0) { number = number/10; count++; } System.out.println(count);
		 */
		System.out.println(countNumbers(236556784));

	}
	static int countNumbers(Integer n) 
	{
		if(n==0)
		return 0;
		return 1+countNumbers(n/10);
		
	}

}
