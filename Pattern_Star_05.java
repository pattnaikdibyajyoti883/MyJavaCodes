package patternprograms;

public class Pattern_Star_05 {

	public static void main(String[] args) 
	{
		for (int i = 1; i <=4; i++) 
		{
			for (int j = 4; j>=i; j--) 
			{
				System.out.print("*");
			}
			for (int k =4; k >=i; k--) 
			{
				System.out.print(" ");
			}
			System.out.println();
		}

	}

}
