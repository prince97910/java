import java.util.Scanner;
class ovload
{
	int a;
	double b;
	Scanner sc=new Scanner(System.in);
	void m(int x)
	{
		a=x;
		 //x=sc.nextInt();
		System.out.println("enert the interger "+x);
	}
	void m(double y)
	{
		b=y;
		// y=sc.nextDouble();
		System.out.println("enert the double");
	}
	public static void main(String[] args)
	{
       ovload o=new ovload();
	   o.m(5);
	   o.m(8.35);
	   System.out.println("Swaping of interger and double ");
	}   
}