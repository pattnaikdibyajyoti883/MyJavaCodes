package programsOnStrings;

//Creating string using string literal has an advantage of returning string from string 
//constant pool.
//if String is present in string constant pool it won't create new string
//Creating string using new operator will always create new object without checking in 
//String constant pool.
//Now intern() is used like when we use a new operator, it will go for searching the string 
//in the string constant pool and if it is present will not create the object again for that.

public class StringInternDemo {

	public static void main(String[] args) 
	{
		String str1="Hello World";
		String str2 = new String("Hello World");
		System.out.println(str1==str2);//false
		String str3=str2.intern();
		System.out.println(str1==str3);//true
		
		
	}

}
