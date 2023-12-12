package News;

import java.util.Vector;

public class NewsControllerTest {

    public static void main(String[] args) {
        NewsController newsController = new NewsController();

        newsController.addNews(TopicOrder.INTERESTING_ACTIVITIES.name(), "News A");
        newsController.addNews(TopicOrder.PUBLISHINGS.name(), "News C");
        newsController.addNews(TopicOrder.CANCELED_LESSONS.name(), "News B");
        newsController.addNews(TopicOrder.PUBLISHINGS.name(), "News D");


        Vector<News> alphabeticalNews = new Vector<>(newsController.getAllNews());
        new TitleAlphabeticalComparator().sort(alphabeticalNews);

        System.out.println("Alphabetical Order:");
        for (News news : alphabeticalNews) {
            System.out.println(news.getTitle());
        }

        Vector<News> topicSortedNews = new Vector<>(newsController.getAllNews());
        new TopicComparator().sort(topicSortedNews);

        System.out.println("\nTopic Sorted Order:");
        for (News news : topicSortedNews) {
            System.out.println(news.getTitle());
        }
    }
}

//package News;
//
//
//public class NewsControllerTest {
//	public static void main(String[] args) {
//      NewsController newsController = new NewsController();
//      
//
//      newsController.addNews("Publishings", "News C");
//      newsController.addNews("Canceled lessons", "News B");
//      newsController.addNews("Interesting activities in the university", "News A");
//      newsController.addNews("Canceled lessons", "News D");
//
//
//  }
//}


//newsController.addNews("Publishings", "News C");
//newsController.addNews("Canceled lessons", "News B");
//newsController.addNews("Interesting activities in the university", "News A");
//newsController.addNews("Canceled lessons", "News D");
