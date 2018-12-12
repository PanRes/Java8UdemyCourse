package gr.pr.udemy.java8.streams.streams_terminal;

import gr.pr.udemy.java8.data.Student;
import gr.pr.udemy.java8.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.partitioningBy;
import static java.util.stream.Collectors.toSet;

public class StreamsPartitioningByExample {

	public static void main(String[] args) {

		System.out.println(partioningByExample1());
		System.out.println();
		System.out.println(partioningByExample2());
	}

	public static Map<Boolean, List<Student>> partioningByExample1() {

		Predicate<Student> studentPredicate = student -> student.getGpa() >= 3.8;
		return StudentDataBase.getAllStudents().stream()
				.collect(partitioningBy(studentPredicate));

	}

	public static Map<Boolean, Set<Student>> partioningByExample2() {

		Predicate<Student> studentPredicate = student -> student.getGpa() >= 3.8;
		return StudentDataBase.getAllStudents().stream()
				.collect(partitioningBy(studentPredicate, toSet()));

	}
}