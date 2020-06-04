package interviewProgrammingQuestions;

public class DuplicateOccurenceInArray {

	public static void main(String[] args) 
	{
		int arr[] = {2,5,7,3,8,9,2};
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = i+1; j < arr.length; j++) 
			{
				if (arr[i]==arr[j]) 
				{
					System.out.println("The number which is duplicate is--> " + arr[i]);
				}
			}
		}
		

	}

}
