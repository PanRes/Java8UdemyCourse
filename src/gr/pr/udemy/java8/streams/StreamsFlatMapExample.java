package gr.pr.udemy.java8.streams;

import gr.pr.udemy.java8.data.Student;
import gr.pr.udemy.java8.data.StudentDataBase;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class StreamsFlatMapExample {

	public static void main(String[] args) {

		System.out.println(printStudentActivities());
		System.out.println(countStudentActivities());
		System.out.println();
		printStudentActivities().stream()
				.forEach(System.out::println);

	}

	public static List<String> printStudentActivities() {
		 return StudentDataBase.getAllStudents().stream() //Stream<Student>
				.map(Student::getActivities) //Stream<List<String>>
				.flatMap(List::stream) //Stream<String> transforms Stream<Collections> into one Stream
				.distinct() //Stream<String> -> distinct values
				.sorted() //Stream<String> -> sorts stream
				.collect(toList());

	}

	public static Long countStudentActivities() {
		 return StudentDataBase.getAllStudents().stream() //Stream<Student>
				.map(Student::getActivities) //Stream<List<String>>
				.flatMap(List::stream) //Stream<String> transforms Stream<Collections> into one Stream
				.distinct()
				.count();

	}
}