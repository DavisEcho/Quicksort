/*
 * Shannon Davis
 * davisshannon2012@gmail.com
 * Assignment 3
 * Quicksort Using Lomuto
 * Sorts integers into ascending order
 * Unfinished
 * Untested
 */
import java.io.*;
import java.util.*;

public class p3 {
    public static void main(String[] args) {
        int CAPACITY = 1000;
	int size = 0;
	Scanner in = new Scanner(System.in);
	int[] integers = new int[CAPACITY];

	while (in.hasNextInt()) {
	    if (size >= CAPACITY) {
		CAPACITY *= 2;
		int[] temp = new int[CAPACITY];
		for (int i = 0; i < size; i++) {
		    temp[i] = integers[i];
		}
		integers = temp;
	    }
	    integers[size] = in.nextInt();
	    size++;
	}
	for (int i = 0; i < size; i++) {
	    System.out.println(integers[i]);

	}
    }
}
