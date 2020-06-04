package programsOnStrings;

//WAP TO REPLACE A SET OF CHARACTERS FROM A GIVEN STRING.
//THE METHOD SIGNATURE IS = public String replace(CharSequence target, CharSequence replacement)

public class ReplaceSetOfCharacters {

	public static void main(String[] args) 
	{
		String str = "Hey developer, what are you about to code??";
		System.out.println("Before replacing the given string value = " +str);
		str=str.replace("developer", "programmer");
		System.out.println("After the replacing the new string is = " +str);

	}

}
