package oop;

import java.util.Date;



public class TestMess {
	public static void main(String[] args) {
		
		User u = new User("Fiko", "Sagatkyzy");
		User u2 = new User("Akn", "Bibo");
		Teacher teacher = new Teacher("Pakita", "S", 1234567, new Date(), 5, TypeOfTeacher.PROFESSOR, ComplaintLevels.MEDIUM);//"john123", "john@example.com",
//	    public Teacher            (String name, String surname, int id, String password, String email,int salary, Date vacationDate, int experience, Vector<Course> courses, TypeOfTeacher teacherType, ComplaintLevels level) {
//		тут фамилий не было Ф
		RequestMessage request = new RequestMessage();
		Dean dean=new Dean("Dean", "K", 100000,new Date() , 5); //"dwqw", "asca"
//		public Dean(String name, String surname, int id, String password, String email,int salary, Date vacationDate, int experience) {
//  	тут фамилий не было Ф
		request.setFromWhom(teacher);
		request.setToWhom(dean);
		
		request.setMainText("Запрос на отпуск");
		request.setApproved(dean.approveRequest(request));
		System.out.println(request+"\n");

		ComplaintMessage complaint = new ComplaintMessage();
		complaint.setFromWhom(teacher);
		complaint.setToWhom(u);
		complaint.setMainText("Жалоба на студента");
		complaint.setComplaintLevel(ComplaintLevels.HIGH);
		System.out.println(complaint);
		
	}

}