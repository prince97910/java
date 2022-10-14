public class Nestedtry
{
	int aa=3;
	public static void main(String[] args)
	{
		int x=5;
		int y=0;
		String s=null;
		
		int[] a=new int[4];
		a[0]=11;
		a[1]=22;
		a[2]=33;
		a[3]=44;
		while(true)
		{
			try
			{
				int z=x/y;
			System.out.println("this operation is addition"+z);
			
				try
				{
					
					s.length();
					try
					{
						System.out.println("this is array "+a[5]);
						
					}
					catch (Exception e)
					{
						System.out.println("Error: "+e);
					}
				}	
				
				catch (Exception f)
				{
						System.out.println(f);
				}
				break;
			}	
			
			catch (Exception g)
			{
				System.out.println(g);
				y=1;
			}
		}
		System.out.println("three thypes of exception errors are there");
		System.out.println("1.Arthmetic error");
		System.out.println("2.Null pointer  error");
		System.out.println("3.array out of bound error");	
				
				
	}
}