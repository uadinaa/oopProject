package News;

import java.util.Vector;

public class TopicComparator implements NewsComparator {

    @Override
    public int compare(News news1, News news2) {
        TopicOrder topic1 = TopicOrder.valueOf(news1.getTopic().toUpperCase().replace(" ", "_"));
        TopicOrder topic2 = TopicOrder.valueOf(news2.getTopic().toUpperCase().replace(" ", "_"));

        // Compare based on the predefined order
        return Integer.compare(topic1.ordinal(), topic2.ordinal());
    }

    @Override
    public void sort(Vector<News> vector) {
        vector.sort(this);
    }
}







//package News;
//
//import java.util.Arrays;
//import java.util.List;
//import java.util.Vector;
//
//public class TopicComparator implements NewsComparator{
//    private static final List<String> TOPIC_ORDER = Arrays.asList(
//            "Publishings",
//            "Canceled lessons",
//            "Interesting activities in the university"
//    );
//
//    @Override
//    public int compare(News news1, News news2) {
//    	    	
//        String topic1 = news1.getTopic();
//        String topic2 = news2.getTopic();
//
//        // Compare based on the predefined order
//        int index1 = TOPIC_ORDER.indexOf(topic1);
//        int index2 = TOPIC_ORDER.indexOf(topic2);
//
//        return Integer.compare(index1, index2);
//    }
//
//	@Override
//	public void sort(Vector<News> vector) {
//		
//	}
//}











//package News;
//
//import java.util.Comparator;
//
//public class TopicAlphabeticalComparator implements Comparator<News> {
//    @Override
//    public int compare(News news1, News news2) {
//        return news1.getTopic().compareTo(news2.getTopic());
//    }
//
//}



//public class TopicComparator implements Comparator<News>{
//
//	@Override
//	public void sort(Vector<News> vector) {
//		
//		
//	}
//	
//
//}

//return news1.getTopic().compareTo(news2.getTopic());

