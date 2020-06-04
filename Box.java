package my_java_programs;

class Box 
{
	private int length, breadth, height;//PROPERTIES OF THE BOX
	public void setDimension(int l,int b, int h) {length=h;breadth=b;height=h;}
	public void showDimension()
	{
		System.out.println("L="+length);
		System.out.println("B="+breadth);
		System.out.println("H="+height);
	}
}
class Example
{
	public static void main(String[]args)
{
		Box cubical = new Box();
		cubical.setDimension(20,30,40);
		Box cubicals = new Box();
		cubicals.showDimension();
}
}