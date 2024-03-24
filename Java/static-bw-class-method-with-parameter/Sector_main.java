//method with parameter
//call static memeber in between class

class Sector_sub
{  static void area(int r,int theta){
	//r-> radious, theta--> angle of radians


	double result=0.5*r*r*theta;
	
	System.out.println(result);

	}
}
class Sector_main
{
	public static void main(String[] args) 
	{
	
		Sector_sub.area(10,60);

	}
}
//output--->3000.0
