package com.interns.training.collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorExample {

	public static void main(String args[]) {

		ArrayList<String> arrlist = new ArrayList<String>();

		// adding element to arrlist
		arrlist.add("June");
		arrlist.add("John");
		arrlist.add("Ants");
		arrlist.add("Dogs");

		// print arrlist
		System.out.println("ArrayList: " + arrlist);

		// Creating object of ListIterator<String>
		// using listIterator() method
		ListIterator<String> iterator = arrlist.listIterator();

		// Printing the iterated value
		System.out.println("\nUsing ListIterator:\n");
		while (iterator.hasNext()) {
			System.out.println("Value is : " + iterator.next());
		}

	}
}
