package News;

import java.util.Vector;


public class NewsController {
    private Vector<News> newsVector = new Vector<>();

    public void addNews(String topic, String title) {
        News news = new News(topic, title);
        newsVector.add(news);
    }

    public Vector<News> getNewsByTopic(String topic) {
        Vector<News> result = new Vector<>();
        for (News news : newsVector) {
            if (news.getTopic().equals(topic)) {
                result.add(news);
            }
        }
        return result;
    }

    public Vector<News> getAllNews() {
        return new Vector<>(newsVector);
    }
}


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
