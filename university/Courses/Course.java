package university.Courses;

public class Course {

	private String courseName;
	private String courseCode;
	public String getCourseName() {
		return courseName;
	}
	public String getCourseCode() {
		return courseCode;
	}
	public Course(String courseName, String courseCode) {
	
		this.courseName = courseName;
		this.courseCode = courseCode;
	}

	 public void display() {
		 
		 
		 System.out.println("CourseName "+courseName);
		 System.out.println("CourseCode "+courseCode);
	 }
	
	
}
