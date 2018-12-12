package gr.pr.udemy.java8.streams.streams_terminal;

import gr.pr.udemy.java8.data.Student;
import gr.pr.udemy.java8.data.StudentDataBase;

import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;

public class StreamsCountingExample {

	public static void main(String[] args) {

		System.out.println(count());
	}

	public static Long count(){
		return StudentDataBase.getAllStudents().stream()
				.filter(student -> student.getGpa() >= 3.9)
				.collect(counting());
	}
}