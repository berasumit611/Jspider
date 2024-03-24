//calling method 
//call static memeber in between class

class Sector_sub
{  static void area(){
	//r-> radious, theta--> angle of radians

	int r=10;
	int theta=60;

	double result=0.5*r*r*theta;
	
	System.out.println(result);
//3000.0
	}
}
class Sector_main
{
	public static void main(String[] args) 
	{
	
		Sector_sub.area();

	}
}
