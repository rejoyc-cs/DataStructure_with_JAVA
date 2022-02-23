public class QueueArray <E> 
{
	public static final int CAPACITY = 1000;
	private E[] data;
	private int f = 0;
	private int sz = 0;
	
	public QueueArray()
	{
		this(CAPACITY);
	}
	
	public QueueArray(int capacity)
	{
		data = (E[]) new Object[capacity];
	}
	
	public int size()
	{
		return sz;
	}
	
	public boolean isEmpty()
	{
		return (sz==0);
	}
	
	public void enque(E e)
	{
		if (sz == data.length)
		{
			System.out.println("Queue Full!");
			return;
		}
		data[ (f+sz)%data.length ] = e;
		sz++;
	}
	
	public E first()
	{
		if (isEmpty()) return null;
		return data[f];
	}
	
	public E deque()
	{
		if (isEmpty()) return null;
		E ans = data[f];
		data[f] = null;
		f = (f+1)%data.length;
		sz--;
		return ans;
	}
	
	public static void main(String args[])
	{
		QueueArray<Integer> queue = new QueueArray<>(4);
		System.out.println("Initially Size: " + queue.size());
		System.out.println("Initially isEmpty: " + queue.isEmpty());
		
		System.out.println("Enque 1,2,3,4");
		queue.enque(1);
		queue.enque(2);
		queue.enque(3);
		queue.enque(4);
		
		/*
		System.out.println("Trying to enque 5");
		queue.enque(5); 
		*/
		
		System.out.println("First: "+queue.first());
		System.out.println("isEmpty: " + queue.isEmpty());
		System.out.println("Size: " + queue.size());
		
		System.out.println("Performing deque(), we get: " +queue.deque());
		System.out.println("Now, First: "+queue.first());
	}
}
