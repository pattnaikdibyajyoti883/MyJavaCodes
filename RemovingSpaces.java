package programsOnStrings;

public class RemovingSpaces {

	//WAP IN JAVA TO REMOVE/TRIM STARTING & ENDING SPACES IN A STRING. TO DO THIS WE HAVE A 
	//METHOD CALLED trim()
	//SIGNATURE OF THAT IS public String trim()
	
	public static void main(String[] args) 
	{
		String str = " https://trialvoicestore.myshopify.com ";
		System.out.println("Before Trim ="+str);
		str=str.trim()+" Store is for beauty & pharma products";
		System.out.println("After Trim = "+str);

	}

}
