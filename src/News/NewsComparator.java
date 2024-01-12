package News;

import java.util.Comparator;
import java.util.Vector;

public interface NewsComparator extends Comparator<News> {
    void sort(Vector<News> vector);

	int compare(TopicOrder topicOrder, TopicOrder topicOrder2);

}























//@SuppressWarnings("hiding")
//public interface Comparator<News> {
//	void sort(Vector<News> vector);
//
//	int compare(News.News news1, News.News news2) {
//		
//	}

//	int compare(News.News news1, News.News news2);;
//return news1.getTopic().compareTo(news2.getTopic());
//}

//package News;
//
//import java.util.Vector;
//
//@SuppressWarnings("hiding")
//public interface Comparator<News> {
//	void sort(Vector<News> vector);
//
//}
