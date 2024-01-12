package News;

import Researcher.Researcher;
import oop.Admin;
import oop.DatabaseSingleton;
import oop.HRDepartment;
import oop.OR;
import oop.Student;
import oop.Teacher;
import oop.TechSupport;

//model 
public class News {
    private String news;
    private TopicOrder topic;
    
    public News() {
    }
    
    public News(TopicOrder topic, String news) {
    	this.topic = topic;
    	this.news = news;
    	
    }

	public String getTitle() {
		return news;
	}
	public void setTitle(String news) {
		this.news = news;
	}

	public TopicOrder getTopic() {
		return topic;
	}

	public static News[] values() {
		// TODO Auto-generated method stub
		return null;
	}

}






