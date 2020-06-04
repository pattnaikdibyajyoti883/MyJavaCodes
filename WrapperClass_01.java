package my_java_programs;

public class WrapperClass_01 {

	public static void main(String[] args) 
	{
		//valueOf()
		Integer i1=Integer.valueOf("101011",2);
		Double d1=Double.valueOf("234");
		System.out.println(i1);
		System.out.println(d1);
		//parseXxx()
		Integer i2=Integer.parseInt("1234");
		Float f1=Float.parseFloat("234");
		Double d2=Double.parseDouble("1223");
		System.out.println(i2);
		System.out.println(f1);
		System.out.println(d2);
		//xxxValue()
	    int c = i1.intValue();
	    System.out.println(c);	
	}
}
