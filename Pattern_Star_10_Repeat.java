package patternprograms;

public class Pattern_Star_10_Repeat 
{
	public static void main(String[] args) 
	{
		for (int i = 1; i <=4; i++) 
		{
			for (int j = 4; j>i; j--) 
			{
				System.out.println(" ");
			}
				for (int k = 1; k <=i; k++) 
				{
					if (i>=2 && k>1) 
					{
						System.out.print(" ");
					}
					else 
					{
						System.out.print("*");
					}
					
				}
				System.out.println();
			}
			
	}
		

	}


