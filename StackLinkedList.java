import java.util.*;

public class StackLinkedList<E> 
{
	private LinkedList<E> data;
	
	public StackLinkedList()
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
	
	public void push(E e)
	{
		data.addLast(e);
	}
	
	public E top() 
	{
		if (data.size()==0){
			return null;
		}
		return data.getLast();
	}
	
	public E pop()
	{
		if (data.size()==0){
			return null;
		}
		return data.removeLast();
	}
	
	
	public static void main(String args[])
	{
		StackLinkedList<Integer> stack = new StackLinkedList<>();
		System.out.println("Initially Size: " + stack.size());
		System.out.println("Initially isEmpty: " + stack.isEmpty());
		System.out.println("Top: " + stack.top());
		System.out.println("Trying to pop(): " + stack.pop());
		System.out.println();
		
		System.out.println("Pushing 1,2,3,4");
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		System.out.println();
		
		System.out.println("Top: "+stack.top());
		System.out.println("isEmpty: " + stack.isEmpty());
		System.out.println("Size: " + stack.size());
		System.out.println();
		
		System.out.println("Performing pop(), we get: " +stack.pop());
		System.out.println("Top: "+stack.top());
		System.out.println("Size: " + stack.size());
	}
}
