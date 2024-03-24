//method with parameter
//call static memeber in between class

class Square_sub
{  
	static void area(int a)
	{
	
	
	int result=a*a;

	System.out.println(result);

	}
}
class Square_main
{
	public static void main(String[] args) 
	{
		Square_sub.area(4);

	}
}
//output-->16

