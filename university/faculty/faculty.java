package university.faculty;

import java.util.ArrayList;
import java.util.List;

import university.Courses.Course;

public class faculty {
	
	private String name;
	private String department;
	private List<Course>enrollCourse;
	public faculty(String name, String department) {
		this.name = name;
		this.department = department;
		enrollCourse=new ArrayList<>();
	}
	
public void enrollCourse(Course course) {
		
		enrollCourse.add(course);
		
	}
	
	
	public void diplay() {
		
		System.out.println("FacultyName "+name);
		System.out.println("DepartmentName "+department);
		
		for(Course c : enrollCourse) {
			
			
			c.display();
		}
	}
	
	

}
