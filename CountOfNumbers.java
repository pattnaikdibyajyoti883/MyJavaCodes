package practisePrograms;

public class CountOfNumbers {

	public static void main(String[] args) 
	{
		int count=0, num=234758457;
		while (num!=0) 
		{
			num = num/10;
			count++;
		}
		
		System.out.println("The total count of integer is - " + count);
	}

}
