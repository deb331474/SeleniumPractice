package in.debasish.java8Function;

import java.util.ArrayList;
import java.util.function.Function;

class Student {
	String name;
	int marks;

	public Student(String name, int marks) {

		this.name = name;
		this.marks = marks;
	}
}

public class FindingStudentGradeUsingFunction {

	public static void main(String[] args) {

		ArrayList<Student> al = new ArrayList<Student>();
		Function<Student, String> f = s -> {
			int marks = s.marks;
			if (marks >= 80) {
				return "A[Distinction]";
			} else if (marks >= 60) {
				return "B[FirstClass]";
			} else if (marks >= 50) {
				return "C[Secondclass]";
			} else if (marks >= 35) {
				return "D[Thirdclass]";
			} else {
				return "Failed";
			}
		};

		populate(al);

		for (Student s : al) {
			System.out.println("Student Name:" + s.name);
			System.out.println("Student Marks:" + s.marks);
			System.out.println("Student Grade:" + f.apply(s));

		}
	}

	static void populate(ArrayList<Student> l) {
		l.add(new Student("Debasish", 456));
		l.add(new Student("Sunny", 100));
		l.add(new Student("Bunny", 65));
		l.add(new Student("Chinny", 55));
		l.add(new Student("Vinny", 45));
		l.add(new Student("Pinny", 25));

	}
}
