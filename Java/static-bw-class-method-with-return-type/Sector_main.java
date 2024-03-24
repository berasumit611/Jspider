

class Sector_sub
{  static double area(){
	//r-> radious, theta--> angle of radians
	int r=10;
	int theta=60;

	double result=0.5*r*r*theta;
	return result;

	}
}
class Sector_main
{
	public static void main(String[] args) 
	{
	
		double x=Sector_sub.area();
		System.out.println(x);

	}
}
//output--->3000.0
