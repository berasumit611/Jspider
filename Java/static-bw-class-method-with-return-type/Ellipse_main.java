

class Ellipse_sub
{  
	static double area()
	{
	double pi=3.142;
	int a=2;
	int b=4;
	double result=pi*a*b;

	return result;

	//ans--> 25.136

	}
}
class Ellipse_main
{
	public static void main(String[] args) 
	{
		
		double x=Ellipse_sub.area();
	System.out.println(x);
		

	}
}
