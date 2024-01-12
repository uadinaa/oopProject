//package oop;
//
//import java.util.Date;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Vector;
//
//import News.News;
//import News.NewsController;
//import News.TitleAlphabeticalComparator;
//import News.TopicOrder;
//
//
//public class MainTester {
//
//	public static void main(String[] args) {
//		DatabaseSingleton database = DatabaseSingleton.getDatabase();
//		Admin admin= new Admin(); //"Amin", 0, null, null, 0, null, 0
//		
//		Course oop= new Course("oop");
//		Course algo= new Course("algo");
//		
//		Mark mark1=new Mark(55); //, 100, 30, 70
//		Mark mark2=new Mark(80);//, 86, 40, 10
//		
//		
//		
//		User u = new User("Fiko");
//		User u2 = new User("Akn");
//		Teacher teacher = new Teacher("Pakita","S", 1, "john123", "john@example.com", 5000, new Date(), 5, null, null, null);
//		Dean dean=new Dean("Dean", "K", 5, "dwqw", "asca", 100000, new Date(), 5);
//		NewsController n=new NewsController();
//		n.addNews(TopicOrder.INTERESTING_ACTIVITIES.name(), "News A");
//        n.addNews(TopicOrder.PUBLISHINGS.name(), "News C");
//        n.addNews(TopicOrder.CANCELED_LESSONS.name(), "News B");
//        n.addNews(TopicOrder.PUBLISHINGS.name(), "News D");
//		
//		RequestMessage request = new RequestMessage();
//		request.setFromWhom(teacher);
//		request.setToWhom(dean);
//		request.setMainText("Запрос на отпуск");
//		request.setApproved(dean.approveRequest(request));
////		System.out.println(request+"\n");
//		
//		ComplaintMessage complaint = new ComplaintMessage();
//		complaint.setFromWhom(teacher);
//		complaint.setToWhom(u);
//		complaint.setMainText("Жалоба на студента");
//		complaint.setComplaintLevel(ComplaintLevels.HIGH);
////		System.out.println(complaint);
//		
//		admin.addUser(u);
//		admin.addUser(u2);
////		admin.addUser(teacher);
//		admin.addUser(dean);
//		
//		admin.addMessages(request);
//		admin.addMessages(complaint);
////		admin.removeUserAcc(u2);
//		admin.addNews(n);
//		
////		teacher.putMarks(algo, mark1);
////		teacher.putMarks(oop, mark2);
//		
//		
//		Vector<User> users = admin.showInfoUser();
//        System.out.println("Users:");
//        for (User us : users) {
//            System.out.println(us.getName() + " (ID: " + us.getId() + ")");
//        }
//        Vector<User> uska= new Vector<User>();
//        uska.add(u);
//        uska.add(u2);
//        uska.add(dean);
//        uska.add(admin);
//        
////        List<User> ui=uska.stream().
////        		map(n->n.getName().
////        		limit(1).collect(Collectors.toList()).
////        		System.out.println(us));
////        
//        Vector<Messages> messages = admin.showInfoMess();
//        System.out.println("\nMessages:");
//        for (Messages m : messages) {
//            System.out.println(m);
//        }
//        
//        Vector<NewsController> newses=admin.showNewNews();
//        System.out.println("\nNEWS:");
//        for (NewsController ne : newses) {
//            System.out.println(ne.getAllNews());
//        }
//  
//        
//        
////        Vector<Student> markInfo =teacher.showInfoMarks();
////        for (Course course : markInfo.keySet()) {
////            Mark mark = markInfo.get(course);
////            System.out.println("Course: " + course.getName() + "\n" + "Mark: " + mark.toString());
////        }
////        }
//    }
//}
//		
//		


	
	
