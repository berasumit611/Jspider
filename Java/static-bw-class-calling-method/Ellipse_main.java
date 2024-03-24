//calling method 
//call static memeber in between class

class Ellipse_sub
{  static void area(){
	
	double pi=3.142;
	int a=2;
	int b=4;
	double result=pi*a*b;

	System.out.println(result);

	//ans-> 25.136

	}
}
class Ellipse_main
{
	public static void main(String[] args) 
	{
		
		Ellipse_sub.area();
		

	}
}
