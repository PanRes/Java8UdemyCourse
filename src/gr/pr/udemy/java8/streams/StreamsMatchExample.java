package gr.pr.udemy.java8.streams;

import gr.pr.udemy.java8.data.StudentDataBase;

public class StreamsMatchExample {

	public static void main(String[] args) {

		System.out.println("Does all students have GPA greater or equal than 3.9? " + allMatch());
		System.out.println("Does any student have GPA greater or equal than 3.9? " + anyMatch());
		System.out.println("Does none of the students have GPA lower or equal than 3.0? " + noneMatch());
	}

	public static boolean allMatch() {
		return StudentDataBase.getAllStudents().stream()
				.allMatch(student -> student.getGpa() >= 3.9);
	}

	public static boolean anyMatch() {
		return StudentDataBase.getAllStudents().stream()
				.anyMatch(student -> student.getGpa() >= 3.9);
	}

	public static boolean noneMatch() {
		return StudentDataBase.getAllStudents().stream()
				.noneMatch(student -> student.getGpa() <= 3.0);
	}
}