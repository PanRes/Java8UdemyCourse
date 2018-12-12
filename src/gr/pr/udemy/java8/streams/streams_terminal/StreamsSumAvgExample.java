package gr.pr.udemy.java8.streams.streams_terminal;

import gr.pr.udemy.java8.data.Student;
import gr.pr.udemy.java8.data.StudentDataBase;

import static java.util.stream.Collectors.averagingInt;
import static java.util.stream.Collectors.summingInt;

public class StreamsSumAvgExample {

	public static void main(String[] args) {

		System.out.println("Total Notebooks " + sum());
		System.out.println("Average number of Notebooks " + average());

	}

	public static int sum() {
		return StudentDataBase.getAllStudents().stream()
				.collect(summingInt(Student::getNoteBooks));
	}

	public static Double average() {
		return StudentDataBase.getAllStudents().stream()
				.collect(averagingInt(Student::getNoteBooks));
	}
}