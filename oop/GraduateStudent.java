package oop;

public class GraduateStudent {
	public GraduateStudentsType typeDegree;
	public DiplomaProject diplomaProject;
	
	public GraduateStudent() {}
	
	public GraduateStudent(String name, String surname, int id, String password, String email,int yearOfStudy,  Schools school, double gpa,Mark marks, DiplomaProject diplomWork, HashMap<Course,Mark> gradeList, StudentOrganizations organization, int stipend, StudentStatus studentStatus, GraduateStudentsType typeDegree, DiplomaProject diplomaProject ) {
		super(name,surname,id,password,email,yearOfStudy,school,gpa, marks,diplomWork,gradeList, organization,stipend, studentStatus);
		this.typeDegree = typeDegree;
		this.diplomaProject = diplomaProject;
	}
	
	public Boolean canHaveSupervisor() {
		return true;
	}
	
	public String toString() {
		return super.toString() + " "+ typeDegree + " " + diplomaProject;
	}
	
	
	
}
