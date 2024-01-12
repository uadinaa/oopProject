package News;

import java.util.Comparator;

public class TopicAlphabeticalComparator implements Comparator<News> {
    @Override
    /**
     * compare by alphabetic order
     */
    public int compare(News news1, News news2) {
        return news1.getTopic().compareTo(news2.getTopic());
    }

}

//public void sort(Vector<News> vector) {
//// TODO Auto-generated method stub
//
//}


//public class TitleComparator implements Comparator<News> {
//
//    @Override
//    public int compare(News news1, News news2) {
//        return news1.getTitle().compareTo(news2.getTitle());
//    }
//
//    public void sort(Vector<News> vector) {
//        vector.sort(this);
//    }
//}