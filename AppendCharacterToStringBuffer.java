package programsOnStrings;

//WAP IN JAVA TO APPEND CHARACTERS INTO STRINGBUFFER.

public class AppendCharacterToStringBuffer {

	public static void main(String[] args) 
	{
		StringBuffer sb = new StringBuffer("Thank You So Much");
		System.out.println("Before Appending " +sb);
		sb.append('!');
		System.out.println("After Appending " +sb);
		
	}

}
