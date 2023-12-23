package com.rays.collectionProgram.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHasSetExample {

	public static void main(String[] args) {

		LinkedHashSet set = new LinkedHashSet();

		set.add("Welcome");
		set.add("To");
		set.add("Geeks");
		set.add("4");
		set.add("Geeks");

		System.out.println(set);

		Iterator it = set.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());

		}

		//System.out.println(set);

	}

}
