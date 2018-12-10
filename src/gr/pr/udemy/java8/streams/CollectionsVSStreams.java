package gr.pr.udemy.java8.streams;

import java.util.ArrayList;
import java.util.List;

public class CollectionsVSStreams {
	public static void main(String[] args) {

		List<String> names = new ArrayList<>();
		names.add("PR");
		names.add("McCoy");
		names.add("Angel");
		names.add("Philippos");

		System.out.println(names);
		System.out.println();
		names.remove(0);
		System.out.println(names);
	}
}