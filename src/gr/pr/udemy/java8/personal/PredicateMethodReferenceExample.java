package gr.pr.udemy.java8.personal;

import gr.pr.udemy.java8.data.Student;
import gr.pr.udemy.java8.data.StudentDataBase;

import java.util.function.BiPredicate;

public class PredicateMethodReferenceExample {

	static BiPredicate<Student, Integer> checkGradeLevel = Student::checkGradeLevel;


	public static void main(String[] args) {

		int gradeLevel = 3;
		StudentDataBase.getAllStudents().stream()
				.filter(student -> checkGradeLevel.test(student, gradeLevel))
				.forEach(System.out::println);
	}

}
