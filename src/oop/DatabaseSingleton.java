package oop;

import java.io.File;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.Vector;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.Vector;

import News.News;
import News.NewsController;
import News.TopicOrder;
import Researcher.Researcher;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.Vector;



public class  DatabaseSingleton implements Serializable{
	private Vector<User> users = new Vector<User>();
	private Vector<Student> students = new Vector<Student>();
	private Vector<Lesson> lessons = new Vector<Lesson>();
	private Vector<Course> course= new Vector<Course>();
	private Vector<Teacher> teacher = new Vector<Teacher>();
	private HashMap<Course,Mark> trans=new HashMap<Course,Mark>();
	private HashMap<Student,Mark> putMarking=new  HashMap<Student,Mark>();
	private Vector<ComplaintMessage> comMes= new Vector<ComplaintMessage>();
	private HashMap<TopicOrder,String> news=new HashMap<TopicOrder,String>();
	private Vector<Researcher> researchers = new Vector<Researcher>();
    private Vector<News> newsVector = new Vector<>();
    private HashMap<String, String> loginning = new HashMap<String, String>();
    
	
	
	public static DatabaseSingleton INSTANCE;
	static {
	    INSTANCE = new DatabaseSingleton();
	    try {
	        if (new File("data").exists()) {
	            INSTANCE = read();
	        } else {
	            write();
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

	public User getLoginning() {
        return DatabaseSingleton.INSTANCE.getLoginning();
}

	private DatabaseSingleton() {
		
	}
	public static DatabaseSingleton read() throws IOException, ClassNotFoundException {
		FileInputStream fis=new FileInputStream("data");
		ObjectInputStream oin = new ObjectInputStream(fis);
		return (DatabaseSingleton) oin.readObject();
	}
	public static void write() throws IOException {
		FileOutputStream fos=new FileOutputStream("data");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(INSTANCE);
		oos.close();
	}
	
	public static void initialize() {
	    if (INSTANCE == null) {
	        INSTANCE = new DatabaseSingleton();
	    }
	}
	
	
	public void addStudents(Student s) throws IOException {
		students.add(s);
		write();
	}
	public void setStudents(Vector<Student> students) {
		this.students = students;
	}
	public Vector<Student> getStudents() {
		return students;
	}
	
	
	

	
	public void addUsers(User u) throws IOException {
		users.add(u);
		write();
	}
	public void setUsers(Vector<User> users) {
		this.users = users;
	}
	public Vector<User> getUsers() {
		return users;
	}
	
	
	
	
	
	public void addLesson(Lesson l) throws IOException {
		lessons.add(l);
		write();
	}
	
	public Vector<Lesson> getLessons() {
		return lessons;
	}
	
	public void setLessons(Vector<Lesson> lessons) {
		this.lessons = lessons;
	}
	
	
	
	
	public void addCourse(Course c) throws IOException {
		course.add(c);
		write();
	}
	public Vector<Course> getCourse() {
		return course;
	}
	public void setCourse(Vector<Course> course) {
		this.course = course;
	}

	
	
	
	public void addTeacher(Teacher t) throws IOException {
		teacher.add(t);
		write();
	}
	public Vector<Teacher> getTeacher() {
		return teacher;
	}
	
	public void setTeacher(Vector<Teacher> teacher) {
		this.teacher = teacher;
	}

	
	
	
	
	public HashMap<Course,Mark> getTrans() {
		return trans;
	}
	public void setTrans(HashMap<Course,Mark> trans) {
		this.trans = trans;
	}

	
	public HashMap<Student,Mark> getPutMarking() {
		return putMarking;
	}
	public void setPutMarking(HashMap<Student,Mark> putMarking) {
		this.putMarking = putMarking;
	}
	

}
	

	
//	
//	public static DatabaseSingleton INSTANCE;
//	static {
//	    INSTANCE = new DatabaseSingleton();
//	    try {
//	        if (new File("data").exists()) {
//	            INSTANCE = read();
//	        } else {
//	            write();
//	        }
//	    } catch (Exception e) {
//	        e.printStackTrace();
//	    }
//	}
//
//	private DatabaseSingleton() {
//		
//	}
//	public static DatabaseSingleton read() throws IOException, ClassNotFoundException {
//		FileInputStream fis=new FileInputStream("data");
//		ObjectInputStream oin = new ObjectInputStream(fis);
//		return (DatabaseSingleton) oin.readObject();
//	}
//	public static void write() throws IOException {
//		FileOutputStream fos=new FileOutputStream("data");
//		ObjectOutputStream oos = new ObjectOutputStream(fos);
//		oos.writeObject(INSTANCE);
//		oos.close();
//	}
//	
//	public static void initialize() {
//	    if (INSTANCE == null) {
//	        INSTANCE = new DatabaseSingleton();
//	    }
//	}
//	
//	
//	public void addStudents(Student s) throws IOException {
//		students.add(s);
//		write();
//	}
//	
//	
//	public void setStudents(Vector<Student> students) {
//		this.students = students;
//	}
//	public Vector<Student> getStudents() {
//		return students;
//	}
//	
//	public void addResearchers(Researcher r){
//		researchers.add(r); 
//	}
//	public Vector<Researcher> getResearchers() {
//		return researchers;
//	}
//	public void setAllResearchers(Vector<Researcher> researchers) {
//		this.researchers = researchers;
//	}
//	
//	public void addNews(TopicOrder t, String news) {
//		this.news.put(t, news);
//	}
//	
//	public void addLesson(Lesson l) throws IOException {
//		lessons.add(l);
//		write();
//	}
//	
//	public Vector<Lesson> getLessons() {
//		return lessons;
//	}
//	
//	public void setLessons(Vector<Lesson> lessons) {
//		this.lessons = lessons;
//	}
//	
//	
//	public void addCourse(Course c) throws IOException {
//		course.add(c);
//		write();
//	}
//	
//	public Vector<Course> getCourse() {
//		return course;
//	}
//	public void setCourse(Vector<Course> course) {
//		this.course = course;
//	}
//	
//	
//
//	public void addTeacher(Teacher t) throws IOException {
//		teacher.add(t);
//		write();
//	}
//	
//	public Vector<Teacher> getTeacher() {
//		return teacher;
//	}
//	
//	
//	public void setTeacher(Vector<Teacher> teacher) {
//		this.teacher = teacher;
//	}
//	
//	
//	
//
//}
	
//
//public class  DatabaseSingleton implements Serializable{
//	Vector<User> users = new Vector<User>();
//	Vector<Student> students = new Vector<Student>();
//	Vector<Lesson> lessons = new Vector<Lesson>(); 
//	Vector<Course> course= new Vector<Course>();
//	Vector<Mark> mark = new Vector<Mark>();
//	
//	public static DatabaseSingleton INSTANCE;
//	static {
//		if(new File("data").exists()) {
//			try {
//				INSTANCE=read();
//			}
//			catch(Exception e) {
//				e.printStackTrace();
//			}
//		}
//		else INSTANCE = new DatabaseSingleton();
//	}
//	private DatabaseSingleton() {
//		
//	}
//	public static DatabaseSingleton read() throws IOException, ClassNotFoundException {
//		FileInputStream fis=new FileInputStream("data");
//		ObjectInputStream oin = new ObjectInputStream(fis);
//		return (DatabaseSingleton) oin.readObject();
//	}
//	public static void write() throws IOException {
//		FileOutputStream fos=new FileOutputStream("data");
//		ObjectOutputStream oos = new ObjectOutputStream(fos);
//		oos.writeObject(INSTANCE);
//		oos.close();
//	}
//}
//	