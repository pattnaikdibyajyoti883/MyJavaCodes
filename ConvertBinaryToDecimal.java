package practisePrograms;

public class ConvertBinaryToDecimal {

	public static void main(String[] args) 
	{
		long number = 110110111;
		int decimal = convertBinaryToDecimal(number);
        System.out.printf("%d in binary = %d in decimal", number, decimal);
	}

	public static int convertBinaryToDecimal(long number) 
	{
		int decimal = 0;
		int i=0;
		long reminder = 0;
		while(number!=0)
		{
			reminder = number % 10;
			number = number/10;
			decimal = (int) (decimal+reminder*Math.pow(2, i));
			i++;
		}
		
		return decimal;
	}


}
