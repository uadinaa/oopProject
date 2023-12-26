package users;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Vector;

import enums.TypeOfTeacher;
import example1.Lesson;
import example1.Mark;
import package1.ComplaintLevels;

public class Teacher extends Employee implements Serializable{
	private TypeOfTeacher teacherType;
	private ComplaintLevels level; 
	private Vector<Lesson> lesson;
	public Teacher() {}
	
	public Teacher(String name,String surname,int salary, Date vacationDate, int experience, TypeOfTeacher teacherType, ComplaintLevels level) {
		super(name,surname,salary,vacationDate, experience);
		this.teacherType = teacherType;
		this.level = level;
		this.lesson=new Vector<>();
	}
	public TypeOfTeacher getTeacherType() {
		return teacherType;
	}

	public void setTeacherType(TypeOfTeacher teacherType) {
		this.teacherType = teacherType;
	}

	public ComplaintLevels getLevel() {
		return level;
	}

	public void setLevel(ComplaintLevels level) {
		this.level = level;
	}

	public Vector<Lesson> getLesson() {
		return lesson;
	}
	
	public void setLesson(Vector<Lesson> lesson) {
		this.lesson = lesson;
	}

	public HashMap<Student, Mark> viewStudentGrades() {//вюшка для тичера
        HashMap<Student, Mark> studentGrades = new HashMap<>();
        if (getLesson() != null) {
            for (Lesson l : getLesson()) {
                studentGrades.putAll(l.getJournal());
            }
        }
        return studentGrades;
    }
	public String toString() {
		return super.getName()+" "+super.getSurname()+getLesson();
	}
}
