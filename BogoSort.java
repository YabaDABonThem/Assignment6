// Allen Bao
// CS 211
// BogoSort Class for Assignment 6

// import libraries
import java.util.Random;
import java.time.*;

public class BogoSort {

	public static void main(String[] args) {
		int[] myArray = { 2, 8, 7, 5, 1, 21, 14, 63, 17, 20 };

		// track the time that it took to sort the item
		long startTime = Instant.now().toEpochMilli();
		bogoSort(myArray);
		long endTime = Instant.now().toEpochMilli();
		long timeElapsed = endTime - startTime;
		printArray(myArray);
		System.out.println("Execution time in milliseconds: " + timeElapsed);
	}

	// Places the elements of a into sorted order.
	public static void bogoSort(int[] a) {
		while (!isSorted(a)) {
			shuffle(a);
			// printArray(a);
		}
	}
	// Returns true if a's elements are in sorted order.
	public static boolean isSorted(int[] a) {
		// go through all the elements in the array and compares an element to the next one
		// if the current element is greater than the next, then it means that the array isn't sorted.
		for (int i = 0; i < a.length - 1; ++i) {
			if (a[i + 1] < a[i]) {
				return false;
			}
		}
		return true;
	}
	// Shuffles an array of ints by randomly swapping each
	// element with an element ahead of it in the array.
	public static void shuffle(int[] a) {
		Random random = new Random();
		for(int i=0; i < a.length; i++) {
			swap(a, i, i + random.nextInt(a.length - i));
		}
	}
	// Swaps a[i] with a[j].
	public static void swap(int[] a, int i, int j) {
		// you need to create new variable to hold the former i value
		int oldI = a[i];
		a[i] = a[j];
		a[j] = oldI;
	}
	
	public static void printArray(int[] a) {
		for(int i=0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	
} //end of BogoSort class