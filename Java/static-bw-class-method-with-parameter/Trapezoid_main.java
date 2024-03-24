//calling method 
//call static memeber in between class

class Trapezoid_sub
{  static void area(int a,int b,int h){
	
	

	double result=0.5*(a+b)*h;


	System.out.println(result);
	//ans->22.5

	}
}
class Trapezoid_main
{
	public static void main(String[] args) 
	{
		
		Trapezoid_sub.area(5,10,3);
		

	}
}
