package News;

import java.util.Vector;
import java.util.Comparator;

public class TitleAlphabeticalComparator implements Comparator<News> {

	/**
	 * compare by title
	 */
    @Override
    public int compare(News news1, News news2) {
        return news1.getTitle().compareTo(news2.getTitle());
    }

    public void sort(Vector<News> vector) {
        vector.sort(this);
    }
}

//public class TitleComparator implements Comparator<News> {
//
//	public void sort(Vector<News> vector) {
//		vector.sort(Comparator.comparing(News::getTitle));
//		
//	}
//
//}

