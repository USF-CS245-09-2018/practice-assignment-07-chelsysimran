import java.util.*;

public class ArrayList implements List
{

	private Object[] list;
	private int size = list.length();

	public ArrayList()
	{
		list = new Object[10];
	}

	public void add(Object obj)
	{
		list[size] = obj;
		size++;

	}

	public void add(int pos, Object obj)
	{
		for(int i = size; i > pos; i--)
		{
			list[i] = list[i-1]; //shift everything down

		}

		list[pos] = obj; //place the element at the new specified destination
		size++; //increment the size

	}
	
	public Object get(int pos)
	{
		for(int i = 0; i < size; i++)
		{
			if(i == pos)
			{
				return list[i]; //returns the element at the position specified by the user
			}
		}

	}
	
	public Object remove(int pos)
	{
		for(int i = pos + 1; i < size; i++)
		{
			list[i-1] = list[i]; //shifting everything down one
			size--; //decrement size, because you just took an element out

		}


	}
	
	public int size()
	{
		return size;

		Object[] newList = new Object[(list.length) * 2];		
		System.arraycopy(list, 0, newList, 0, list.length);
		list = newList;

	}

	
}