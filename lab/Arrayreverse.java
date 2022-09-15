import java.util.Scanner;
class Arrayreverse
{
	public static void main(String[] args)
	{
		int[] marks=new int[4];
		System.out.println("Enter the values of array");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<4;i++)
		{
			System.out.println("Enter value of index: "+i);
			marks[i]=sc.nextInt();
		}
		
		System.out.println("reverse of the array number");
		for(int i=3;i>=0;i--)
		{
			System.out.println(marks[i]);
		
		}
	
	}
}	