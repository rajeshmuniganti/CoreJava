package com.system.variables;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionFreqTest {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student(001, "raj", "Hyd"));
		students.add(new Student(002, "raji", "Hyd"));
		students.add(new Student(003, "raj2", "Hyd"));
		students.add(new Student(004, "raj3", "Hyd"));
		students.add(new Student(005, "raj4", "Hyd"));
		int count = 0;
		for (Student student : students) {
			count= "Hyd".equals(student.getsAddr())?count+1:count;
		}
		System.out.println(String.valueOf(count));
	}
}
