package practisePrograms;

public class HCFWithRecursion {

	public static void main(String[] args) 
	{
		int n1=320, n2=48;
		int hcf = hcf(n1,n2);
		System.out.printf("HCF of %d & % d is %d", n1,n2,hcf);
	}

	public static int hcf(int n1, int n2) 
	{
		if(n2!=0)
		return hcf(n2,n1%n2);
		else
		return n1;
	}

}
