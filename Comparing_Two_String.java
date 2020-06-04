package programsOnStrings;

public class Comparing_Two_String {
//Comparing two string can be done by compareTo().
	public static void main(String[] args) 
	{
		String s1="Dibyajyoti";
		String s2="Pattnaik";
		String s3="Bangalore";
		String s4="India";
		
		System.out.println(s1.compareTo(s2));
		System.out.println("**************");
		System.out.println(s1.compareTo(s3));
		System.out.println("**************");
		System.out.println(s1.compareTo(s4));
		System.out.println("**************");
		System.out.println(s2.compareTo(s1));
		System.out.println("**************");
		System.out.println(s2.compareTo(s3));
		System.out.println("**************");
		System.out.println(s2.compareTo(s4));
		System.out.println("**************");
		System.out.println(s4.compareTo(s4));

	}

}
