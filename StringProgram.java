package my_java_programs;

public class StringProgram {

	public static void main(String[] args)
	{
		String str1 = "My name is Dibyajyoti Pattnaik";
		String str2 = "My name is Dibyajyoti Pattnaik";
		String str3 = new String("My name is Dibyajyoti Pattnaik");
		System.out.println("The result is "+(str1==str2));
		System.out.println("The result is "+str1.equals(str2));
		System.out.println("The result is "+(str1==str3));
		System.out.println("The result is "+str1.equals(str3));
		
	}

}
