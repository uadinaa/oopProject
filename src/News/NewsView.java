package News;

import java.util.Vector;

public class NewsView {

    public static void main(String[] args) {
        NewsController newsController = new NewsController();

        newsController.addNews(TopicOrder.INTERESTING_ACTIVITIES, "  News A");
        newsController.addNews(TopicOrder.PUBLISHINGS, "  News C");
        newsController.addNews(TopicOrder.CANCELED_LESSONS, "  News B");
        newsController.addNews(TopicOrder.PUBLISHINGS, "  News D");

        
        System.out.println("\nAll News:");
        newsController.getTopicAndNews();
        
        System.out.println("\nAlphabetical Order:");
        newsController.getAlphabeticalNews();
      
        System.out.println("\nTopic Sorted Order:");
        newsController.getTopicSortedNews();     
        
    }

	
}


//БУКИЛ НОВОСТИДЫ ШЫГАРУ
//Vector<News> allNews = new Vector<>(newsController.getAllNews());

//for (News news : allNews) {
//  System.out.println(news.getTopic() + news.getTitle());
//}

//НОВОСТИ В АЛФ ПОРЯДКЕ ШЫГАРУ
//Vector<News> alphabeticalNews = new Vector<>(newsController.getAllNews());
//new TitleAlphabeticalComparator().sort(alphabeticalNews);

//	for (News news : alphabeticalNews) {
//      System.out.println(news.getTopic() + news.getTitle());
//  }

  //ПО ТОПИКАМ СОРТИТЬ ЕТИП ШЫГАРУ, ЭТО ЧТО Б БИРИНШИ ШЫГЫП ТУРДЫ ВСЕ НОВОСТИ СВЯЗАННЫЕ С РЕСЕРЧЕРОМ
//  Vector<News> topicSortedNews = new Vector<>(newsController.getAllNews());
//  new TopicComparator().sort(topicSortedNews);

//		  for (News news : topicSortedNews) {
//            System.out.println(news.getTopic() + news.getTitle());
//        }
