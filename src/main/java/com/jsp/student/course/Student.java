package com.jsp.student.course;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String email;
	
	@ManyToMany (mappedBy = "students", cascade = CascadeType.ALL)
	private List<Course> courses;

	// Id
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	// Name
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// Email
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	// Course
	
	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	
	

}
