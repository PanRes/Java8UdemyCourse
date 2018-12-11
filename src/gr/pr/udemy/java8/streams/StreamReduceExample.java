package gr.pr.udemy.java8.streams;

import gr.pr.udemy.java8.data.Student;
import gr.pr.udemy.java8.data.StudentDataBase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceExample {

	public static void main(String[] args) {

		List<Integer> integers = Arrays.asList(1,3,5,8);
		System.out.println(performMultiplication(integers));
		System.out.println();

		Optional<Integer> result = performMultiplicationWithoutIdentity(integers);
		System.out.println(result.isPresent());
		System.out.println(result.get());

		System.out.println();
		List<Integer> integerList = new ArrayList<>();
		Optional<Integer> result1 = performMultiplicationWithoutIdentity(integerList);
		System.out.println(result1.isPresent());
		// NoSuchElementException will be thrown
		//System.out.println(result1.get());
		//It will return Optional.empty
		System.out.println(result1);

		System.out.println();
		System.out.println("Student with the Highest GPA is");
		Optional<Student> student = getHighestGPAStudent();
		if (student.isPresent()) {
			System.out.println(student.get());
		}

	}

	public static int performMultiplication(List<Integer> integers) {
		return integers.stream()
				//the first parameter iss the "identity" or the first value
				// so the result for "integers" List will be 2 * 1 * 3 * 5 * 8 = 240
				.reduce(2, (a,b) -> a * b);
	}

	public static Optional<Integer> performMultiplicationWithoutIdentity(List<Integer> integers) {
		return integers.stream()
				//Identity can be removed remove identity but the result will be Optional
				//the the result for "integers" List will be 1 * 3 * 5 * 8 = 120
				.reduce((a,b) -> a * b);
	}

	public static Optional<Student> getHighestGPAStudent() {
		return StudentDataBase.getAllStudents().stream()
				.reduce((student1, student2) -> student1.getGpa() > student2.getGpa() ? student1 : student2);
	}
}