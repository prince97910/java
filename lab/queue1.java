import java.util.*;  
public  class queue1 
{
	public static void main(String[] args)
	{
		PriorityQueue <String> queue=new PriorityQueue <String>();
		queue.add("ramesh");
		queue.add("jagu");
		queue.add("raju");
		queue.add("ram");
		queue.add("suguniya");
		System.out.println("head"+queue.peek());
		queue.poll();
		for(String s:queue)
		{
			System.out.println("boys name"+s);
		}	
	}
}