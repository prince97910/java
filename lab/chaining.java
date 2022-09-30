class chaining
{
	chaining()
	{
		this(5);
	System.out.print("constructor chaining with three constructor in a class");
	}
	
	chaining(int x)
	{
		this("petet");
		System.out.println("1st constructor ");
		
	}
	
	chaining(String y)
	{
		this(36.25);
		System.out.print("2nd constructor");
	}
	
	chaining(double z)
	{
	
	System.out.print("3rd constructor");
	}
	public static void main(String[] args)
	{
		chaining c=new chaining();
		
	}
}