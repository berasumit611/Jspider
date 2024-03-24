//method with parameter
//call static memeber in between class

class Ellipse_sub
{  static void area(double pi,int a,int b){
	
	double result=pi*a*b;

	System.out.println(result);

	//ans--> 25.136

	}
}
class Ellipse_main
{
	public static void main(String[] args) 
	{
		
		Ellipse_sub.area(3.142,2,4);
		

	}
}
