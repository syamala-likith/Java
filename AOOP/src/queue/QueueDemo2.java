package queue;
import java.util.PriorityQueue;
public class QueueDemo2 {

	public static void main(String[] args)
	{
		PriorityQueue<String> q=new PriorityQueue<String>();
		q.add("D"); //to insert an element
		q.offer("C"); //to insert an element
		q.add("A");
		q.offer("B");
		System.out.println(q);
		for(Object ele:q)
		{
			System.out.println(ele);
		}
		System.out.println(q.element()); //to retrieve head element
		System.out.println(q.peek());//to retrieve head 
		System.out.println(q.remove()); //to remove and return head element
		System.out.println(q);
		System.out.println(q.poll());//to remove and return head element
		System.out.println(q);
	}

}
