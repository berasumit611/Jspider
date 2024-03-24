//calling method 
//call static memeber in between class

class Parallelogram_sub
{  static void area(){
	
	int base=20;
	int vh=10;
	int result=base*vh;

	System.out.println(result);
//200
	}
}
class Parallelogram_main
{
	public static void main(String[] args) 
	{
		Parallelogram_sub.area();
	}
}

