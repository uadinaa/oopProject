package oop;

public class Bachelor extends Student {
	public Bachelor() {}
	
	public Bachelor(String name, String surname, int id, String password, String email,int yearOfStudy,  Schools school, double gpa,Mark marks, DiplomaProject diplomWork, HashMap<Course,Mark> gradeList, StudentOrganizations organization, int stipend, StudentStatus studentStatus) {
		super(name,surname,id,password,email,yearOfStudy,school,gpa, marks,diplomWork,gradeList, organization,stipend, studentStatus);
	}

	
	public String toString() {
		return super.toString();
	}
	
	

}
