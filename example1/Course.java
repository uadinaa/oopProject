package example1;

import java.io.Serializable;
import java.util.Objects;
import java.util.Vector;

import enums.KbtuSchools;

public class Course implements Serializable {
	private String name;
	private int credits;
	private KbtuSchools school;

	public Course() {
	}

	public Course(String name,int credits,KbtuSchools school) {
		this.name=name;
		this.credits=credits;
		this.school=school;
	} 
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public int getCredits() {
		return credits;
	}
	public void setCredits(int credits) {
		this.credits = credits;
	}
	
	public KbtuSchools getSchool() {
		return school;
	}
	public void setSchool(KbtuSchools school) {
		this.school = school;
	}
	@Override
	public int hashCode() {
		return Objects.hash(credits, name, school);
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		return credits == other.credits && Objects.equals(name, other.name) && school == other.school;
	}
	
	
	public String toString() {
		return "Course name=" + name + ", credits=" + credits + ", school=" + school;
	}
	
}
