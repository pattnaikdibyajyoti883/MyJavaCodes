package patternprograms;

public class Pattern_Star_02 {

	public static void main(String[] args) 
	{
		System.out.println("Start Line");
		for (int i = 1; i <=4; i++) 
		{
			for (int j = 4; j >=i; j--) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("End Line");
	}
	}


