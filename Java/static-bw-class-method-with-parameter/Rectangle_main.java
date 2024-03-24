//method with parameter
//call static memeber in between class

class Rectangle_sub
{  static void area(int width,int height){
	
	
	int result=width*height;

	System.out.println(result);

}
}
class Rectangle_main
{
	public static void main(String[] args) 
	{
		Rectangle_sub.area(50,40);
	}
}
//2000

