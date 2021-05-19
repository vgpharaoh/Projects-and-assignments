/***********************
 * In this file, you need to implement a class called "customDSAr<Item>" abbreviated for custom-DataStructure-Array,
   which needs to be implemented using an Array(Fixed size, fix the size to hold 100 elements). 
 * You need to write code at places which say "TO DO". 
 * Do not change the method definitions, since that would make this file incompatible with the client.java file. 
 * Also, feel free to add additional classes/methods if required. Hint: You should add an inner class for Iterator interface, like it is done in the slides.
 */

package homework1;
import java.util.Iterator;

public class customDSAr<Item> implements Iterable<Item>{
 int front=-1;
 int back=-1;
 /*
  * TO DO
  * Initialize the array that holds the "Items"
  */
 private Item[] s = (Item[]) new Object[100];
 public boolean isEmpty() {
	 /*
	  * TO DO
	  * return true if the DS is empty, else return false
	  */if (front == -1 && back == -1)
	  {
		  return true;
	  }
	 return false;
 }
 public int size() {
		/*
		 * TO DO
		 * return the size of the DS, i.e the number of elements in the DS
		 */
	 if(isEmpty() == true )
	 {
		 return 0;
	 }
	int counter = 1;
	int dummy;
	dummy = back;
	while(dummy != front)
	{
		if(dummy == 100)
		{
			dummy = 0;
		}
		counter++;
		dummy++;
	}
		return counter;
 }	
 public void insertFront(Item it) {
	 /*
	  * TO DO
	  * insert a new item at the front of the DS
	  */
	 if(isEmpty())
	 {
		 front = s.length/2;
		 back = s.length/2;
		 s[s.length/2] = it;
	 }
	 else {
		 front++;
	 if(front > 99)
	 {
		 front = 0;
	 }
	 }
	s[front] = it;
 }
 public void insertBack(Item it) {
	 /*
	  * TO DO
	  * insert a new item at the back of the DS
	  */
	 if(isEmpty())
	 {
//		 s[back+1] = it;
		 front = s.length/2;
		 back = s.length/2;
		 s[s.length/2] = it;
	 }
	 else
	 {
		 back--;
		 if(back < 0)
		 {
			 back = 99;
		 }
		s[back] = it; 
	 }

	 
 }
 public Item removeFront() {
	 /*
	  * TO DO
	  * remove a new item from the front of the DS
	  */
	 Item it = s[front];
	 front--;
	 s[front]=null;
	 
	 return it;
 }
 public Item removeBack() {
	 /*
	  * TO DO
	  * remove a new item from the back of the DS
	  */
	 Item it = s[back];
	 back++;
	 s[back] = null;
	 return it;
 }

@Override
public Iterator<Item> iterator() {return new ListIterator();
	/*
	 * TO DO
	 * Implement the iterator method like in the slides to enable usage of "foreach" loop. 
	 */
	//return null; 
}
private class ListIterator implements Iterator<Item> 
{ private int dummy = back;

@Override
public boolean hasNext() { return dummy != front;
	// TODO Auto-generated method stub
//	return false;
}

@Override
public Item next() {
	// TODO Auto-generated method stub
	dummy = dummy--;
	return s[dummy];
}

}
}
