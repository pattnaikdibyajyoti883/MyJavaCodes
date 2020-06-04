package arrays;

public class Average {

	public static void main(String[] args) 
	{
		double[] numArray = {23.09,56,89,34.50,45.98,98.0};
		double sum = 0;
		
		for (double num : numArray) 
		{
			sum = sum + num;
		}
		double average = sum/numArray.length;
		System.out.print("The avearge of the given array = " + average);

	}

}
