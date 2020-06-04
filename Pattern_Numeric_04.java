package patternprograms;

public class Pattern_Numeric_04 {

	public static void main(String[] args) 
	{
		for (int i = 1; i <=5; i++) 
		{
			for (int j = i; j>=1; j--) 
			{
				System.out.print(j+" ");
			}
			for (int k = i-1; k>=1; k--) 
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}

}
