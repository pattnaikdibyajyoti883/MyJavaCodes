package practisePrograms;

public class AsciiValueOfACharacter {

	public static void main(String[] args) 
	{
		char ch = 'b';
		int ascii = ch;
		int castAscii = (int) ch;
		System.out.println("the ascii value of the " +ch+ " = " + ascii );
		System.out.print("the ascii value of the " +ch+ " = " + castAscii );
		
		/*
		 * Finding ASCII value of a character is done by typecasting, where char can
		 * even be casted to int.
		 */

	}

}
