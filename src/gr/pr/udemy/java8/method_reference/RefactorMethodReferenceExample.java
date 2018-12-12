package gr.pr.udemy.java8.method_reference;

import gr.pr.udemy.java8.data.Student;
import gr.pr.udemy.java8.data.StudentDataBase;

import java.util.function.Predicate;

public class RefactorMethodReferenceExample {

	static Predicate<Student> filterGradeLevel = RefactorMethodReferenceExample::greaterThanGradeLevel;

	public static void main(String[] args) {

		System.out.println(filterGradeLevel.test(StudentDataBase.studentSupplier.get()));

	}

	public static boolean greaterThanGradeLevel(Student student) {
		return student.getGradeLevel() >= 3;
	}
}