package package1;

import java.io.IOException;
import java.io.Serializable;
import java.sql.Date;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

import enums.StudentOrganizations;
import enums.StudentStatus;
import enums.TypeLesson;
import example1.Course;
import example1.Lesson;
import example1.Mark;
import users.Student;
import users.Teacher;
import users.User;


public class Admin implements Serializable {
	Scanner in= new Scanner(System.in);
	private void printList(List list) {
		for(int i=0; i<list.size();i++) {
			System.out.println(i+1+ ")"+list.get(i));
		}
	}
	public boolean showStudent() {
		if(DatabaseSingleton.INSTANCE.getStudents().isEmpty()) {
			System.out.println("no students yet..Try adding one");
			return false;
		}
		printList(DatabaseSingleton.INSTANCE.getStudents());
		return true;
	}
	
	public boolean showTeachers() {
		if(DatabaseSingleton.INSTANCE.getTeacher().isEmpty()) {
			System.out.println("no teacher yet..Try adding one");
			return false;
		}
		printList(DatabaseSingleton.INSTANCE.getTeacher());
		return true;
	}
	
	
	public boolean showLessons() {
		if(DatabaseSingleton.INSTANCE.getLessons().isEmpty()){
			System.out.println("no courses yet..Try adding one");
			return false;
		}
		printList(DatabaseSingleton.INSTANCE.getLessons());
		return true;
	}
	
	private void save() throws IOException {
		DatabaseSingleton.write();
	}
	
	private void exit() {
		System.out.println("POKA!");
		try {
			save();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	private void addStudent(Student st) throws IOException {
		   Scanner in = new Scanner(System.in);
	        System.out.println("Enter name: ");
	        st.setName(in.nextLine());
	        System.out.println("Enter surname: ");
	        st.setSurname(in.nextLine());
	        System.out.println("Enter year of study: ");
//	        st.setId(in.nextInt());
	        st.setYearOfStudy(in.nextInt()); // Пример установки значения по умолчанию, замените на логику ввода.
	        st.setGpa(in.nextDouble()); // Пример установки значения по умолчанию, замените на логику ввода.
	        st.setOrganization(StudentOrganizations.OSIT); // Пример установки значения по умолчанию, замените на логику ввода.
	        st.setStud_status(StudentStatus.GRANT); // Пример установки значения по умолчанию, замените на логику ввода.
	        DatabaseSingleton.INSTANCE.addStudents(st);
	        System.out.println("Student added! ");
	        DatabaseSingleton.write();
	}
	private void addTeacher(Teacher t) throws IOException {
		   Scanner in = new Scanner(System.in);
	       System.out.println("Enter name: ");
	       t.setName(in.nextLine());
	       System.out.println("Enter surname: ");
	       t.setSurname(in.nextLine());
	       DatabaseSingleton.INSTANCE.addTeacher(t);
	       System.out.println("Teacher added! ");
	       DatabaseSingleton.write();
	       
	}

	private void addLesson(Lesson les) throws IOException{
		 Scanner in = new Scanner(System.in);
		 System.out.println("Enter name of the course: ");
		 Course c= new Course();
		 c.setName(in.next());
		 les.setCourse(c);
		 DatabaseSingleton.INSTANCE.getLessons().add(les);
	     System.out.println("Lesson added! ");
	     DatabaseSingleton.write();
	}
	
	private void addLessonToTeacher(Teacher t) {
		if (t.getLesson() == null) {
	        t.setLesson(new Vector<>()); 
	    }
		
		int i = in.nextInt()-1;
		Lesson les= DatabaseSingleton.INSTANCE.getLessons().get(i);
			if(!t.getLesson().contains(les)) {
				t.getLesson().add(les);
				System.out.println("Lesson "+ DatabaseSingleton.INSTANCE.getLessons().get(i)+" added to "+ t.getName());
			}
		else {
			System.out.println("this teacher already registered to this lesson");
		}
	}
	
	
	private void addLessonToStudent(Student st) {
		int i = in.nextInt()-1;
		Lesson les= DatabaseSingleton.INSTANCE.getLessons().get(i);
			if(!st.getTranscript().containsKey(les.getCourse())) {
				st.getTranscript().put(les.getCourse(), new Mark());
				System.out.println("Lesson "+ DatabaseSingleton.INSTANCE.getLessons().get(i)+" added to "+ st.getName());
			}
		else {
			System.out.println("this student already registered to this lesson");
		}
	}
	
	
	

	
	public void run() throws IOException {
		try {
			System.out.println("Welcome!");
			menu : while(true){
				System.out.println("What do you want to do?\n 1) Add student \n 2)Add teacher \n 3) Add course  \n 4) Add course to a Teacher  5) Add course to a Student\n 6) View students \n 7) View teachers \n 8) View lessons 9) Exit");
				int choice = in.nextInt();
				if(choice==1){
					addStudent: while(true){
						addStudent(new Student());
						System.out.println("\n 1) Add another student  \n 2) Return back \n 3) Exit");
						choice = in.nextInt();
						if(choice==1) continue addStudent;
						if(choice==2) continue menu;
						if(choice==3) {exit(); break menu;}
						break;
					}
				}
				else if(choice==2){
					addTeacher: while(true){
						addTeacher(new Teacher());
						System.out.println("\n 1) Add another teacher  \n 2) Return back \n 3) Exit");
						choice = in.nextInt();
						if(choice==1) continue addTeacher;
						if(choice==2) continue menu;
						if(choice==3) {exit(); break menu;}
						break;
					}
				}
				
				else if (choice==3){
					addLesson: while(true){
						addLesson(new Lesson());
						System.out.println("\n 1) Add another course  \n 2) Return back \n 3) Exit");
						choice = in.nextInt();
						if(choice==1) continue addLesson;
						if(choice==2) continue menu;
						if(choice==3) {exit();  break menu;}
						break;
					}
				}
				else if (choice==4){
					addLessonToTeacher: while(true){
						System.out.println("Choose teacher to which you want to add course: (Enter number)");
						if(!showTeachers()) continue menu;
						Teacher teach = DatabaseSingleton.INSTANCE.getTeacher().get(in.nextInt()-1);
						System.out.println("Choose course: (Enter number)");
						if(!showLessons()) continue menu;
						addLessonToTeacher(teach);
						System.out.println("\n 1) Add another course to some teacher  \n 2) Return back \n 3) Exit");
						choice = in.nextInt();
						if(choice==1) continue addLessonToTeacher;
						if(choice==2) continue menu;
						if(choice==3) {exit(); break menu;}
						break;
					}
				}
				
				
				else if (choice==5){
					addLessonToStudent: while(true){
						System.out.println("Choose student to which you want to add course: (Enter number)");
						if(!showStudent()) continue menu;
						Student stud = DatabaseSingleton.INSTANCE.getStudents().get(in.nextInt()-1);
						System.out.println("Choose lesson with teacher: (Enter number)");
						if(!showLessons()) continue menu;
						addLessonToStudent(stud);
						System.out.println("\n 1) Add another course to some student  \n 2) Return back \n 3) Exit");
						choice = in.nextInt();
						if(choice==1) continue addLessonToStudent;
						if(choice==2) continue menu;
						if(choice==3) {exit(); break menu;}
						break;
					}
				}
				
				
				
				
				
				else if (choice==6){
					if(!showStudent()) continue menu;
					System.out.println("\n 1) Return back \n 2) Exit");
					choice = in.nextInt();
					if(choice==1) continue menu;
					if(choice==2) {exit();  break menu;}
					break;
				}
				
				else if (choice==7){
					if(!showTeachers()) continue menu;
					System.out.println("\n 1) Return back \n 2) Exit");
					choice = in.nextInt();
					if(choice==1) continue menu;
					if(choice==2) {exit();  break menu;}
					break;
				}
				else if (choice==8){
					if(!showLessons()) continue menu;
					System.out.println("\n 1) Return back \n 2) Exit");
					choice = in.nextInt();
					if(choice==1) continue menu;
					if(choice==2) {exit();  break menu;}
					break;
				}
			
				
				
				else if (choice==9){
					System.out.println(DatabaseSingleton.INSTANCE.getTeacher());
					exit();
					break menu;
				}
			}
		} catch (Exception e) {
			System.out.println("Something bad happened... \n Saving resources...");
			e.printStackTrace();
			save();
		}
	}


}

	
