import java.util.*;

public class ArrayList implements List
{

	private Object[] list; //initializing an object array
	private int size, length = 0;

	public ArrayList()
	{
		list = new Object[10]; //initializes the array with 10 spaces
		length = list.length;

	}

	public void add(Object obj)
	{

		if (size == list.length) //if the list is full 
		{
			growArray(); //this doubles the size of the array
		}

		list[size] = obj;
		size++;

	}

	public void add(int pos, Object obj) //at a certain position, you're adding an object.
	{
		if (pos < 0 || pos > list.length)
		{
            try 
            {
                throw new Exception("Invalid range");
            }
            catch (Exception e)
            {
                //do nothing
            }
        }
		if (size == list.length) //if the list is full 
		{
			growArray(); //this doubles the size of the array
		}

		for(int i = size; i > pos; i--)
		{
			list[i] = list[i-1]; //shift everything down
		}
		
		size++; //increment the size
		list[pos] = obj; //place the element at the new specified destination
	
	}
	
	public Object get(int pos)
	{
		if (pos < 0 || pos > list.length)
		{
            try 
            {
                throw new Exception("Invalid range");
            }
            catch (Exception e)
            {
                //do nothing
            }
        }

        return list[pos];
	}
	
	public Object remove(int pos)
	{
		if (pos < 0 || pos > list.length)
        {
	        try 
	        {
	            throw new Exception("Invalid range");
	        }
	        
	        catch (Exception e)
	       	{
	                //do nothing
	        }
        }

        Object removed = list[pos];
		for(int i = pos; i < size-1 ; i++)
		{
			list[i] = list[i + 1]; //shifting everything down one
		}

		size--;
		return removed;

	}
	
	public int size() //returns the number of elements that are populating the array
	{

        return size; 
	}

	private void growArray()
	{
		Object[] newList = new Object[(list.length) * 2]; //doubling the size of the array 		
		System.arraycopy(list, 0, newList, 0, list.length);
		list = newList;

	}
	
}
