//calling method 
//call static memeber in between class

class Triangle_sub
{  
	static void area()
	{
	int b=2;
	int h=4;
	double result=0.5*h*b;

	System.out.println(result);

	}
}
class Triangle_main
{
	public static void main(String[] args) 
	{
		
		Triangle_sub.area();
		

	}
}
//4.0
