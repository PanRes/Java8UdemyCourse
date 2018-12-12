package gr.pr.udemy.java8.streams.paraller_streams;

import gr.pr.udemy.java8.data.Student;
import gr.pr.udemy.java8.data.StudentDataBase;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class ParallelStreamExample1 {

	public static void main(String[] args) {

		sequenctialPrintStudentActivities();
		parallelPrintStudentActivities();
	}

	public static List<String> sequenctialPrintStudentActivities() {
		long startTime = System.currentTimeMillis();

		List<String> studentActivities = StudentDataBase.getAllStudents().stream() //Stream<Student>
				.map(Student::getActivities) //Stream<List<String>>
				.flatMap(List::stream) //Stream<String> transforms Stream<Collections> into one Stream
				.distinct() //Stream<String> -> distinct values
				.sorted() //Stream<String> -> sorts stream
				.collect(toList());

		System.out.println("Duration execution for sequential: " + (System.currentTimeMillis() - startTime) + "ms");

		return studentActivities;

	}

	public static List<String> parallelPrintStudentActivities() {
		long startTime = System.currentTimeMillis();

		List<String> studentActivities = StudentDataBase.getAllStudents().stream() //Stream<Student>
				.parallel()
				.map(Student::getActivities) //Stream<List<String>>
				.flatMap(List::stream) //Stream<String> transforms Stream<Collections> into one Stream
				.distinct() //Stream<String> -> distinct values
				.sorted() //Stream<String> -> sorts stream
				.collect(toList());

		System.out.println("Duration execution for parallel: " + (System.currentTimeMillis() - startTime) + "ms");

		return studentActivities;

	}
}