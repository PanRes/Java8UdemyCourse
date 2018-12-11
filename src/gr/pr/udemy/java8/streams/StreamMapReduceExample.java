package gr.pr.udemy.java8.streams;

import gr.pr.udemy.java8.data.Student;
import gr.pr.udemy.java8.data.StudentDataBase;

public class StreamMapReduceExample {

	public static void main(String[] args) {

		System.out.println(sumOfNotebooks());

	}

	/**
	 *
	 * @return Sum of Students' notebooks with grade level greater than 3
	 */
	private static int sumOfNotebooks() {

		return StudentDataBase.getAllStudents().stream()
				.filter(student -> student.getGradeLevel() >= 3)
				.map(Student::getNoteBooks)
//				.reduce(0, (a, b) -> a + b);
				.reduce(0,Integer::sum);
	}
}