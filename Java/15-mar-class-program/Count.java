class Count
{
	static void ope(int no)
	{
		int count=0;
		while(no!=0)
		{
			int rem=no%10;


			if(rem%2!=0){
				count++;
			}

			no=no/10;
		}
		System.out.println(count);
	}
	public static void main(String[] args) 
	{
		ope(1423444);
	}
}
