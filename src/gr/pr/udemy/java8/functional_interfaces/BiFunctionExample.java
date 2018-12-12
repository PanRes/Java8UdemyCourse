package gr.pr.udemy.java8.functional_interfaces;

import gr.pr.udemy.java8.data.Student;
import gr.pr.udemy.java8.data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionExample {

	static BiFunction<List<Student>, Predicate<Student>, Map<String, Double>> getStudentNameAndGPAOnCOndition = (students, studentPredicate) -> {
		Map<String, Double> studentsNameAndGPA = new HashMap<>();
		students.stream()
				.filter(studentPredicate)
				.forEach(student -> studentsNameAndGPA.put(student.getName(), student.getGpa()));
		return studentsNameAndGPA;
	};

	public static void main(String[] args) {

		System.out.println(getStudentNameAndGPAOnCOndition.apply(StudentDataBase.getAllStudents(), PredicateStudentExample.gpaFilter));

	}
}