//calling method 
//call static memeber in between class

class Square_sub
{  
	static void area()
	{
	
	int a=4;
	int result=a*a;

	System.out.println(result);

	}
}
class Square_main
{
	public static void main(String[] args) 
	{
		Square_sub.area();

	}
}
//16

