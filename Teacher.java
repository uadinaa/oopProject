package oop;

import java.util.Date;
import java.util.Vector;

public class Teacher extends Employee {
	
	    private Vector<Course> courses;
	    private TypeOfTeacher teacherType;
	    private ComplaintLevels level;

	    
	    public Teacher(Vector<Course> courses, TypeOfTeacher teacherType, ComplaintLevels level) {
	        this.courses = courses;
	        this.teacherType = teacherType;
	        this.level = level;
	    }
	    
	    public Teacher(String name, String surname, int id, String password, String email,int salary, Date vacationDate, int experience, Vector<Course> courses, TypeOfTeacher teacherType, ComplaintLevels level) {
	    	super(name,surname,id,password,email, salary,vacationDate, experience);
	    	this.courses = courses;
	        this.teacherType = teacherType;
	        this.level = level;
	    }
	   
	    
	    public Vector<Course> getCourses() {
			return courses;
		}

		public void setCourses(Vector<Course> courses) {
			this.courses = courses;
		}

		public TypeOfTeacher getTeacherType() {
			return teacherType;
		}

		public ComplaintLevels getLevel() {
			return level;
		}

		public void viewMarks() {
	        // Implementation of the viewMarks method goes here
	    }

	    
	    public void putMarks(HashMap<Course, Mark> marks) {
	        // Implementation of the putMarks method goes here
	    }

	    
	    public String sendComp(ComplaintLevels level) {
	        // Implementation of the sendComp method goes here
	        return "Complaint sent with level: " + level;
	    }

	    
	    public void manageCourse() {
	        // Implementation of the manageCourse method goes here
	    }

	    
	    public void getInfoAbStudent(Student student) {
	        // Implementation of the getInfoAbStudent method goes here
	    }

}
