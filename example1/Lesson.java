package example1;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import enums.TypeLesson;
import users.Student;

public class Lesson implements Serializable{
	private Course course;
	private TypeLesson typeLess; 
	private Date time;
	private int room;
	private  HashMap<Student, Mark> journal;
	
	
	
	public Lesson() {}
	
	public Lesson(Course course,TypeLesson typeLess,Date time,int room) {
		this.course=course;
		this.typeLess=typeLess;
		this.journal = new HashMap<>();
		this.time=time;
		this.room=room;
	}

	

	public void setJournal(Student student, Mark mark) {
		journal.put(student, mark);
		student.setTranscript(course, mark);
	}
	
	public HashMap<Student, Mark> getJournal() {
        return journal;
    }
	public Course getCourse() {
		return course;
	}
	
	public void setCourse(Course course) {
		this.course = course;
	}
	
	public TypeLesson getTypeLess() {
		return typeLess;
	}
	public void setTypeLess(TypeLesson typeLess) {
		this.typeLess = typeLess;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public int getRoom() {
		return room;
	}

	public void setRoom(int room) {
		this.room = room;
	}

	@Override
	public String toString() {
		return "Lesson [course=" + course.getName() + ", typeLess=" + typeLess + ", time=" + time + ", room=" + room;
	}
	
	public String showSchedule() {
		return typeLess+ ",  "+course.getName()+", "+time+" "+room;
	}

	
	
	

}
