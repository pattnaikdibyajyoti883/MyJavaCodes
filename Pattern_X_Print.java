package patternprograms;

public class Pattern_X_Print 
{
	public static void name() 
	{
		for (int i = 0; i <5; i++) 
		{
			for (int j = 0; j < 5; j++) 
			{
				if (i==j || i+j==5-1) 
				{
					System.out.print("*");
				}
				else 
				{
				 System.out.print(" ");	
				}
			}
			System.out.println();
		}
		
	
}
}