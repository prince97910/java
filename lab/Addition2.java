import java.util.Scanner;
class Addition2
{
	public static void main(String[] args)
	{
		int a[][]=new int[3][3];
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the first matrix data of a ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				a[i][j]=sc.nextInt();
				
			}
		}
		int b[][]=new int[3][3];
		System.out.print("enter 2nd array element");
		for(int k=0;k<3;k++)
		{
			for(int j=0;j<3;j++)
			{
				b[k][j]=sc.nextInt();
				
			}
		}	
		int [][]c=new int[3][3];
		System.out.println("Addition of Two Matrix is: ");
		for(int k=0;k<3;k++)
		{
			for(int j=0;j<3;j++)
			{
				c[k][j]=a[k][j]+b[k][j];
				System.out.print(c[k][j] + " ");
				
			}
			System.out.println();
		}	
	}	
}	
	