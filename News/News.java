package News;
//model 
public class News {
    private String title;
    private String topic;
    
    public News() {
    }
    
    public News(String topic, String title) {
    	this.topic = topic;
    	this.title = title;
    	
    }

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}
}

//private String dateOfPublish;
//this.dateOfPublish = dateOfPublish;

//public String getDateOfPublish() {
//	return dateOfPublish;
//}
//public void setDateOfPublish(String dateOfPublish) {
//	this.dateOfPublish = dateOfPublish;
//}
