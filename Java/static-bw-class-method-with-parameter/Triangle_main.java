//calling method 
//call static memeber in between class

class Triangle_sub
{  
	static void area(int b,int h)
	{
	
	double result=0.5*h*b;

	System.out.println(result);

	}
}
class Triangle_main
{
	public static void main(String[] args) 
	{
		
		Triangle_sub.area(2,4);
		

	}
}
//output-->4.0
