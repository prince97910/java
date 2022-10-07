import java.util.Scanner ;
class person
{
	int pid ;
	String pname ;
	Scanner sc=new Scanner(System.in);
	void name()
	{
		int pid=sc.nextInt();
		String pname=sc.nextLine();
	}
	
}
class Student extends person
{
	void marks(int m)
	{
		super.name();
		for(int i=0;i<3;i++)
			
		System.out.println("Names of Students are ");
	}
}
class employe extends person
{
	void salary(int x)
	{
	super.name();
	x=10000;
	System.out.println("Saary of the person is"+x);
	}
}
class friday1
{
	public static void main(String[] args)
	{
	Student s=new Student();
	employe e=new employe();
	}
	
	
}