
class Circle_sub
{  
	static double area()
	{
	double pi=3.142;
	int r=2;
	double result=pi*r*r;

	return result;

	}
}

class Circle_main
{

	public static void main(String[] args) 
	{
		double x=Circle_sub.area();
		System.out.println(x);

	}
}
//ans--->12.568
