package interviewProgrammingQuestions;

public class AddingTwoStrings {

	public static void main(String[] args) 
	{
		/*
		 * String str1 = " Hey "; String str2 = "how are you? ";
		 * System.out.println("The final sentence made out of two string is--> "
		 * +(str1+str2));
		 */
		String s1 = "600";
		String s2 = "750";
		/* TO COVERT STRING TO INTEGER WE USE A METHOD CALLED parseInt() */
		int sum = Integer.parseInt(s1)+Integer.parseInt(s2);
		System.out.println(sum);
		System.out.println(String.valueOf(sum));

	}

}
