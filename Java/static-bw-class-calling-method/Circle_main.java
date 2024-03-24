//calling method 
//call static memeber in between class

class Circle_sub
{  
	static void area()
	{
	
	double pi=3.142;
	int r=2;
	double result=pi*r*r;

	System.out.println(result);

	}
}

class Circle_main
{

	public static void main(String[] args) 
	{
		Circle_sub.area();

	}
}
//12.568
