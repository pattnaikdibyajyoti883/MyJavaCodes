package practisePrograms;

public class AmstrongNumber {

	public static void main(String[] args) 
	{
		int num=371, reminder, originalNumber,result=0;
		originalNumber= num;
		
		while (originalNumber!=0) 
		{
			reminder = originalNumber%10;
			result = (int) (result + Math.pow(reminder, 3));
			originalNumber = originalNumber/10;
		}
		if(result == num)
            System.out.println(num + " is an Armstrong number.");
        else
            System.out.println(num + " is not an Armstrong number.");
	}
}