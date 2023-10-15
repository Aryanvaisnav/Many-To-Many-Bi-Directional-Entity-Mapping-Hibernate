package com.jsp.student.course;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveStudentCourseManyToManyBi {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("aryan");
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Student s1 = new Student();
		s1.setName("ABC");
		s1.setEmail("abc@gmail.com");
		
		Student s2 = new Student();
		s2.setName("XYZ");
		s2.setEmail("xyz@gmail.com");

		Student s3 = new Student();
		s3.setName("PQR");
		s3.setEmail("pqr@gmail.com");
		
		
		List<Student> students = new ArrayList<>();
		students.add(s3);
		students.add(s2);
		students.add(s1);
		
		Course c1 = new Course();
		c1.setName("Web-Tech");
		c1.setDuration(2);
		
		Course c2 = new Course();
		c2.setName("SQL");
		c2.setDuration(2);
		
		Course c3 = new Course();
		c3.setName("Java");
		c3.setDuration(3);
		
		List<Course> courses = new ArrayList<>();
		courses.add(c3);
		courses.add(c2);
		courses.add(c1);
		
		s1.setCourses(courses);
		s2.setCourses(courses);
		s3.setCourses(courses);
		
		c1.setStudents(students);
		c2.setStudents(students);
		c3.setStudents(students);
		
		entityTransaction.begin();
		entityManager.persist(s1);
		entityManager.persist(s2);
		entityManager.persist(s3);
		entityTransaction.commit();
		
		
		
		
		
		


	}

}
