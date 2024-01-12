package News;

import java.util.Comparator;
import java.util.Vector;

public class TopicComparator implements Comparator<News> {

	    @Override
	    public int compare(News news1, News news2) {
	        return news1.getTopic().compareTo(news2.getTopic());
	    }

	    public void sort(Vector<News> vector) {
	        vector.sort(this);
	    }
	}
	//public class TopicComparator implements NewsComparator{
//
//	@Override
//	public int compare(TopicOrder topicOrder, TopicOrder topicOrder2) {
//		compare(topicOrder.getTopic(),topicOrder2.getTopic());
//		return 0;
//	}
//
//	@Override
//	public void sort(Vector<News> vector) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public int compare(News o1, News o2) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//}
////
////	public int compare(News o1, News o2) {
////		return Integer.compare(getValue(o1),  getAssignedValue(o1), getAssignedValue(o2)
////	}
//
//	@Override
//	public void sort(Vector<News> vector) {
//		// TODO Auto-generated method stub
//		
//	}
//
//@Override
//	public int compare(News o1, News o2) {
//	// TODO Auto-generated method stub
//		return 0;
//}
//}

//    public int compare(TopicOrder topicOrder, TopicOrder topicOrder2) {
//		return 0;
//        TopicOrder topic1 = TopicOrder.valueOf(news1.getTopic().replace(" ", "_"));
//        TopicOrder topic2 = TopicOrder.valueOf(news2.getTopic().toUpperCase().replace(" ", "_"));

        // Compare based on the predefined order
       
//    }
//
//    @Override
//    public void sort(Vector<News> vector) {
//        vector.sort(this);
//    }
//
//	@Override
//	public int compare(News o1, News o2) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//	@Override
//	public int compare(TopicOrder new1, TopicOrder new2) {
//		// TODO Auto-generated method stub
//		if(new1 > new2)return 1;
//		return 0;
//	}
//}







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

