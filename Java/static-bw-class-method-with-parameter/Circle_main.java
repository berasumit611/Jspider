//method with parameter
//call static memeber in between class

class Circle_sub
{  
	static void area(double pi,int r)
	{
	
	double result=pi*r*r;

	System.out.println(result);

	}
}

class Circle_main
{

	public static void main(String[] args) 
	{
		Circle_sub.area(3.142,2);

	}
}
//ans--->12.568
