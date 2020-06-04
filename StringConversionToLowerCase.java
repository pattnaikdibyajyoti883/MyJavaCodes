package programsOnStrings;

public class StringConversionToLowerCase {

	//WAP IN JAVA TO CONVERT A STRING TO LOWER CASE.
	//METHODS USED IN THIS ARE toLowerCase(Locale)
	
	public static void main(String[] args) 
	{
		String str = "JAVA PROGRAMMING";
		System.out.println("Before converting to lowercase " +str);
		str=str.toLowerCase();
		System.out.println("After converting to lowercase " +str);
		
		//CONVERSION OF STRING TO UPPER CASE.
		
		System.out.println("------------------------------------------------");
		String str1 = "java programming";
		System.out.println("Before converting to uppercase " +str1);
		str1=str1.toUpperCase();
		System.out.println("After converting to uppercase " +str1);
	}

}
