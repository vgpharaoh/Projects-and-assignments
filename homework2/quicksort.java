package homework2;

public class quicksort {
	private static void exch(Object[] a, int i, int j)
	{
		Object swap = a[i];
		a[i] = a[j];
		a[j] = swap;
	}
	private static boolean less (Comparable v, Comparable w)
	{
		if (v.compareTo(w) == -1)
			return true;
		else
			return false;
	}
	
private static int partition(Comparable[] a, int lo, int hi)
{
	int i = lo, j = hi+1;
	while (true)
	{
		while (less(a[++i], a[lo]))
			if (i == hi) break;
		while (less(a[lo], a[--j]))
			if (j == lo) break;
		if (i >= j) break;
		exch(a, i, j);
	}
	exch(a, lo, j);
	return j;
}
		
	
	public static void sort(Comparable[] a)
	{
		sort(a, 0, a.length - 1);
	}
	private static void sort(Comparable[] a, int lo, int hi)
	{
		if (hi <= lo) return;
		int j = partition(a, lo, hi);
		sort(a, lo, j-1);
		sort(a, j+1, hi);
	}
}


