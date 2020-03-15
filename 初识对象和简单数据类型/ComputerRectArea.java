public class ComputerRectArea
{
	public static void main(String[] args)
	{
		A a=new A();
		a.jisuan();
	}
}
class A
{
	void jisuan()
	{
		double height;
		double width;
		double area;
		height=23.89;
		width=108.87;
		area=height*width;
		System.out.println(area);
	}
}