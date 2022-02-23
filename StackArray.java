public class StackArray<E> 
{
	public static final int CAPACITY = 1000;
	private E[] data;
	private int t = -1;
	
	public StackArray()
	{
		this(CAPACITY);
	}
	
	public StackArray(int capacity)
	{
		data = (E[]) new Object[capacity];
	}
	
	public int size()
	{
		return t+1;
	}
	
	public boolean isEmpty()
	{
		return (t==-1);
	}
	
	public void push(E e) throws IllegalStateException
	{
		if (size() == data.length)
		{
			throw new IllegalStateException("Stack is Full");
		}
		
		data[++t] = e;
	}
	
	public E top() 
	{
		if (isEmpty()) return null;
		return data[t];
	}
	
	public E pop()
	{
		if (isEmpty()) return null;
		E ans = data[t];
		data[t] = null;
		t--;
		return ans;
	}
	
	
	public static void main(String args[])
	{
		StackArray<Integer> stack = new StackArray<>(4);
		System.out.println("Initially Size: " + stack.size());
		System.out.println("Initially isEmpty: " + stack.isEmpty());
		
		System.out.println("Pushing 1,2,3,4");
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		
		/*
		System.out.println("Trying to push 5");
		stack.push(5); 
		* */
		
		System.out.println("Top: "+stack.top());
		System.out.println("isEmpty: " + stack.isEmpty());
		System.out.println("Size: " + stack.size());
		
		System.out.println("Performing pop(), we get: " +stack.pop());
	}
}
