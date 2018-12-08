package gr.pr.udemy.java8.functionalinterfaces;

import gr.pr.udemy.java8.data.Student;
import gr.pr.udemy.java8.data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionStudentExample {

	static Function<List<Student>, Map<String, Double>> getStudentsNamesAndGPAs = students -> {
		Map<String, Double> studentsNameAndGPA = new HashMap<>();
		students.stream()
				.filter(PredicateStudentExample.gpaFilter)
				.forEach(student -> studentsNameAndGPA.put(student.getName(), student.getGpa()));
		return studentsNameAndGPA;
	};

	public static void main(String[] args) {

		System.out.println(getStudentsNamesAndGPAs.apply(StudentDataBase.getAllStudents()));
	}
}