//calling method 
//call static memeber in between class

class Rectangle_sub
{  static void area(){
	
	int width=50;
	int height=40;
	int result=width*height;

	System.out.println(result);

}
}
class Rectangle_main
{
	public static void main(String[] args) 
	{
		Rectangle_sub.area();
	}
}
//2000

