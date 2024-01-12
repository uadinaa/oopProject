package oop;

//import java.io.Serializable;
//import java.util.Date;
//import java.util.Vector;
//
//import News.News;
//
//public class Admin extends Employee implements Serializable{
//	public Admin() {}
//	DatabaseSingleton single = DatabaseSingleton.getDatabase();
//	
//	
//	public Admin(String name, int id, String password, String email, double salary, Date vacationDate, int experience) {
//		super(name, id, password, email, salary, vacationDate, experience);
//	}
//	public void addUser(User user) {
//		single.addUsers(user);}
//	
//	public void addMessages(Messages mes) {
//		single.addMess(mes);}
//	
//	public void addNews(News news) {
//		single.addNews(news); }
//	
//	
//	
//	public Vector<User> showInfoUser(){
//		return single.showUsers();
//	}
//	
//	public  Vector<Messages> showInfoMess(){
//		return single.showMess();
//	}
//	public Vector<News> showNewNews(){
//		return single.showNews();
//	}
//	public void removeUserAcc(User userAcc) {
//		if(single.showUsers().contains(userAcc)) {
//			single.showUsers().remove(userAcc);
//			System.out.println(userAcc.getName()+ " account deleted");
//		}
//		else {
//		System.out.println("account has not been created");
//	}
//	
//}
//}


import java.io.IOException;

import java.util.Collection;
import java.util.List;
import java.util.Scanner;


import java.io.IOException;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

import News.News;
import News.TopicOrder;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;


public class Admin extends Employee implements Serializable {
	BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));
	
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
	
	public void addStudent(Student st) throws IOException {
	        System.out.println("Enter name: ");
	        st.setName(reader.readLine());
	        System.out.println("Enter surname: ");
	        st.setSurname(reader.readLine());
	        System.out.println("Enter year of study: ");
	        st.setYearOfStudy(Integer.parseInt(reader.readLine())); 
	        st.setOrganization(StudentOrganizations.OSIT);
	        st.setStud_status(StudentStatus.GRANT); 
	        DatabaseSingleton.INSTANCE.addStudents(st);
	        System.out.println("Student added! ");
	        DatabaseSingleton.write();
	}
	public void addTeacher(Teacher t) throws IOException {
	       System.out.println("Enter name: ");
	       t.setName(reader.readLine());
	       System.out.println("Enter surname: ");
	       t.setSurname(reader.readLine());
	       DatabaseSingleton.INSTANCE.addTeacher(t);
	       System.out.println("Teacher added! ");
	       DatabaseSingleton.write();
	       
	}

	public void addLesson(Lesson les) throws IOException{
		 System.out.println("Enter name of the course: ");
		 Course c= new Course();
		 c.setName(reader.readLine());
		 les.setCourse(c);
		 DatabaseSingleton.INSTANCE.getLessons().add(les);
	     System.out.println("Lesson added! ");
	     DatabaseSingleton.write();
	}

	
	public void addLessonToTeacher(Teacher t) throws NumberFormatException, IOException {
		if (t.getLesson() == null) {
	        t.setLesson(new Vector<>()); 
	    }
		
		int i = Integer.parseInt(reader.readLine()) - 1;
		Lesson les= DatabaseSingleton.INSTANCE.getLessons().get(i);
			if(!t.getLesson().contains(les)) {
				t.getLesson().add(les);
				System.out.println("Lesson "+ DatabaseSingleton.INSTANCE.getLessons().get(i)+" added to "+ t.getName());
			}
		else {
			System.out.println("this teacher already registered to this lesson");
		}
	}
	
	public void putMarks() throws IOException {
	    try {
	        System.out.println("Choose a teacher to put marks: ");
	        if (!showTeachers()) return;

	        int teacherIndex = Integer.parseInt(reader.readLine()) - 1;
	        Teacher selectedTeacher = DatabaseSingleton.INSTANCE.getTeacher().get(teacherIndex);

	        List<Lesson> lessons = selectedTeacher.getLesson();
	        if (lessons.isEmpty()) {
	            System.out.println("This teacher has no lessons. Returning to the main menu.");
	            return;
	        }
	        System.out.println("Students enrolled with this teacher: ");
	        List<Student> enrolledStudents = new ArrayList<>();
	        for (Student student : DatabaseSingleton.INSTANCE.getStudents()) {
	            for (Lesson lesson : lessons) {
	                if (student.getTranscript().containsKey(lesson.getCourse())) {
	                    enrolledStudents.add(student);
	                    System.out.println("- " + student.getName() + " " + student.getSurname());
	                    break; 
	                }
	            }
	        }

	        if (enrolledStudents.isEmpty()) {
	            System.out.println("No students enrolled with this teacher.");
	            return;
	        }

	        System.out.println("Choose a student to put mark: ");
	        for (int i = 0; i < enrolledStudents.size(); i++) {
	            Student student = enrolledStudents.get(i);
	            System.out.println(i + 1 + ") " + student.getName() + " " + student.getSurname());
	        }

	        int studentIndex = Integer.parseInt(reader.readLine()) - 1;
	        Student selectedStudent = enrolledStudents.get(studentIndex);

	        System.out.println("Enter the mark for " + selectedStudent.getName() + " " + selectedStudent.getSurname() + ": ");
	        double markValue = Double.parseDouble(reader.readLine());

	        selectedStudent.getTranscript().get(lessons.get(0).getCourse()).setAtt1(markValue); // Assuming the first lesson if there are multiple
	        DatabaseSingleton.write();
	        System.out.println("Mark added successfully!");
	        } catch (Exception e) {
	        System.out.println("Error occurred while putting marks.");
	        e.printStackTrace();
	    }
	}
	
	
	public void addLessonToStudent(Student st) throws NumberFormatException, IOException {
		int i = Integer.parseInt(reader.readLine()) - 1;
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
				System.out.println("What do you want to do?\n 1) Add student \n 2)Add teacher \n 3) Add course  \n 4) Add course to a Teacher  5) Add course to a Student\n 6) View students \n 7) View teachers \n 8) View lessons \n 9) Exit");
				int choice = Integer.parseInt(reader.readLine());
				if(choice==1){
					addStudent: while(true){
						addStudent(new Student());
						System.out.println("\n 1) Add another student  \n 2) Return back \n 3) Exit");
						choice =Integer.parseInt(reader.readLine());
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
						choice = Integer.parseInt(reader.readLine());
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
						choice = Integer.parseInt(reader.readLine());
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
						Teacher teach = DatabaseSingleton.INSTANCE.getTeacher().get(Integer.parseInt(reader.readLine()) - 1);
						System.out.println("Choose course: (Enter number)");
						if(!showLessons()) continue menu;
						addLessonToTeacher(teach);
						System.out.println("\n 1) Add another course to some teacher  \n 2) Return back \n 3) Exit");
						choice = Integer.parseInt(reader.readLine());
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
						Student stud = DatabaseSingleton.INSTANCE.getStudents().get(Integer.parseInt(reader.readLine()) - 1);
						System.out.println("Choose lesson with teacher: (Enter number)");
						if(!showLessons()) continue menu;
						addLessonToStudent(stud);
						System.out.println("\n 1) Add another course to some student  \n 2) Return back \n 3) Exit");
						choice = Integer.parseInt(reader.readLine());
						if(choice==1) continue addLessonToStudent;
						if(choice==2) continue menu;
						if(choice==3) {exit(); break menu;}
						break;
					}
				}
						
				else if (choice==6){
					if(!showStudent()) continue menu;
					System.out.println("\n 1) Return back \n 2) Exit");
					choice = Integer.parseInt(reader.readLine());
					if(choice==1) continue menu;
					if(choice==2) {exit();  break menu;}
					break;
				}
				
				else if (choice==7){
					TeacherView t=new TeacherView();
					t.runTeacherView();
				}
				else if (choice==8){
					if(!showLessons()) continue menu;
					System.out.println("\n 1) Return back \n 2) Exit");
					choice = Integer.parseInt(reader.readLine());
					if(choice==1) continue menu;
					if(choice==2) {exit();  break menu;}
					break;
				}
			
				else if (choice==10){
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

	
		