package interviewProgrammingQuestions;

//WAP IN JAVA TO PRINT THE ELEMENTS IN EVEN POSITION.

public class PrintElementInEvenPosition {

	public static void main(String[] args) 
	{
		int arr[] = new int[] {10,30,67,43,55,89,78};//CREATING AN ARRAY
		
		for (int i = 2; i < arr.length; i=i+2) 
		{
			System.out.println("Index->"+i);
			System.out.println("Value = "+arr[i]);
			
		}
		

	}

}
