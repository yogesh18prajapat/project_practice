package com.bat.school;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class SchoolMain {
	private static final String HINDI = "hindi";
	private static final String MATHS = "Maths";
	private static final String SCIENCE = "Science";
	
	public static void main(String[] args) {
		
		Subject sub11 = new Subject(HINDI, 45);
		Subject sub12 = new Subject(HINDI, 35);
		Subject sub13 = new Subject(HINDI, 55);
		
		Subject sub21 = new Subject(MATHS, 31);
		Subject sub22 = new Subject(MATHS, 47);
		Subject sub23 = new Subject(MATHS, 53);

		Subject sub31 = new Subject(SCIENCE, 61);
		Subject sub32 = new Subject(SCIENCE, 72);
		Subject sub33 = new Subject(SCIENCE, 84);
		
		List<Subject> s1Subjects = new ArrayList<>();
		Collections.addAll(s1Subjects, sub11,sub21,sub31);

		List<Subject> s2Subjects = new ArrayList<>();
		Collections.addAll(s2Subjects, sub12,sub22,sub32);

		List<Subject> s3Subjects = new ArrayList<>();
		Collections.addAll(s3Subjects, sub13,sub23,sub33);
		
		Student s1 = new Student("name1","A",16,"Dept1");
		s1.setSubjects(s1Subjects);
		
		Student s2 = new Student("name2","B",17,"Dept2");
		s2.setSubjects(s2Subjects);

		Student s3 = new Student("name3","C",18,"Dept3");
		s3.setSubjects(s3Subjects);

		List<Student> students = new ArrayList<>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
			
//		for (Student student : getFailedStudents(students,"science",84)) {
//			System.out.println(student);
//			System.out.println("----------------------------------");
//		}
		
		System.out.println("Befor Iterating");
		for(Student s : students) {
			System.out.println("name : "+s.getName());
		}
		ListIterator<Student> listIterator = students.listIterator();
		while(listIterator.hasNext()) {
			Student st = listIterator.next();
			if(st.getName().equalsIgnoreCase("name2")) {
				listIterator.remove();
			}
		}
		System.out.println("After Iterating");
		for(Student s : students) {
			System.out.println("name : "+s.getName());
		}
	}
	
	public static List<Student> getFailedStudents(List<Student> students, final String subject, final int passingMarks) {
		
		
		return students.stream().filter(student -> student.getSubjects().stream().anyMatch(
				sub -> sub.getName().equalsIgnoreCase(subject) && sub.getMarks() < passingMarks)).toList();
		
	}
	
	
	
}
