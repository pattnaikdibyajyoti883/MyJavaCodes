package arrays;

public class LargestNumberInTheArray {

	public static void main(String[] args) 
	{
		double[] numArray = {10.34,20.44,45.56,65.66,76.78,78.98};
		double largest = numArray[0];
		for (double num : numArray) 
		{
			if(largest<num)
				largest = num;
		}
		System.out.println("The largest number in the array is = " + largest);

	}

}
