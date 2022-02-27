import java.util.*;

public class QueueLinkedList <E> 
{
	private LinkedList<E> data;
	
	public QueueLinkedList()
	{
		data = new LinkedList<E>();
	}
	
	public int size()
	{
		return data.size();
	}
	
	public boolean isEmpty()
	{
		return data.size() == 0;
	}
	
	public void enque(E e)
	{
		data.addLast(e);
	}
	
	public E first()
	{
		if (isEmpty()) return null;
		return data.getFirst();
	}
	
	public E deque()
	{
		if (isEmpty()) return null;
		return data.removeFirst();
	}
	
	public static void main(String args[])
	{
		QueueLinkedList<Integer> queue = new QueueLinkedList<>();
		System.out.println("Initially Size: " + queue.size());
		System.out.println("Initially isEmpty: " + queue.isEmpty());
		System.out.println("Trying to deque(): " +queue.deque());
		System.out.println("First: "+queue.first());
		System.out.println();
		
		System.out.println("Enque 1,2,3,4");
		queue.enque(1);
		queue.enque(2);
		queue.enque(3);
		queue.enque(4);
		System.out.println();
		
		System.out.println("First: "+queue.first());
		System.out.println("isEmpty: " + queue.isEmpty());
		System.out.println("Size: " + queue.size());
		System.out.println();
		
		System.out.println("Performing deque(), we get: " +queue.deque());
		System.out.println("Now, First: "+queue.first());
		System.out.println("Size: " + queue.size());
	}
}
