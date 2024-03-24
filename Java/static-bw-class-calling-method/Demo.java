class Demo
{
	string disp(){
		string x="java";
		string y="is an emotion";
		string res=x+" "+y;
		return res;

	}
	public static void main(String[] args) 
	{
		string s=new Demo().disp();
		System.out.println(s);
	}
}
