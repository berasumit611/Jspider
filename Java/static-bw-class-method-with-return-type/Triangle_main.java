

class Triangle_sub
{  
	static double area()
	{
		int b=2;
		int h=4;
	double result=0.5*h*b;

	return result;


	}
}
class Triangle_main
{
	public static void main(String[] args) 
	{
		
		double x=Triangle_sub.area();
	System.out.println(x);

		

	}
}
//output-->4.0
