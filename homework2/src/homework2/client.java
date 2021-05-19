package homework2;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class client {
	
	public static int[] loadFile(Scanner s, int sz) {
//		System.out.println(s);
		int[] A = new int[sz];
		int i = 0;
		while(s.hasNext()) {
			String ln = s.nextLine();
			System.out.println(ln); //this seems to print a NAME of the file instead of the actual file contents. what do?
			A[i] = Integer.parseInt(ln);
			i++;
		}
		return A;
	}
	public static void write(String  filename, int[]x) throws IOException
	{
		BufferedWriter outputWriter = null;
		outputWriter = new BufferedWriter(new FileWriter(filename));
		for (int i = 0; i < x.length; i++) {
			//maybe:
			outputWriter.write(x[i]+"");
			//or:
//			outputWriter.write(Integer.toString(x[i]));
			outputWriter.newLine();
		}
		outputWriter.flush();
		outputWriter.close();
	}
	
	public static boolean compare(Scanner filename1, Scanner filename2, int size1, int size2)
	{
		if(size1 != size2)
		{
			return false;
		}
		int[] a = loadFile(filename1, size1);
		int[] b = loadFile(filename2, size2);
		for(int i = 0; i < size1; i++)
		{
			if(a[i] != b[i])
			{
				return false;
			}
		}
		return true;
		
	}
	
	public static stack populate(String name) throws FileNotFoundException
	{
		stack stack = new stack();
		stack.cleaner();
		 File file = new File(name);
		   Scanner scan = new Scanner(file);
		int[]a = loadFile(scan, 100000);
		int b = a.length;
		stack.FixedCapacityStackOfStrings(b);
		
		for (int i = 0; i < b; i++)
		{
			stack.push(a[i]);
		}
		
		stack returnedStack = stack;
		return stack;
		
	}
	
	public void store()
	{
		System.out.println("This is placeholder for store that doesn't crash technically!");
	}
   public static void main(String args[]) throws IOException {  
	   String s = "C:/Users/Hussein/eclipse-workspace/homework2/src/homework2/arrayLength_100.txt";
	   File file = new File(s);
	   Scanner scan = new Scanner(file);
	   String t = "C:/Users/Hussein/eclipse-workspace/homework2/src/homework2/output_100.txt";
	   File file2 = new File(t);
	   Scanner scan2 = new Scanner(file2);
	   int[] x = new int[100];
//	   x = LoadFile(scan2, 10);
	  int[] hundred =  loadFile(scan,  100);
	  scan = new Scanner(file);
	  write(t, hundred);
	  compare(scan, scan2, 100, 100);
	  
	  String u = "C:/Users/Hussein/eclipse-workspace/homework2/src/homework2/arrayLength_1000.txt";
	   File file3 = new File(s);
	   Scanner scan3 = new Scanner(file);
	   String v = "C:/Users/Hussein/eclipse-workspace/homework2/src/homework2/output_1000.txt";
	   File file4 = new File(t);
	   Scanner scan4 = new Scanner(file2);
	   int[] y = new int[100];
	   int[] thousand =  loadFile(scan,  1000);
		  scan = new Scanner(file);
		  write(t, thousand);
		  compare(scan, scan2, 1000, 1000);
	  
	  quicksort qs = new quicksort();
//      FileInputStream in = null;
//      FileOutputStream out = null;
//      FileInputStream expectedResult = null;
//      int c =0;
//      int d =0;
//      boolean same = true;
//      try {
//         in = new FileInputStream("C:/Users/Hussein/eclipse-workspace/homework2/src/homework2/arrayLength_10.txt");
//         out = new FileOutputStream("C:/Users/Hussein/eclipse-workspace/homework2/src/homework2/output_10.txt");
//         expectedResult = new FileInputStream("C:/Users/Hussein/eclipse-workspace/homework2/src/homework2/expected_output_100.txt");
//         while ((c = in.read()) != -1 && (d = expectedResult.read()) != -1) {
//            out.write(c);
//         }
//      }finally {
//         if (in != null) {
//            in.close();
//         }
//         if (out != null) {
//            out.close();
//         }
//      }
//      if (c != d)
//      {
//    	  same = false;
//    	  System.out.print("They don't match jack!\n");
//      }
      Comparable[] a = { 9, 9, 10, 3, 6, 2, 1, 1, 7, 2};
      qs.sort(a);
      for (int i = 0; i < 10; i++)
      {
    	  System.out.println(a[i]);
      }
//      timeKeeper(a,  qs);
   }  
   
   public static void timeKeeper(Comparable[] a, quicksort qs)
   {
   long start = System.nanoTime();
   qs.sort(a);
   long end = System.nanoTime();
//   long timeInMillis = TimeUnit.MILLISECONDS.convert(end-start,  TimeUnit.NANOSECONDS);
   System.out.println("Time spend in ns: " + (end - start));
   }
   //to populate a stack, I should read the file, then for each part that is read, push it into a stack
//   public static void stackPopulate(FileInputStream in)
//   {int c = 0;
//   while ((c = in.read()) != -1) {
//      stack.push(c);
//    }
//   }
   //to store elements after sorting stack, you already have it added to stack from previous, so just sort that stack
   
}