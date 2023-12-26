package example1;

import java.util.Date;
import java.util.HashMap;
import java.util.Vector;

import enums.KbtuSchools;
import enums.StudentOrganizations;
import enums.StudentStatus;
import enums.TypeLesson;
import enums.TypeOfTeacher;
import package1.ComplaintLevels;
import users.Student;
import users.Teacher;

public class Tester {
	public static void main(String[] args) {
		Teacher t1 = new Teacher("Assylzhan", 12, 5000, new Date(),5, TypeOfTeacher.TUTOR, ComplaintLevels.LOW);
		
		Student s1= new Student("Alibek", 2, 2, 3.5, new HashMap<>(), StudentOrganizations.OSIT, StudentStatus.GRANT);
		Student s2= new Student("Firuza", 2, 2, 3.5, new HashMap<>(), StudentOrganizations.OSIT, StudentStatus.GRANT);
		Student s3= new Student("Damir", 2, 2, 3.5, new HashMap<>(), StudentOrganizations.OSIT, StudentStatus.GRANT);
		Student s4= new Student("Dina", 2, 2, 3.5, new HashMap<>(), StudentOrganizations.OSIT, StudentStatus.GRANT);
		
		Course c1= new Course("OOP",4, KbtuSchools.SITE);
		Course c2= new Course("Algo",3, KbtuSchools.SITE);
		
		Mark markS1= new Mark(56);
		Mark markS2= new Mark(80);
		Mark markS3= new Mark(53);
		Mark markS4= new Mark(96);
//		Mark markAlgo= new Mark(75);
		
		Lesson lesson1= new Lesson(c1, TypeLesson.LECTURE, new Date(), 0);
		Lesson lesson2= new Lesson(c2, TypeLesson.LECTURE, new Date(), 0);
		t1.setLesson(lesson1);
	
		//тичерга сол сабакты бергенский
//		Lesson lesson2= new Lesson(c2, TypeLesson.LECTURE);
		
		t1.setLesson(lesson1.setJournal(s4, markS4));
		lesson1.setJournal(s2, markS2);
		lesson1.setJournal(s3, markS3);
		lesson1.setJournal(s4, markS4);
		t1.getLesson().
	
		
//		lesson2.addJournal(s1, markAlgo);
		
		//транскрипт студента
		System.out.println(s1.getTranscript());
		System.out.println(s2.getTranscript());
		System.out.println(s3.getTranscript()+"\n");
		
		//одна голова хорошо, две лучше
		//но тут я не поняла зачем гпт решил мне именно так помочь ахаха поэтому жду от вас хинт
	
		HashMap<Student, Mark> studentGrades = t1.viewStudentGrades();
        for (Student student : studentGrades.keySet()) {
            Mark mark = studentGrades.get(student);
            System.out.println(lesson1.getCourse().getName()+" Student " + student.getName() + ": " + mark.getValue());
        }
	
			
    }
	}
	
		
