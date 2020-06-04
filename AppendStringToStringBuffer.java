package programsOnStrings;

//WRITE A PROGRAM IN JAVA TO APPEND STRING IN STRINGBUFFER. AND CAN BE DONE USING A METHOD CALLED
//append(String)

public class AppendStringToStringBuffer {

	public static void main(String[] args) 
	{
		
		StringBuffer sb = new StringBuffer("Dibyajyoti");
		
		System.out.println(" Before Appending " + sb);
		
		sb.append(" Pattnaik");
		
		System.out.println(" After Appending " + sb);

	}

}
