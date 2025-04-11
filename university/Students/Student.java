package university.Students;

import java.util.ArrayList;
import java.util.List;

import university.Courses.Course;

public class Student {

	private String name;
	private String id;
	private List<Course>enrollCourse;

	public Student(String name, String id) {
	
		this.name = name;
		this.id = id;
		this.enrollCourse =new ArrayList<>();
	}
	
	
	public void enrollCourse(Course course) {
		
		enrollCourse.add(course);
		
	}
	public void display() {
		
		System.out.println("StudentName "+name);
		System.out.println("StudentId "+id);
		for(Course c : enrollCourse){
			c.display();
		}
		
		
		
		
	}
	
	
}
