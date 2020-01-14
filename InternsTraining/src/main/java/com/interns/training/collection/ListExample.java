package com.interns.training.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hp
 * 
 *         Complexity is currently only X
 *
 */
public class ListExample {

//Creating the List of the String of Names

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();// Creating arraylist
		list.add("Ravi");
		list.add("Vijay");
		list.add("Ravi");
		list.add("Ajay");
		System.out.println(list);

	}

}
