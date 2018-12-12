package gr.pr.udemy.java8.streams.streams_terminal;

import gr.pr.udemy.java8.data.Student;
import gr.pr.udemy.java8.data.StudentDataBase;

import java.util.*;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.*;

public class StreamsGroupingByExample {

	public static void main(String[] args) {

		System.out.println(groupBy());
		System.out.println();
		System.out.println(customizedGroupBy());
		System.out.println();
		System.out.println(twoLevelGrouping1());
		System.out.println();
		System.out.println(twoLevelGrouping2());
		System.out.println();
		System.out.println(threeArgumentsGroupBy());
		System.out.println();
		System.out.println(calculateTopGpaWithOptional());
		System.out.println();
		System.out.println(calculateTopGpa());
	}

	public static Map<String, List<Student>> groupBy() {
		return StudentDataBase.getAllStudents().stream()
				.collect(groupingBy(Student::getGender));
	}

	public static Map<String, List<Student>> customizedGroupBy() {
		return StudentDataBase.getAllStudents().stream()
				.collect(groupingBy(student -> student.getGpa() >= 3.8 ? "Outstanding" : "Average"));
	}

	public static Map<Integer, Map<String, List<Student>>> twoLevelGrouping1() {
		return StudentDataBase.getAllStudents().stream()
				.collect(groupingBy(Student::getGradeLevel, groupingBy(student -> student.getGpa() >= 3.8 ? "Outstanding" : "Average")));

	}

	public static Map<Integer, Integer> twoLevelGrouping2() {
		return StudentDataBase.getAllStudents().stream()
				.collect(groupingBy(Student::getGradeLevel, summingInt(Student::getNoteBooks)));

	}

	public static LinkedHashMap<String, Set<Student>> threeArgumentsGroupBy() {
		return StudentDataBase.getAllStudents().stream()
				.collect(groupingBy(Student::getName, LinkedHashMap::new, toSet()));

	}

	public static Map<Integer, Optional<Student>> calculateTopGpaWithOptional() {
		return StudentDataBase.getAllStudents().stream()
				.collect(groupingBy(Student::getGradeLevel, maxBy(comparing(Student::getGpa))));
	}

	public static Map<Integer, Student> calculateTopGpa() {
		return StudentDataBase.getAllStudents().stream()
				.collect(groupingBy(Student::getGradeLevel, collectingAndThen(maxBy(comparing(Student::getGpa)), Optional::get)));
	}
}