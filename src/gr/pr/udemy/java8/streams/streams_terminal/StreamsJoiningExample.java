package gr.pr.udemy.java8.streams.streams_terminal;

import gr.pr.udemy.java8.data.Student;
import gr.pr.udemy.java8.data.StudentDataBase;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;

public class StreamsJoiningExample {

	public static void main(String[] args) {

		System.out.println(joining1());
		System.out.println(joining2());
		System.out.println(joining3());

	}

	public static String joining1() {
		return StudentDataBase.getAllStudents().stream()
				.map(Student::getName)
				.collect(joining());
	}

	public static String joining2() {
		return StudentDataBase.getAllStudents().stream()
				.map(Student::getName)
				.collect(joining("-"));
	}

	public static String joining3() {
		return StudentDataBase.getAllStudents().stream()
				.map(Student::getName)
				.collect(joining("', '", "('","')"));
	}
}