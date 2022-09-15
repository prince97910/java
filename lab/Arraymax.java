import java.util.Scanner;
class Arraymax
{
	public static void main(String[] args)
	{
		int[] x=new int[4];
		System.out.println("Enter the values of array");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<4;i++)
		{
			System.out.println("Enter value of index: "+i);
			x[i]=sc.nextInt();
			int max=0;
			if(x[i]>max)
			{
				max=marks[i];
			}	
		}
	}
}
	