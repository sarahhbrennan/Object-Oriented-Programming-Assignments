//Sarah Brennan - 2962279
import java.util.*;
public class MyStack<T> {

	private LinkedList<T> myStackList;
	private int size = 0;
	
	/*Constructors*/
	public MyStack() {
		myStackList = new LinkedList<T>();
	}
	
	public MyStack(T x)
	{
		myStackList = new LinkedList<T>();
		myStackList.add(x);
	}	
	
	/**Getters and setters**/
	
	public LinkedList<T> getMyStackList()
	{
		return myStackList;
	}
	
	public void setMyStackList(LinkedList<T> lst)
	{
		myStackList = lst;
	}
	
	public int getSize()
	{
		return size;
	}
	
	public void setSize(int size)
	{
		this.size = size;
	}
	
	/*Check if stack empty*/
	public boolean stackEmpty() {
		if(size == 0)
			return true;
		else
			return false;
	}

	/*Check if stack full, which it cannot be as it is a linkedlist*/
	public boolean stackFull() {
		return false;
	}

	/*Remove top item from list*/
	public T pop() {
		if(stackEmpty())
		{
			System.out.println("Stack Empty!!!");
			return null;
		}
		else
		{
			//create temp item to get top of stack to return
			T temp = myStackList.get(size);
			//remove top item
			myStackList.remove(size);
			//decrease the size of the stack
			size--;
			return temp;
		}
	}	

	/*Find top item of stack*/
	public T top()
	{
		if(stackEmpty())
		{
			System.out.println("Stack is Empty!!!");
			return null;
		}
		else
		{
			//return the top item of stack
			return myStackList.get(size);
		}
	}

	/*Add items to stack*/
	public void push(T x) {
		if(stackFull())
			System.out.println("Stack Full!!!");
		else {
			//add item to stack
			myStackList.add(x);
			//increase size of stack
			size++;
		}
			
	}

	/*Pretty print stack*/
	public String toString() {
		return myStackList.toString();
	}

	/*Find size of stack*/
	public int size()
	{
		return myStackList.size();
	}

	/*Search stack for item*/
	public boolean search(T x)
	{
		if(myStackList.contains(x))
			return true;
		else
			return false;
	}

	/*Find frequency that an item appears in the stack*/
	public int freq(T x)
	{
		//create counter
		int count = 0;
		//for loop to increase counter when found
		for(T e : myStackList)
		{
			if(e.equals(x))
				//increase counter if found
				count++;
		}
		//if there is nothing found 
		if(count == 0)
			System.out.println("Nothing in stack with " + x);
		//return frequency
		return count;
	}

	/*Compare 2 objects*/
	public boolean equals(Object obj)
	{
		//<?> is a wildcard to make sure the object is a MyStack object
		if(!(obj instanceof MyStack<?>))
			return false;
		MyStack<?> t1 = (MyStack<?>)obj;
		//compare all attributes in the object with one another
		if(this.getMyStackList().equals(t1.getMyStackList()) && this.getSize() == t1.getSize())
			return true;
		else
			return false;
	}
}
