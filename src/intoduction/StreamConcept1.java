package intoduction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StreamConcept1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhijeet");
		names.add("Omkar");
		names.add("Alekya");
		names.add("Akash");
		names.add("Ram");

		/*
		 * int count = 0; for(int i=0;i<names.size();i++) { String actual =
		 * names.get(i); if(actual.startsWith("A")) { count++; } }
		 * System.out.println(count); }
		 */
		streamFilter();

		System.out.println("****************************************************************");
		mergingArayList();
	}

	public static void streamFilter() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhijeet");
		names.add("Omkar");
		names.add("Alekya");
		names.add("omee");
		names.add("Rama");

		// there is no life for intermediate operations if there in no terminal
		// operation
		// terminal operation will execute only if intermediate operation (filter)
		// returns true
		// we can create steam
		// how to use filter in stream API

		long count1 = names.stream().filter(s -> s.startsWith("A")).count();
		System.out.println(count1);

		long d = Stream.of("Abhijeet", "Omkar", "Alekya", "omee", "Rama").filter(s -> {
			s.startsWith("A");
			return false;
		}).count();
		System.out.println(d);
		System.out.println("****************************************************************");

		// print all the names of ArrayList >4
		names.stream().filter(s -> s.length() > 4).forEach(s -> System.out.println(s));
		names.stream().filter(s -> s.length() > 4).limit(1).forEach(s -> System.out.println(s));
		System.out.println("****************************************************************");

		// Alekya to ALEKYA
		// print names which have last letter as "a" with UpperCase

		Stream.of("Abhijeet", "Omkar", "Alekya", "omee", "Rama").filter(s -> s.endsWith("a")).map(s -> s.toUpperCase())
				.forEach(s -> System.out.println(s));

		System.out.println("****************************************************************");
		// print names which have first letter as "a" with upperCase and sorted
		List<String> names1 = Arrays.asList("Abhijeet", "Don", "Alekya", "Adam", "Rama");
		names1.stream().filter(s -> s.startsWith("A")).sorted().map(s -> s.toUpperCase())
				.forEach(s -> System.out.println(s));
	}

	public static void mergingArayList() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Man");
		names.add("Ron");
		names.add("Women");
		names.add("omee");
		names.add("Hanumana");

		List<String> names1 = Arrays.asList("Abhijeet", "Don", "Alekya", "Adam", "Rama");
		// Merging Two Different Lists
		Stream<String> newStream = Stream.concat(names.stream(), names1.stream());
		// newStream.sorted().forEach(s -> System.out.println(s)); //remove

		System.out.println("****************************************************************");
		// check any name present in the ArrayList or Not
		boolean flag = newStream.anyMatch(s -> s.equalsIgnoreCase("AdaM"));
		System.out.println(flag);
		Assert.assertTrue(flag);

		System.out.println("****************************************************************");
		// check the name ends with letter "a" uppercase and grab the fist name
		List<String> ls = Stream.of("Abhijeet", "Don", "Alekya", "Adam", "Rama").filter(s -> s.endsWith("a"))
				.map(s -> s.toUpperCase()).collect(Collectors.toList());
		System.out.println(ls.get(0));

		System.out.println("****************************************************************");
		List<Integer> values = Arrays.asList(3, 2, 2, 7, 5, 1, 9, 7);
		// print unique numbers from this array

		values.stream().distinct().forEach(s -> System.out.println(s));
		// sort the array - 3rd index - 1,2,3,5,7,9
		System.out.println("****************************************************************");
		List<Integer> li = values.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(li.get(2));

	}
}

//https://www.facebook.com/groups/RahulShettyAcademy/
