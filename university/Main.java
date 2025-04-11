package university;

import university.Courses.Course;
import university.Students.Student;
import university.faculty.faculty;

public class Main {
	
	
	public static void main(String...arg) {
		
		
	
		Course c1 = new Course("MPMC", "EC012");
		Course c2 = new Course("Data Structures", "CS201");
		Course c3 = new Course("Digital Electronics", "EC101");
		Course c4 = new Course("Operating Systems", "CS301");
		Course c5 = new Course("Signals and Systems", "EC202");

		
		Student bala = new Student("Bala","003");
		  bala.enrollCourse(c1);
		  bala.enrollCourse(c5);
		
		faculty arun = new faculty ("ARUN","CSE");
		arun.enrollCourse(c3);
		System.out.println("Student details");
		System.out.println("----------------------------------------------------------------");
		bala.display();
		System.out.println("Faculty Details");
		System.out.println("----------------------------------------------------------------");
		arun.diplay();
		
		
		
	}

}
