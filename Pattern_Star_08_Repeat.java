package patternprograms;

public class Pattern_Star_08_Repeat 
{
	public static void name() 
	{
		for (int i = 1; i <=4; i++) 
		{
			for (int j = 3; j>=i; j--) 
			{
				if (j>i) 
				{
					System.out.print(" ");
					
				}
				else{
				System.out.print(" *");
			}
			System.out.println();
		}

		}
	}}

	


