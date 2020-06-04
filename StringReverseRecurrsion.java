package interviewProgrammingQuestions;

//RECURRSION IS NOTHING BUT THE FUNCTION OR THE METHOD WHICH CALLS ITSELF REPEATED OVER SEVERAL 
//TIMES.

public class StringReverseRecurrsion {

	public static void main(String[] args) 
	{
		String s  = "Dibyajyoti";
		System.out.println(recursiveString(s));

	}
	private static String recursiveString(String s)
	{
		if(s==null || s.length()<=1)
		{
			return s;
		}
		return recursiveString(s.substring(1))+s.charAt(0);
	}

}
