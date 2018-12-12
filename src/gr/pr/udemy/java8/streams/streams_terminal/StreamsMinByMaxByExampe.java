package gr.pr.udemy.java8.streams.streams_terminal;

import gr.pr.udemy.java8.data.Student;
import gr.pr.udemy.java8.data.StudentDataBase;

import java.util.Comparator;
import java.util.Optional;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.maxBy;
import static java.util.stream.Collectors.minBy;

public class StreamsMinByMaxByExampe {

	public static void main(String[] args) {

		System.out.println(minByExample());
		System.out.println(maxByExample());
	}

	public static Optional<Student> minByExample() {
		return StudentDataBase.getAllStudents().stream()
				.collect(minBy(comparing(Student::getGpa)));
	}

	public static Optional<Student> maxByExample() {
		return StudentDataBase.getAllStudents().stream()
				.collect(maxBy(comparing(Student::getGpa)));
	}
}