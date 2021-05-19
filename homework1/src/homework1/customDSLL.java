/***********************
 * In this file, you need to implement a class called "customDSLL<Item>" abbreviated for custom-DataStructure-Linkedlist,
   which needs to be implemented using a Doubly Linkedlist. 
 * You need to write code at places which say "TO DO". 
 * Do not change the method definitions, since that would make this file incompatible with the client.java file. 
 * Also, feel free to add additional classes/methods if required. Hint: You should add an inner class for Iterator interface, like it is done in the slides.
 */

package homework1;
import java.util.Iterator;

public class customDSLL<Item> implements Iterable<Item>{
	private Node front;
	private Node back;
	private class Node{
		/*
		 * TO DO
		 * Inner class
		 */
		private Node prev;
		private Item item;
		private Node next;
	}
	public boolean isEmpty() {
		/*
		 * TO DO
		 * return true if the DS is empty, else return false 
		 */if(front == null && back == null)
		 {
			 return true;
		 }
		return false;
	}
	public int size() {
		/*
		 * TO DO
		 * return the size of the DS, i.e the number of elements in the DS. Can you do it in constant time?
		 */if(isEmpty() == true)
		 {
			 return 0;
		 }
		int counter = 1;
		Node dummy = back;
		while(dummy.next != null)
		{
			counter++;
			dummy = dummy.next;
			
		}
		return counter;
	}
	public void insertFront(Item it) {
		/*
		 * TO DO
		 * Insert a new element at the front pointer.
		 */
		if(isEmpty()==true)
		{
			Node firstNode = new Node();
			firstNode.item = it;
			front = firstNode;
			back = firstNode;
		}
		else
		{
		Node newNode = new Node();//I have to use my constructor to do this!
		newNode.item = it;
		front.next = newNode;
		newNode.prev = front;
		front = newNode;
		}
	}
	public void insertBack(Item it) {
		/*
		 * TO DO
		 * Insert a new element at the back pointer.
		 */
		if(isEmpty() == true)
		{
			Node firstNode2 = new Node();
			firstNode2.item = it;
			front = firstNode2;
			back = firstNode2;
		}
		else
		{
			Node newNode2 = new Node();
			newNode2.item = it;
			back.prev = newNode2;
			newNode2.next = back;
			back = newNode2;
		}
	}
	public Item removeFront() {
		/*
		 * TO DO
		 * Remove a new element from the front pointer.
		 */
		Node oldFront = new Node();
		oldFront.item = front.item;
		Node newFront = new Node();
		newFront= front.prev;
		newFront.next = null;
		front.prev = null;
		front = newFront;
		
		return oldFront.item;
	}
	public Item removeBack() {
		/*
		 * TO DO
		 * Remove a new element from the back pointer.
		 */
		Node oldBack = new Node();
		oldBack.item = back.item;
		Node newBack = new Node();
		newBack= back.next;
		newBack.prev = null;
		back.next = null;
		back = newBack;
		
		return oldBack.item;
	}
	public Iterator<Item> iterator() { return new ListIterator();
		/*
		 * TO DO
		 * Implement the iterator method like in the slides to enable usage of "foreach" loop. 
		 */   
	
		//return null;
	}
	private class ListIterator implements Iterator<Item> 
	   { private Node dummy = back;

	@Override
	public boolean hasNext() { return dummy != null;
		// TODO Auto-generated method stub
//		return false;
	}

	@Override
	public Item next() {
		// TODO Auto-generated method stub
		Item item = dummy.item;
		dummy = dummy.next;
		return item;
	}
	   
	   }
}
