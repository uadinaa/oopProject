package testingFinalProject;
import java.io.File;


import java.io.IOException;
import java.util.*;
import java.io.*;
import java.io.UnsupportedEncodingException;

import News.News;
import News.NewsController;
import News.TopicOrder;
import Researcher.ResearchPaper;
import Researcher.Researcher;
import oop.DatabaseSingleton;
import oop.HRDepartment;
import oop.Lesson;
import oop.Mark;
import oop.OR;
import oop.Student;
import oop.StudentOrganizations;
import oop.StudentStatus;
import oop.Teacher;
import oop.TeacherView;
import oop.TechSupport;
import oop.User;
import oop.Accountant;
import oop.Admin;
import oop.Course;


//public class MainAndFinalTester {
//
//    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out), true);
//
//    private static ResourceBundle messages;
//    private Locale userLocale;
//
//    NewsController newsController = new NewsController();
//    Researcher researcher = new Researcher();
//    ResearchPaper paper = new ResearchPaper();
//    User user = new User();
//
//    private void save() throws IOException {
//        Data.write();
//    }
//
//    private void exit() {
//        System.out.println("Bye bye");
//        try {
//            save();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public Locale languageChoice(int lang1) throws IOException {
//        if (lang1 == 1) {
//            userLocale = new Locale("US");
//            return userLocale;
//        } else if (lang1 == 2) {
//            userLocale = new Locale("KZ");
//            return userLocale;
//        } else if (lang1 == 3) {
//            userLocale = new Locale("RU");
//            return userLocale;
//        } else {
//            userLocale = Locale.getDefault();
//            return userLocale;
//            // Locale.setDefault(Locale.US);
//        }
//    }
//
//    // @SuppressWarnings("static-access")
//    public void run() throws IOException {
//        pw.print(""); //
//        String lang = br.readLine();
//        int lang1 = Integer.parseInt(lang);
//        languageChoice(lang1);
//        messages = ResourceBundle.getBundle("mess", userLocale);
//        pw.println(messages.getString("mess.welcome"));
//
//        try {
//            premenu: while (true) {
//                pw.print(messages.getString("mess.login"));
//                String enteredUsername = br.readLine();
//
//                if (enteredUsername.isEmpty()) {
//                    pw.print(messages.getString("loginE.again"));
//                    continue premenu;
//                } else if (!enteredUsername.equals(user.getEmail())) {
//                    pw.println("loginMiss.again");
//                    continue premenu;
//                } else if (enteredUsername.equals(user.getEmail())) {
//
//                    pw.print("mess.password");
//                    String enteredPassword = br.readLine();
//
//                    if (user.login(enteredUsername, enteredPassword)) {
//                        pw.println("log.succ");
//
//                        menu: while (true) {
//
//                            pw.println(messages.getString("after.login"));
//                            int choice = Integer.parseInt(br.readLine());
//
//                            if (choice == 1) {
//                                seeNews: while (true) {
//                                    if (newsController.getAllNews().isEmpty()) {
//                                        pw.print(messages.getString("noNews"));
//                                        continue menu;
//                                    } else {
//                                        pw.println(messages.getString("cout.news"));
//                                        newsController.getTopicSortedNews();
//
//                                        pw.print(messages.getString("howNews"));
//                                        int newsOrder = Integer.parseInt(br.readLine());
//
//                                        if (newsOrder == 1) {
//                                            newsController.getAllNews();
//                                        } else if (newsOrder == 2) {
//                                            newsController.getAlphabeticalNews();
//                                        }
//                                    }
//                                }
//                            } 
//
//else if (choice == 2) { // уведомление
//    journal: while (true) {
//        pw.print("");
//        pw.print(messages.getString("journal.menu"));
//        String jourMenu = br.readLine();
//        int journalMenu = Integer.parseInt(jourMenu);
//
//        if (journalMenu == 1) {// projects
//            pw.print(messages.getString("list.projects"));
//            researcher.getResearchProjects();
//        } else if (journalMenu == 2) {// paper
//            pw.print(messages.getString("list.papers"));
//            researcher.getResearchPaper();
//        } else if (journalMenu == 3) {// researcher's list authors
//            DatabaseSingleton.INSTANCE.getResearchers();
//
//            pw.print(messages.getString("list.papers"));
//            paper.getAuthors();
//
//        } else if (jourMenu == "R") {
//        	DatabaseSingleton.INSTANCE.addResearchers(researcher);
//        } else {
//            // либо ошибка ввода сразу пременюшкага шыгара саламын
//        }
//    }
//}else if (choice == 4) {
//                                exit: while (true) {
//                                    exit();
//                                    break premenu;
//                                    // } break;
//                                }
//                            } else if (choice == 3) {
//                                menu: while (true) {
//                                    if (user instanceof Student) {
//                                        studentView: while (true) {
//                                        		
//                                        }
//                                    } else if (user instanceof Teacher) {
//                                        teacherView: while (true) {
//
//                                        }
//                                    } else if (user instanceof Admin) {
//                                        adminView: while (true) {
//
//                                        }
//                                    } else if (user instanceof OR) {
//                                        adminView: while (true) {
//
//                                        }
//                                    } else if (user instanceof TechSupport) {
//                                        adminView: while (true) {
//
//                                        }
//                                    } else if (user instanceof Researcher) {
//                                        adminView: while (true) {
//
//                                        }
//                                    } else if (user instanceof HRDepartment) {
//                                        adminView: while (true) {
//
//                                        }
//                                    }
//                                }
//                            }
//                        }
//                    } else {
//                        pw.print("log.invalid" + "pass.forgot");
//                        break premenu;
//                    }
//                } //else {
//                   // break premenu;
//                //}
//            } // premenu closed
//
//        } // try closed
//        catch (Exception e) {
//            pw.println("Something bad happened... \n Saving resources...");
//            e.printStackTrace();
//            save();
//        }
//    }
//}
//}




public class MainAndFinalTester{
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out),true);

	private static ResourceBundle messages;
	private Locale userLocale;
	
	NewsController newsController = new NewsController();
	Accountant accountant = new Accountant();
	Researcher researcher = new Researcher();
	ResearchPaper paper = new ResearchPaper();
	Teacher teacher = new Teacher();
	OR orManager = new OR();
	Student student = new Student();
	Admin admin = new Admin();
	User user = new User();
	
	
	
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
	        st.setName(br.readLine());
	        System.out.println("Enter surname: ");
	        st.setSurname(br.readLine());
	        System.out.println("Enter year of study: ");
	        st.setYearOfStudy(Integer.parseInt(br.readLine())); 
	        st.setOrganization(StudentOrganizations.OSIT);
	        st.setStud_status(StudentStatus.GRANT); 
	        DatabaseSingleton.INSTANCE.addStudents(st);
	        System.out.println("Student added! ");
	        DatabaseSingleton.write();
	}
	public void addTeacher(Teacher t) throws IOException {
	       System.out.println("Enter name: ");
	       t.setName(br.readLine());
	       System.out.println("Enter surname: ");
	       t.setSurname(br.readLine());
	       DatabaseSingleton.INSTANCE.addTeacher(t);
	       System.out.println("Teacher added! ");
	       DatabaseSingleton.write();
	       
	}

	public void addLesson(Lesson les) throws IOException{
		 System.out.println("Enter name of the course: ");
		 Course c= new Course();
		 c.setName(br.readLine());
		 les.setCourse(c);
		 DatabaseSingleton.INSTANCE.getLessons().add(les);
	     System.out.println("Lesson added! ");
	     DatabaseSingleton.write();
	}

	
	
	public void addLessonToTeacher(Teacher t) throws NumberFormatException, IOException {
		if (t.getLesson() == null) {
	        t.setLesson(new Vector<>()); 
	    }
		
		int i = Integer.parseInt(br.readLine()) - 1;
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

	        int teacherIndex = Integer.parseInt(br.readLine()) - 1;
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

	        int studentIndex = Integer.parseInt(br.readLine()) - 1;
	        Student selectedStudent = enrolledStudents.get(studentIndex);

	        System.out.println("Enter the mark for " + selectedStudent.getName() + " " + selectedStudent.getSurname() + ": ");
	        double markValue = Double.parseDouble(br.readLine());

	        selectedStudent.getTranscript().get(lessons.get(0).getCourse()).setAtt1(markValue); // Assuming the first lesson if there are multiple
	        DatabaseSingleton.write();
	        System.out.println("Mark added successfully!");
	        } catch (Exception e) {
	        System.out.println("Error occurred while putting marks.");
	        e.printStackTrace();
	    }
	}
	
	
	public void addLessonToStudent(Student st) throws NumberFormatException, IOException {
		int i = Integer.parseInt(br.readLine()) - 1;
		Lesson les= DatabaseSingleton.INSTANCE.getLessons().get(i);
			if(!st.getTranscript().containsKey(les.getCourse())) {
				st.getTranscript().put(les.getCourse(), new Mark());
				System.out.println("Lesson "+ DatabaseSingleton.INSTANCE.getLessons().get(i)+" added to "+ st.getName());
			}
		else {
			System.out.println("this student already registered to this lesson");
		}
	}
	
	public Locale languageChoice(int lang1) throws IOException {
		if(lang1 == 1) {
			userLocale = new Locale("US");
			return userLocale;
		}
		else if(lang1 == 2) {
			userLocale = new Locale("KZ");
			return userLocale;
		}
		else if(lang1 == 3) {
			userLocale = new Locale("RU");
			return userLocale;
		}
		else{
			userLocale = Locale.getDefault();
			return userLocale;
//			Locale.setDefault(Locale.US);
		}
	}
	
	
	
//	@SuppressWarnings("static-access")
	public void run() throws IOException {	
		System.out.println("chose lang 1. en 2. kz 3. russ"); //
		String lang = br.readLine();
		int lang1 = Integer.parseInt(lang);
		languageChoice(lang1);
	    messages = ResourceBundle.getBundle("mess", userLocale);
		pw.println(messages.getString("mess.welcome"));

		
		try {
			premenu : while(true){
				System.out.println(messages.getString("mess.login"));
				String enteredUsername = br.readLine();
				
				newsController.addNews(TopicOrder.INTERESTING_ACTIVITIES, "  News A");
		        newsController.addNews(TopicOrder.PUBLISHINGS, "  News C");
		        newsController.addNews(TopicOrder.CANCELED_LESSONS, "  News B");
		        newsController.addNews(TopicOrder.PUBLISHINGS, "  News D");

		        
//				user.setEmail("dinadina");
//				user.setPassword("dina");
//				student.setEmail("firuzafiruza");
//				student.setPassword("firuza");
//				teacher.setEmail("aigeraaigera");
//				teacher.setPassword("aigera");
//				researcher.setEmail("azamatazamat");
//				researcher.setPassword("azamat");
//				admin.setEmail("pakitapakita");
//				admin.setPassword("pakita");
				
//				if(enteredUsername.isEmpty()){
//					pw.print(messages.getString("empty, try again"));
//					continue premenu;
//				}
//				else if(!enteredUsername.equals(user.getEmail())) {
//					pw.print("did not match");
//					continue premenu;
//				}
//				else if(enteredUsername.equals(user.getEmail())){
//					
//					pw.print("mess.password");
//					String enteredPassword = br.readLine();
//					
//					if(user.login(enteredUsername, enteredPassword)) {
						pw.println("log.succ");
						
						menu: while(true) {
							
						
							pw.println(messages.getString("after.login"));
							int choice = Integer.parseInt(br.readLine());
							
							if(choice==1){
								seeNews: while(true){
									if(newsController.getAllNews().isEmpty()) {//DatabaseSingleton.INSTANCE.
										pw.print(messages.getString("noNews"));
										continue menu;
									}
									else if(!newsController.getAllNews().isEmpty()){
										pw.println(messages.getString("cout.news"));
										newsController.getTopicSortedNews();//DatabaseSingleton.INSTANCE.
//										continue menu;
	
										pw.print(messages.getString("howNews"));
										int newsOrder = Integer.parseInt(br.readLine());
										
										if(newsOrder ==  1) {
										    newsController.getAllNews(); //getTopicSortedNews()
										    continue menu;
										}
										else if(newsOrder ==  2) {
										    newsController.getAlphabeticalNews();
										    continue menu;
										}
									}
								}
							}
							else if(choice==2) { // уведомление 
							journal: while(true) {
//								pw.print("");
								pw.print(messages.getString("journal.menu"));//journal.menu
								String jourMenu = br.readLine();
								int journalMenu = Integer.parseInt(jourMenu);
								
								if(journalMenu ==  1) {//projects
									pw.print(messages.getString("list.projects"));
								    researcher.getResearchProjects();
								}
								else if(journalMenu ==  2) {//paper
									pw.print(messages.getString("list.papers"));
									researcher.getResearchPaper(); 
								}
								else if(journalMenu ==  3) {//researcher's list authors 
//									DatabaseSingleton.INSTANCE.getResearchers(); 
									researcher.getResearchers();
								
									pw.print(messages.getString("list.papers"));
									paper.getAuthors();
									
								}
								else if(jourMenu == "R") {
									researcher.addResearchers(researcher);
									//ресерч болу деген , became researcher add to list
								}
								else {
									
									// либо ошибка ввода сразу пременюшкага шыгара саламын
								}
							}
						}	
						else if(choice==4) {
							exit: while(true) {
								exit();  break premenu;
//													} break;
							}
						}
						else if(choice == 3) {
							admin.run();
						}
//							
								}
							}
				}
			
		//try closed
			catch (Exception e) {
			pw.println("Something bad happened... \n Saving resources...");
			e.printStackTrace();
			save();
		}
	}
}





//else if(choice == 3) {

//	homeMenu : while(true) {
//		if(user instanceof Admin) {
//			adminView: while(true) {
//					System.out.println("What do you want to do?\n 1) Add student \n 2)Add teacher \n 3) Add course  \n 4) Add course to a Teacher  5) Add course to a Student\n 6) View students \n 7) View teachers \n 8) View lessons \n 9) Exit");
//					int adminChoice = Integer.parseInt(br.readLine());
//					if(adminChoice==1){
//						addStudent: while(true){
//							addStudent(new Student());
//							System.out.println("\n 1) Add another student  \n 2) Return back \n 3) Exit");
//							choice =Integer.parseInt(br.readLine());
//							if(choice==1) continue addStudent;
//							if(choice==2) continue menu;
//							if(choice==3) {exit(); break menu;}
//							break;
//						}
//					}
//					else if(adminChoice==2){
//						addTeacher: while(true){
//							addTeacher(new Teacher());
//							System.out.println("\n 1) Add another teacher  \n 2) Return back \n 3) Exit");
//							choice = Integer.parseInt(br.readLine());
//							if(choice==1) continue addTeacher;
//							if(choice==2) continue menu;
//							if(choice==3) {exit(); break menu;}
//							break;
//						}
//					}
//					
//					else if (adminChoice==3){
//						addLesson: while(true){
//							addLesson(new Lesson());
//							System.out.println("\n 1) Add another course  \n 2) Return back \n 3) Exit");
//							choice = Integer.parseInt(br.readLine());
//							if(choice==1) continue addLesson;
//							if(choice==2) continue menu;
//							if(choice==3) {exit();  break menu;}
//							break;
//						}
//					}
//					else if (adminChoice==4){
//						addLessonToTeacher: while(true){
//							System.out.println("Choose teacher to which you want to add course: (Enter number)");
//							if(!showTeachers()) continue menu;
//							Teacher teach = DatabaseSingleton.INSTANCE.getTeacher().get(Integer.parseInt(br.readLine()) - 1);
//							System.out.println("Choose course: (Enter number)");
//							if(!showLessons()) continue menu;
//							addLessonToTeacher(teach);
//							System.out.println("\n 1) Add another course to some teacher  \n 2) Return back \n 3) Exit");
//							choice = Integer.parseInt(br.readLine());
//							if(choice==1) continue addLessonToTeacher;
//							if(choice==2) continue menu;
//							if(choice==3) {exit(); break menu;}
//							break;
//						}
//					}
//					
//					
//					else if (adminChoice==5){
//						addLessonToStudent: while(true){
//							System.out.println("Choose student to which you want to add course: (Enter number)");
//							if(!showStudent()) continue menu;
//							Student stud = DatabaseSingleton.INSTANCE.getStudents().get(Integer.parseInt(br.readLine()) - 1);
//							System.out.println("Choose lesson with teacher: (Enter number)");
//							if(!showLessons()) continue menu;
//							addLessonToStudent(stud);
//							System.out.println("\n 1) Add another course to some student  \n 2) Return back \n 3) Exit");
//							choice = Integer.parseInt(br.readLine());
//							if(choice==1) continue addLessonToStudent;
//							if(choice==2) continue menu;
//							if(choice==3) {exit(); break menu;}
//							break;
//						}
//					}
//							
//					else if (adminChoice==6){
//						if(!showStudent()) continue menu;
//						System.out.println("\n 1) Return back \n 2) Exit");
//						choice = Integer.parseInt(br.readLine());
//						if(choice==1) continue menu;
//						if(choice==2) {exit();  break menu;}
//						break;
//					}
//					
//					else if (adminChoice==7){
//						TeacherView t=new TeacherView();
//						t.runTeacherView();
//					}
//					else if (adminChoice==8){
//						if(!showLessons()) continue menu;
//						System.out.println("\n 1) Return back \n 2) Exit");
//						choice = Integer.parseInt(br.readLine());
//						if(choice==1) continue menu;
//						if(choice==2) {exit();  break menu;}
//						break;
//					}
//				
//					else if (adminChoice==10){
//						System.out.println(DatabaseSingleton.INSTANCE.getTeacher());
//						exit();
//						break menu;
//					}
//				}
//			} 
//			}
//		}
	
	
	
	
	
	



//else if(choice==2) { // уведомление 
//	journal: while(true) {
//		pw.print("");
//		pw.print(messages.getString("journal.menu"));
//		String jourMenu = br.readLine();
//		int journalMenu = Integer.parseInt(jourMenu);
//		
//		if(journalMenu ==  1) {//projects
//			pw.print(messages.getString("list.projects"));
//		    researcher.getResearchProjects();
//		}
//		else if(journalMenu ==  2) {//paper
//			pw.print(messages.getString("list.papers"));
//			researcher.getResearchPaper(); 
//		}
//		else if(journalMenu ==  3) {//researcher's list authors 
//			DatabaseSingleton.INSTANCE.getResearchers(); 
//		
//			pw.print(messages.getString("list.papers"));
//			paper.getAuthors();
//			
//		}
//		else if(jourMenu == "R") {
//			
//			//ресерч болу деген , became researcher add to list
//		}
//		else {
//			// либо ошибка ввода сразу пременюшкага шыгара саламын
//		}
//	}
//}	
//else if(choice==4) {
//	exit: while(true) {
//		exit();  break premenu;
////							} break;
//	}
//}
//else if(choice==3) {
//	menu: while(true) {
//		if(user instanceof Student) {
//			studentView: while(true) {
//				
//			}
//		}
//		else if(user instanceof Teacher) {
//			teacherView: while(true) {
//				
//			}
//		}
//		else if(user instanceof Admin) {
//			adminView: while(true) {
//				
//			}
//		}
//		else if(user instanceof OR) {
//			adminView: while(true) {
//				
//			}
//		}
//		else if(user instanceof TechSupport) {
//			adminView: while(true) {
//				
//			}
//		}
//		else if(user instanceof Researcher) {
//			adminView: while(true) {
//				
//			}
//		}
//		else if(user instanceof HRDepartment) {
//			adminView: while(true) {
//				
//			}
//		}
//	}
//}
//}
//}
//
//else {
//pw.print("log.invalid" + "pass.forgot");
//exit();  
//break premenu;
//}
//}
//else {
//break premenu;
//}
//}//premenu closed
























		

//public static void main(String[] args) {
//
//	try {
		//example showing how to use BR, PW
		//br reads from console, pw writes to console (yes, the same as System.out.println), pwFile writes to file
		
		// while not end of file, keep reading and displaying lin


//			
//			br.close();
//			pw.close();
//	}
//	catch(IOException ioe) {
//	System.out.println("Can't read!");
//}
//}


//
//private void printList(List list) {
//for(int i=0; i<list.size(); i++)
//	System.out.println(i+1+ ")" +list.get(i));
//}
//
//
//public boolean showStudents(){
//if(Data.INSTANCE.students.isEmpty()) {
//	System.out.println("No students yet...Try adding one");
//	return false;
//}
//printList(Data.INSTANCE.students);
//return true;
//}
//
//
//public boolean showCourses(){
//if(Data.INSTANCE.courses.isEmpty()) {
//	System.out.println("No courses yet...");
////	addCourse();  WE CAN DO SMTH LIKE THAT THOUGHT
//	return false;
//}
//printList(Data.INSTANCE.courses);
//return true;
//}
//
//

//else if (choice==3){
//addCourseToStudent: while(true){
//	System.out.println("Choose student to which you want to add course: (Enter number)");
//	if(!showStudents()) continue menu;
//	PakitasStudent s = Data.INSTANCE.students.get(in.nextInt()-1);
//	System.out.println("Choose course: (Enter number)");
//	if(!showCourses()) continue menu;
//	addCourseToStudent(s);
//	System.out.println("\n 1) Add another course to some student  \n 2) Return back \n 3) Exit");
//	choice = in.nextInt();
//	if(choice==1) continue addCourseToStudent;
//	if(choice==2) continue menu;
//	if(choice==3) {exit(); break menu;}
//	break;
//}
//}
//
//private void addStudent() {
//System.out.println("Enter name: ");
//Data.INSTANCE.students.add(new Student(in.next()));
//System.out.println("Student added! ");
//}
//
//
//private void addCourse() {
//System.out.println("Enter name of the course: ");
//Data.INSTANCE.courses.add(new Course(in.next()));
//System.out.println("Course added! ");		
//}
//
//
//private void addCourseToStudent(Student s) {
//int i = in.nextInt()-1;
//Course c = Data.INSTANCE.courses.get(i);
//if(!s.courses.containsKey(c)) {
//	s.courses.put(c, new Mark());
//	System.out.println("Course "+Data.INSTANCE.courses.get(i) +" added to  "+s.name);	
//}
//else System.out.println("Student " + s.name+ " already registered to "+c);
//}
//
//
////login method with sign in things 
//
//

//do login 
//premenu : while(true) {
////ResourceBundle bundle = ResourceBundle.getBundle("mess" + Locale.US);
////pw.println("Message in " + Locale.US + " = " + bundle.getString("after.login"));
//pw.print("chose language 1. en 2. kazakh 3. russian");
//String line = br.readLine();
//int choice = Integer.parseInt(line);
//if(choice == 1) {
//	printInfo("en" , "US");
//}
//else if(choice == 2) {
//	printInfo("kk" , "KZ");
//}
//else if(choice == 3) {
//	printInfo("ru" , "RU");
//}
//


//Locale.setDefault(Locale.ENGLISH);
//
////Get the user's locale (you can obtain this from user preferences or settings)
//Locale userLocale = new Locale("fr"); // Example: French locale
//
////Load the appropriate resource bundle
//messages = ResourceBundle.getBundle("messages", userLocale);
//
////Use the messages in your application
//System.out.println(messages.getString("welcome_message"));


//private static void printInfo(String language, String country) throws UnsupportedEncodingException{
//Locale current = new Locale (language, country);
//ResourceBundle rb = ResourceBundle.getBundle("mess", current);
//String s1 = rb.getString ("after.login");
////s1 = new String(sl.getBytes ("ISO-8859-1"), "UTF-8");
//System.out.println(s1);
////pw.println(s1);
////String s2 = rb.getstring ("str2");
////s2 = new String(s2.getBytes ("IS0-8859-1"),
////"UTF-8");
////System.out.printIn (s2);
//System.out.println();
//}





//menu : while(true){
//pw.println("1. log in\n 2. news \n 3. journal \n 4. exit");
////String line = br.readLine();
//// Convert the string to an int
////int choice = Integer.parseInt(line);

//if (choice==2){//news
//	news: while(true){
////		addCourse();
//		pw.println("\n 1) Add another course  \n 2) Return back \n 3) Exit");
//		choice = Integer.parseInt(br.readLine());
//		if(choice==1) continue addCourse;
//		if(choice==2) continue menu;
//		if(choice==3) {exit();  break menu;}
//		break;
//	}
//}

//else if(choice==1){
//	login: while(true){
////		logIn();  МЕТОД ТАКОЙ
//		pw.println("success \n 3. back to menu");
//		choice = Integer.parseInt(br.readLine());
//		if(choice==1) continue login; // here is the view of login should be different 
//		if(choice==2) continue menu; 
//		break;
//	}
//}

//else if (choice==3){ //journal
////	if(!showStudents()) continue menu;
//	pw.println("\n 1) Return back \n 2) Exit");
//	choice = Integer.parseInt(br.readLine());
//	if(choice==1) continue menu;
//	if(choice==2) {exit();  break menu;}
//	break;
//}
//else if (choice==4){
//	exit();
//	break menu;
//}
//}


//public class AnimalFeeder {
//
//    public void feed(List<Animal> animals) {
//        animals.forEach(animal -> {
//            animal.eat();
//            if (animal instanceof Cat) {
//                ((Cat) animal).meow();
//            }
//        });
//    }
//}

