import java.util.*;
//
// Timing demonstration for CS211 sorting
// Big-O for bubble sort and Collections sort
//
public class ArraySort {
	public static void main(String[] args) {
		// Establish constant number of elements n for O(n) timing
		final int n = 10;  // Need n=10000 or more for timing
		
		// Initialize array of size n, generating random numbers
		int[] temp = new int[n];
        for (int i=0; i<n; i++) { 
            temp[i]=(int)(1+n*Math.random());  // range of integers is 1 to n
        }
		ArrayList<Integer> list = new ArrayList<Integer>();
		// Need ArrayList to do Collections class sort correctly
		
		// For each integer in the array:
		for (Integer i: temp) list.add(i);
		
		// Print out array for testing early in process
		//for (int i: temp)
		//	System.out.print(" " + i);
		//System.out.println();
		
		long start = System.currentTimeMillis();
		Collections.sort(list);
		for (int j=1; j<temp.length-1; j++) {
			for (int i=0; i<temp.length-j; i++) {
				if (temp[i]>temp[i+1]) swap(temp,i,i+1);
			}
		}
		long end = System.currentTimeMillis();
		System.out.println("Elapsed="+(end-start));
					
		// Print out array after sort to see it's done correctly
		for (int i: temp)
			System.out.print(" " + i);
		System.out.println();
		System.out.println(list);
	}
	
	public static void swap(int[] a, int b, int c) {
		int temp = a[b];
		a[b] = a[c];
		a[c] = temp;
	}
}
