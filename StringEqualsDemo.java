package programsOnStrings;

//equals() is used to check whether both the string are having same characters in them.
//signature used in this is public boolean equals(object obj)

public class StringEqualsDemo {

	public static void main(String[] args) 
	{
		String str1 = "Dibyajyoti";
		String str2 = "Pattnaik";
		String str3 = "Dibyajyoti";
		System.out.println(str1.equals(str2));
		System.out.println(str2.equals(str3));
		System.out.println(str1.equals(str3));
	}
}
