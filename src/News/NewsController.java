package News;

import java.util.Collections;
import java.util.Vector;


public class NewsController{
    private Vector<News> newsVector = new Vector<>();
    /**
     * add news to vector newsVector, to store them there, by parameters like topic and new
     * @param topic
     * @param nws
     */
    public void addNews(TopicOrder topic, String nws) {
        News news = new News(topic, nws);
        newsVector.add(news);
    }

    /**
     * method to get new by topic, the we can use it to future sorting functions or to just get news by topic 
     * @param topic
     * @return
     */
    public Vector<News> getNewsByTopic(String topic) {
        Vector<News> result = new Vector<>();
        for (News news : newsVector) {
            if (news.getTopic().equals(topic)) {
                result.add(news);
            }
        }
        return result;
    }
    
    
	public void setNewsVector(Vector<News> newsVector) {
		this.newsVector = newsVector;
	}

    public Vector<News> getAllNews() {
        return new Vector<>(newsVector);
    }
    
    /**
     * this method kinda returns all news, output is them are topics+title
     */
    public void getTopicAndNews() {
	    Vector<News> allNews = new Vector<>(getAllNews());
	    for (News news : allNews) {
	        System.out.println(news.getTopic() + news.getTitle());
	    }
    }
    
    /**
     * method to sort the topic's of news, and the to print theem in a specific order, for example published new is gonna be pin
     */
    public void getTopicSortedNews() {
    	Vector<News> topicSortedNews = new Vector<>(getAllNews());
        Collections.sort(topicSortedNews, new TopicComparator());
        
    	for (News news : topicSortedNews) {
            System.out.println(news.getTopic() + news.getTitle());
        }
    }
    /**
     * method of sorting to print the news in alphabetic order 
     */
    public void getAlphabeticalNews() {
    	Vector<News> alphabeticalNews = new Vector<>(getAllNews());
        new TitleAlphabeticalComparator().sort(alphabeticalNews);
        for (News news : alphabeticalNews) {
            System.out.println(news.getTopic() + news.getTitle());
        }
    }
    
}



//public int compareTo(News o, News o1) {
//	if(o.getTopic() >  o1.getTopic()) return 1;
//	if(o.getTopic() <  o1.getTopic()) return -1;
//	return 0;
//}









//    public Vector<News> getNewsByTitle() {
////    	Vector<News> res = new Vector<>();
////		for(News news : newsVector) {
////			return res;
////    }
//		return ;

    
//    public String toString() {
//		return ;
    	
//    public Vector<News> getNewsVector() {
//    	for(News news : newsVector)
//    		return news;
//	}




//public class NewsController {
//    private Map<String, Vector<News>> newsMap = new HashMap<>();
//
//    public void addNews(String topic, String title) {
////        newsMap.putIfAbsent(topic, new Vector<>());
////        newsMap.get(topic).add(news);
//        News news = new News(topic,title);
//        newsMap.putIfAbsent(topic, new Vector<>());
//        newsMap.get(topic).add(news);
//    }
//
//    public Vector<News> getNewsByTopic(String topic) {
//        return newsMap.getOrDefault(topic, new Vector<>());
//    }
//
//    public Map<String, Vector<News>> getAllNews() {
//        return newsMap;
//    }
//}

//public class NewsController {
//public Vector<News> newsVector = new Vector<>();
//
//public void addNews(News news) {
//	newsVector.add(news);
//}
//
//public Vector<News> getNews(){
//	return newsVector;
//}
//
//public void sortingByTopics(Comparator<News> comparator) {
//	comparator.sort(new Vector<>(newsVector));
//}
//
//public void sortingByAlphabeticOrder(Comparator<News> comparator) {
//	comparator.sort(new Vector<>(newsVector));
//}
//}
