package homework4;

public class stack {
	private int[] s = new int[6301];
	private int n = 0;
	public boolean isEmpty() {
		return n==0;
	}
	public void push(int i) {
		s[n++] = i;
	}
	public int pop() {
		return s[n--];
	}
	
	
}
