package oop;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;


public class TeacherView implements Serializable {
	
	private Vector<ComplaintMessage> teachComp=new Vector<ComplaintMessage>();
	
	BufferedReader text =  new BufferedReader(new InputStreamReader(System.in));
	
	private void printList(List list) {
		for(int i=0; i<list.size();i++) {
			System.out.println(i+1+ ")"+list.get(i));
		}
	}	
	public boolean showTeachers() {
		if(DatabaseSingleton.INSTANCE.getTeacher().isEmpty()) {
			System.out.println("no teacher yet..Try adding one");
			return false;
		}
		printList(DatabaseSingleton.INSTANCE.getTeacher());
		return true;
	}
	
	
	private void putMarks() throws IOException {
	    try {
	        System.out.println("Who are you from the teachers ");
	        if (!showTeachers()) return;
	        int in = Integer.parseInt(text.readLine()) - 1;
	        Teacher selectedTeacher = DatabaseSingleton.INSTANCE.getTeacher().get(in);
	        List<Lesson> lessons = selectedTeacher.getLesson();

	        if (lessons.isEmpty()) {
	            System.out.println("teacher lesson not added");
	            return;
	        }
	        System.out.println(selectedTeacher.getName()+ " students: ");
	        List<Student> teachersStud = new ArrayList<>();
	        for (Student student : DatabaseSingleton.INSTANCE.getStudents()) {
	            for (Lesson lesson : lessons) {
	                if (student.getTranscript().containsKey(lesson.getCourse())) {
	                	teachersStud.add(student);
	                    System.out.println(student.getName() + " " + student.getSurname());
	                    break;
	                }
	            }
	        }
	        if (teachersStud.isEmpty()) {
	            System.out.println("There don't seem to be any students... ");
	            return;
	        }
	        System.out.println("Which student will we put a mark ?: ");
	        for (int i = 0; i < teachersStud.size(); i++) {
	            Student student = teachersStud.get(i);
	            System.out.println(i + 1 + ") " + student.getName() + " " + student.getSurname());
	        }

	        int stIndx = Integer.parseInt(text.readLine()) - 1;
	        Student selectedSt = teachersStud.get(stIndx);
	        System.out.println("Put mark for " + selectedSt.getName() + " " + selectedSt.getSurname() + ": ");
	        System.out.println("att1,att2,final");
	        
	        double markVal1 = Double.parseDouble(text.readLine());
	        double markVal2 = Double.parseDouble(text.readLine());
	        double markValF = Double.parseDouble(text.readLine());
	        selectedSt.getTranscript().get(lessons.get(0).getCourse()).setAtt1(markVal1); 
	        selectedSt.getTranscript().get(lessons.get(0).getCourse()).setAtt2(markVal2); 
	        selectedSt.getTranscript().get(lessons.get(0).getCourse()).setFinalScore(markValF);
	        DatabaseSingleton.write();
	        System.out.println("Mark putted successfully");
	        if(selectedSt.getTranscript().get(lessons.get(0).getCourse()).getAtt1()+selectedSt.getTranscript().get(lessons.get(0).getCourse()).getAtt2()<=29.5 || selectedSt.getTranscript().get(lessons.get(0).getCourse()).getFinalScore()<10 ) {
	        	System.out.println(selectedSt.getName()+" retake!");
	        }
	        }
	    
	    catch (Exception e) {
	        System.out.println("An error has occurred!");
	        e.printStackTrace();
	    }
	}
	
	public void ComplaintMessage() throws NumberFormatException, IOException {
		 BufferedReader text1 = new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("choose your name");
	        if (!DatabaseSingleton.INSTANCE.getTeacher().isEmpty()) {
	            showTeachers();
	            int indx = Integer.parseInt(text1.readLine()) - 1;
	            Teacher teacherComp = DatabaseSingleton.INSTANCE.getTeacher().get(indx);
	            List<Lesson> lessons = teacherComp.getLesson();
	            System.out.println("Students enrolled with this teacher: ");
	            List<Student> teacherStuds = new ArrayList<>();
	            for (Student s : DatabaseSingleton.INSTANCE.getStudents()) {
	                for (Lesson lesson : lessons) {
	                    if (s.getTranscript().containsKey(lesson.getCourse())) {
	                    	teacherStuds.add(s);
	                        System.out.println( s.getName()+" " +s.getSurname());
	                        break;
	                    }
	                }
	            }

	            if (!teacherStuds.isEmpty()) {
	                System.out.println("Which student made you angry?: ");
	                for (int i = 0; i < teacherStuds.size(); i++) {
	                    Student student = teacherStuds.get(i);
	                    System.out.println(i + 1 + ") " + student.getName() + " " + student.getSurname());
	                }
	                int inx = Integer.parseInt(text1.readLine()) - 1;
	                Student cryStud = teacherStuds.get(inx);

	                ComplaintMessage complaint = new ComplaintMessage();
	                complaint.setFromWhom(teacherComp);
	                complaint.setToWhom(cryStud);

	                System.out.println("Write why and how you wanted to complain: ");
	                String mainText = text1.readLine();
	                complaint.setMainText(mainText);
	                complaint.setComplaintLevel(ComplaintLevels.HIGH);
	                teachComp.add(complaint);
	            } else {
	                System.out.println("No students enrolled with this teacher.");
	            }
	        } else {
	            System.out.println("No teachers available.");
	        }
	    }
	
	
	

	
	public void runTeacherView() throws IOException{
		System.out.println("Welcome to Teacher view!");
		menu : while(true){
		System.out.println("What do you want to do?\n 1) List of teachers and courses  \n 2)Send complain");
		int choice = Integer.parseInt(text.readLine());
		if (choice==1){
			if(!showTeachers()) continue menu;
			
			System.out.println("\n 1) Put marks \n 2) Return back  \n 3) exit" );
	        int choice1 = Integer.parseInt(text.readLine());
	        if (choice1 == 1) {
	        	putMarks();
	        	System.out.println(" 1) add mark to another student \n 2) Return back");
	        	int marks = Integer.parseInt(text.readLine());
	        	if(marks==1) continue menu;
	        	};
			if(choice1==2) continue menu;
			break;
		}
		else if(choice==2) {
			ComplaintMessage();
			
		}
	}
		
	
	}
}
