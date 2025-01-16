package arr;

import java.lang.reflect.Array;

public class MyGenericList<T>
{
	// public T list[] = new T[25];
	// --> MESSAGE: Cannot create a generic array of T
	
	// Workaround using reflection (suggested by copilot...)
	// @SuppressWarnings("unchecked")
    // public T[] list = (T[]) new Object[25];
	// --> Führt auch zu Problem
	
	public T[] list;
	
	@SuppressWarnings("unchecked")
	public MyGenericList(Class<T> clazz)
	{
		list = (T[]) Array.newInstance(clazz, 25);
	}

	public void add(T new_element, int i) 
	{
		list[i] = new_element;
	}
	
}
