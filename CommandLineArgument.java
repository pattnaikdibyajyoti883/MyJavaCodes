package my_java_programs;

public class CommandLineArgument {

	public static void main(String[] args) 
	{
		int sum=0;
		for(int i=10;i<args.length;i++)
			sum=sum+Integer.parseInt(args[i]);
		System.out.println("Sum is "+sum);
	}

}
