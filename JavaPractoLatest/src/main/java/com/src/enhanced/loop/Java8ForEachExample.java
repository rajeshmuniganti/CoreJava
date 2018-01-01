package com.src.enhanced.loop;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

public class Java8ForEachExample {
	public static void main(String[] args) {
		Map<String, Integer> items = new HashMap<String, Integer>();
		items.put("A", 10);
		items.put("B", 20);
		items.put("C", 30);
		items.put("D", 40);
		items.put("E", 50);
		items.put("F", 60);
		items.forEach((k, v) -> System.out.println("Item : " + k + " Count : " + v));

		items.forEach((k, v) -> {
			System.out.println("Item : " + k + " Count : " + v);
			if ("E".equals(k)) {
				System.out.println("Hello E");
			}
		});
	}

	public static <T> Collection<T> filter(Predicate<T> predicate, Collection<T> items) {
		Collection<T> result = new ArrayList<T>();
		for (T item : items) {
			if (predicate.test(item)) {
				result.add(item);
			}
		}
		return result;
	}
}