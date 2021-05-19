package homework4;

import java.util.Iterator;

public class linkedlist implements Iterable{
	private Node head;
	private class Node {
		private int item;
		private Node next;
	}
	public void insert(int it) {
		Node newNode = new Node();
		newNode.item = it;
		if (head == null) {
			head = newNode;
		}
		else {
			newNode.next = head;
			head = newNode;
		}
	}
	public boolean search(int it) {
		Node cur = head;
		while(cur != null) {
			if (cur.item == it) {
				return true;
			}
			cur = cur.next;
		}
		return false;
	}
	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return new listIterator();
	}
	
	private class listIterator implements Iterator{
		
		private Node cur = head;
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			if(cur == null)
			return false;
			else
			return true;
		}

		@Override
		public Object next() {
			// TODO Auto-generated method stub
			int it = cur.item;
			cur = cur.next;
			return it;
		}
		
	}
	
}
