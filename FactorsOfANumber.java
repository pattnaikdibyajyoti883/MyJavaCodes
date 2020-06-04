package practisePrograms;

/*import java.util.Scanner;*/

public class FactorsOfANumber {

	public static void main(String[] args) 
	{
		/*
		 * Scanner reader = new Scanner(System.in);
		 * System.out.print("Enter the number = "); int num = reader.nextInt();
		 
		int num=60;
		
		System.out.print("Factors of the " + num + " are");
		for (int i = 0; i <=num; i++) 
		{
			if (num % i == 0) 
			{
				System.out.println(i + " ");
			}
		}

	}

}*/

	        int number = 60;

	        System.out.print("Factors of " + number + " are: ");
	        for(int i = 1; i <= number; ++i) {
	            if (number % i == 0) {
	                System.out.print(i + " ");
	            }
	        }
	    }
	}
