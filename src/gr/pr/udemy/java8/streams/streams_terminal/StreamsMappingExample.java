package gr.pr.udemy.java8.streams.streams_terminal;

import gr.pr.udemy.java8.data.Student;
import gr.pr.udemy.java8.data.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class StreamsMappingExample {

	public static void main(String[] args) {

		List<String> studentsNamesList = StudentDataBase.getAllStudents().stream()
				.collect(mapping(Student::getName,toList()));

		System.out.println("studentsNamesList " + studentsNamesList);

		Set<String> studentsNamesSet = StudentDataBase.getAllStudents().stream()
				.collect(mapping(Student::getName,toSet()));

		System.out.println("studentsNamesSet " + studentsNamesSet);
	}
}