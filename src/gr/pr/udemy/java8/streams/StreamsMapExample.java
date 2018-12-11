package gr.pr.udemy.java8.streams;

import gr.pr.udemy.java8.data.Student;
import gr.pr.udemy.java8.data.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsMapExample {
	public static void main(String[] args) {

		getStudentNamesList().forEach(System.out::println); //this will print them each element per line
		System.out.println();
		System.out.println(getStudentNamesList()); //this will print them in a line as List.toString

	}

	public static List<String> getStudentNamesList() {
		return StudentDataBase.getAllStudents().stream() //Stream<Student>
				.map(Student::getName) //Stream<String>
				.map(String::toUpperCase) //Stream<String> -> uppercase operation in each input
				.filter(name -> name.toLowerCase().contains("e"))
				.collect(Collectors.toList());
	}

	public static Set<String> getStudentNamesSet() {
		return StudentDataBase.getAllStudents().stream() //Stream<Student>
				.map(Student::getName) //Stream<String>
				.map(String::toUpperCase) //Stream<String> -> uppercase operation in each input
				.collect(Collectors.toSet());
	}
}