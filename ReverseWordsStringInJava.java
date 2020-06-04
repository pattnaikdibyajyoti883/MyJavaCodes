package interviewProgrammingQuestions;

/*input = my name is dibyajyoti pattnaik.
output = pattnaik dibyajyoti is name my.*/

public class ReverseWordsStringInJava {

	public static void main(String[] args) 
	{
		String str = "MY NAME IS DIBYAJYOTI PATTNAIK";
		String splitArray[] = str.split(" ");
		for (int i = splitArray.length-1;i>=0; i--) 
		{
			System.out.println(splitArray[i]);
		}

	}

}
/*
 * OUTPUT PATTNAIK DIBYAJYOTI IS NAME MY
 */
