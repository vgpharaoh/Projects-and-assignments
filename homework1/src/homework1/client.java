/*************************************************************
 * THINGS TO KNOW:
 * This file contains test cases that you can initially test your program with. So, do not modify anything in this file. 
 * You should only fill in the code for customDSLL.java and customDSAr.java, and then run this code (client.java) which calls those two classes. 
 * If your code is correct, you should see the same output as given in the homework document.  
 * Finally, fill in the below fields before submitting your code.
***************************************************************/ 
/**************************************************************
 * Assignment - 1
 * Name: 
 * ASU Id:
 * Class Id:
 * ASU rite Id:
 ***************************************************************/
package homework1;
import java.io.*;

public class client {
	private class Url{
		/*
		 * Custom class for testing generics implementation
		 */
		String link;
		int browseFrequency;
		
		Url(String str, int i){
			this.link = str;
			this.browseFrequency = i;
		}
	}
	public static void main(String[] args) throws IOException {
		/*
		 * Initializing the custom data structures (abbreviated as DS in rest of the file) to facilitate performing the tests. 
		 */
		customDSLL<Integer> dummyDSLL = new customDSLL<Integer>();
		customDSAr<Integer> dummyDSAr = new customDSAr<Integer>();
		
		customDSLL<Url> dummyDSLLUrls = new customDSLL<Url>();
		customDSAr<Url> dummyDSArUrls = new customDSAr<Url>();
		
		/*
		 * Initializing the data that will be actually inserted into the DS
		 */
		client myclient = new client();
		int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
		Url[] urls = new Url[6];
		urls[0] = myclient.new Url("google.com", 2060);
		urls[1] = myclient.new Url("facebook.com", 600);
		urls[2] = myclient.new Url("instagram.com", 523);
		urls[3] = myclient.new Url("youtube.com", 356);
		urls[4] = myclient.new Url("twitter.com", 960);
		urls[5] = myclient.new Url("asu.edu", 37);
		
		/*
		 * Test cases from 1 - 8; description given in the assignment document. 
		 */
		System.out.println("TEST CASE - 1: Elements in the DS from back to front: Linkedlist implementation");
		System.out.println("-----------------------------------------------------------------------------------");
		insertIntDataIntoDSLL(A, dummyDSLL);
		printLL(dummyDSLL);
		
//		System.out.println("\n---------------------------------------------------------------------------------");
//		System.out.println("TEST CASE - 2: Elements in the DS from back to front: Array implementation");
//		System.out.println("-----------------------------------------------------------------------------------");
//		insertIntDataIntoDSAr(A, dummyDSAr);
//		printAr(dummyDSAr);
		
		System.out.println("\n---------------------------------------------------------------------------------");
		System.out.println("TEST CASE - 3: Elements removed from the DS: Linkedlist implementation");
		System.out.println("-----------------------------------------------------------------------------------");
		removeLL(dummyDSLL);
		
//		System.out.println("\n---------------------------------------------------------------------------------");
//		System.out.println("TEST CASE - 4: Elements removed from the DS: Array implementation");
//		System.out.println("-----------------------------------------------------------------------------------");
//		removeAr(dummyDSAr);
		
		System.out.println("\n---------------------------------------------------------------------------------");
		System.out.println("TEST CASE - 5: Checking the usage of generics: Inserting custom URL objects: Linkedlist implementation");
		System.out.println("-----------------------------------------------------------------------------------");
		insertUrlDataIntoDSLL(urls, dummyDSLLUrls);
		printLLUrls(dummyDSLLUrls);
		
//		System.out.println("\n---------------------------------------------------------------------------------");
//		System.out.println("TEST CASE - 6: Checking the usage of generics: Inserting custom URL objects: Array implementation");
//		System.out.println("-----------------------------------------------------------------------------------");
//		insertUrlDataIntoDSAr(urls, dummyDSArUrls);
//		printArUrls(dummyDSArUrls);
		
		System.out.println("\n---------------------------------------------------------------------------------");
		System.out.println("TEST CASE - 7: Checking the size of the DS: Linkedlist implementation");
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println(dummyDSLL.size());
		
//		System.out.println("-----------------------------------------------------------------------------------");
//		System.out.println("TEST CASE - 8: Checking the size of the DS: Array implementation");
//		System.out.println("-----------------------------------------------------------------------------------");
//		System.out.println(dummyDSAr.size());
//		System.out.println("-----------------------------------------------------------------------------------");
	}
	
	/*
	 * Methods to perform insert, remove, print operations on the data-structure. DO NOT CHANGE. 
	 * remove and insert methods contains a temporary array (for eg. removeFrom in the below function) that determines if an 
	   element is to be removed (/inserted) at the front or back of the DS. 
	 * A value of 1 represents remove (/add) from the front and a value of 2 represents remove (/add) from the back.    
	 */
	public static void removeLL(customDSLL<Integer> dummyDS) {
		int[] removeFrom = {1, 2, 2, 2, 2, 2, 1, 1, 1, 2, 1, 2, 1};
		for (int i=0;i<removeFrom.length; i++) {
			if (removeFrom[i] == 1) {
			System.out.print(dummyDS.removeFront());
			}
			else if (removeFrom[i] == 2) {
				System.out.print(dummyDS.removeBack());
			}
			System.out.print(",");
		}
	}
	
	public static void removeAr(customDSAr<Integer> dummyDS) {
		int[] removeFrom = {1, 2, 2, 2, 2, 2, 1, 1, 1, 2, 1, 2, 1};
		for (int i=0;i<removeFrom.length; i++) {
			if (removeFrom[i] == 1) {
			System.out.print(dummyDS.removeFront());
			}
			else if (removeFrom[i] == 2) {
				System.out.print(dummyDS.removeBack());
			}
			System.out.print(",");
		}
	}
	
	public static void printLL(customDSLL<Integer> dummyDS) {
		for (Integer i1: dummyDS) {
			System.out.print(i1);
			System.out.print(',');
		}
	}
	
	public static void printLLUrls(customDSLL<Url> dummyDSUrls) {
			for (Url i1: dummyDSUrls) {
				System.out.print(i1.link);
				System.out.print(" - ");
				System.out.print(i1.browseFrequency);
				System.out.print(" , ");
			}
		}
	
	public static void printArUrls(customDSAr<Url> dummyDSUrls) {
			for (Url i1: dummyDSUrls) {
				System.out.print(i1.link);
				System.out.print(" - ");
				System.out.print(i1.browseFrequency);
				System.out.print(" ,  ");
			}
		}
	

	public static void printAr(customDSAr<Integer> dummyDS) {
			for (Integer i1: dummyDS) {
				System.out.print(i1);
				System.out.print(',');
			}
		}
	
	public static void insertIntDataIntoDSLL(int[] A, customDSLL<Integer> dummyDS) {
		int[] insertOrder = {1, 1, 1, 2, 1, 2, 1, 2, 2, 2, 1, 1, 2, 1, 1, 2, 1, 1, 2, 1};
		for(int i = 0;i<insertOrder.length;i++) {
			if (insertOrder[i] == 1) {
				dummyDS.insertFront(A[i]);
			}
			else if(insertOrder[i] == 2) {
				dummyDS.insertBack(A[i]);
			}
		} 
	}
	
	public static void insertIntDataIntoDSAr(int[] A, customDSAr<Integer> dummyDS) {
		int[] insertOrder = {1, 1, 1, 2, 1, 2, 1, 2, 2, 2, 1, 1, 2, 1, 1, 2, 1, 1, 2, 1};
		for(int i = 0;i<insertOrder.length;i++) {
			if (insertOrder[i] == 1) {
				dummyDS.insertFront(A[i]);
			}
			else if(insertOrder[i] == 2) {
				dummyDS.insertBack(A[i]);
			}
		} 
	}
	
	public static void insertUrlDataIntoDSLL(Url[] urls, customDSLL<Url> dummyDSUrls) {
		int[] insertOrder = {1, 2, 2, 1, 2, 1};
		for (int i = 0; i <urls.length; i++) {
			if (insertOrder[i] == 1) {
				dummyDSUrls.insertFront(urls[i]);
			}
			else if (insertOrder[i] == 2) {
				dummyDSUrls.insertBack(urls[i]);
			}
		}
	}
	
	public static void insertUrlDataIntoDSAr(Url[] urls, customDSAr<Url> dummyDSUrls) {
		int[] insertOrder = {1, 2, 2, 1, 2, 1};
		for (int i = 0; i <urls.length; i++) {
			if (insertOrder[i] == 1) {
				dummyDSUrls.insertFront(urls[i]);
			}
			else if (insertOrder[i] == 2) {
				dummyDSUrls.insertBack(urls[i]);
			}
		}
	}

}
