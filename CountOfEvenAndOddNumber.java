package interviewProgrammingQuestions;

public class CountOfEvenAndOddNumber {

	public static void main(String[] args) 
	{
		int num = 4583;
		int evenCount = 0, oddCount = 0;
		while (num>0) 
		{
			int rem = num% 10;
			if (rem%2==0) 
			evenCount++;
			else
				oddCount++;
			num=num/10;
			
		}
		System.out.println("Total number of even count is = " + evenCount);
		System.out.println("Total number of odd count is = " + oddCount);

	}

}
