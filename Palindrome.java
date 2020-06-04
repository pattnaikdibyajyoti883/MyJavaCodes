package practisePrograms;

public class Palindrome {

	public static void main(String[] args) 
	{
		int num= 342,reminder=0,ReverseInteger=0,OriginalInteger;
		
		OriginalInteger = num;
		while (num!=0) 
		{
			reminder=num%10;
			ReverseInteger=ReverseInteger*10+reminder;
			num=num/10;
		}
		if (OriginalInteger == ReverseInteger) 
		{
			System.out.println("Entered number is a palindrome");
		}
		else
			System.out.println("Entered number is not a palindrome");

	}

}
