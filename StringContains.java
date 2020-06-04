package programsOnStrings;

//WAP IN JAVA TO CHECK WHETHER STRING CONTAINS OTHER STRING OR NOT.
//THIS CAN BE ACHIEVED WITH THE HELP OF A METHOD CALLED public boolean contains(String str)
//contains() searches for sequence of characters in the given string.

public class StringContains {

	public static void main(String[] args) 
	{
		String str1="Dibyajyoti Pattnaik";
		String str2 = "Dibya";
		String str3 = "Test Yantra";
		System.out.println(str1.contains(str2));//true
		System.out.println(str2.contains(str1));//false

	}

}
