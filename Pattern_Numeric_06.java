package patternprograms;

public class Pattern_Numeric_06 {

	public static void main(String[] args) 
	{
		
		for (int i = 1; i <=10; i++) 
		{
			int num=i;
			for (int j = 1; j <=i; j++) 
			{
				System.out.print(num+" " );
				num=num+5-j; 
			}
			System.out.println();
			
		}
	}

}
