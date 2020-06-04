package my_java_programs;

public class GenricProgram 
{
  public <E> void printArray(E[]s)
  {
	  for(int i=0;i<s.length;i++)
		  System.out.println(s[i]);
  }
  public static void main(String[]args)
  {
	  GenricProgram gm = new GenricProgram();
	  String names[]= new String[] {"Facto","Real","Factoreal"};
	  String name[]= new String[] {"Test","Yantra","TestYantra"};
	  Integer number[] = {10,20,30,40};
	  gm.printArray(names);
	  gm.printArray(number);
	  gm.printArray(name);
  }
  }

