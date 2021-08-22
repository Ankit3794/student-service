package com.example.studentservice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentRepository {
	private static List<Student> students = new ArrayList<>();
	static {
		students.add(new Student(1, "James"));
		students.add(new Student(2, "Carl"));
		students.add(new Student(3, "Anna"));
	}

	public static List<Student> getAllStudents() {
		return students;
	}

	public static Student getStudent(int id) {
		return students.stream().findFirst().filter(student -> student.getId() == id).orElse(null);
	}

	public static Student addStudent(Student student){
		students.add(student);
		return student;
	}
}
