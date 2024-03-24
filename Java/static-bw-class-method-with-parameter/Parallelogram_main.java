//method with parameter
//call static memeber in between class

class Parallelogram_sub
{  static void area(	int base,int vh
){
	
	int result=base*vh;

	System.out.println(result);

	}
}
class Parallelogram_main
{
	public static void main(String[] args) 
	{
		Parallelogram_sub.area(20,10);
	}
}

