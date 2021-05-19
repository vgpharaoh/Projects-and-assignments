package homework2;

public class stack {
	private static int[] s;
	private static int n = 0;
	
	public void FixedCapacityStackOfStrings(int capacity)
	{
		s = new int[capacity];
	}

	public boolean isEmpty()
	{
		return n == 0; 
	}

	public int pop()
	{
		return s[--n];
	}

	public void push(int item)
	{
		s[n++] = item;
	}
	
	public static void cleaner()
	{
		for (int i = 0; i < n; i++)
		{
			s = null;
		}
	}

}

