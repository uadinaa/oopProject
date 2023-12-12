package classesMain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Vector;

public class Admin {

    private List<News> newsList = new ArrayList<>();
    private Vector<User> userVector = new Vector<>();

    public void addNews(News news) {
        newsList.add(news);
    }

    public List<News> getNewsList() {
        return newsList;
    }

    // Sorting methods using the cComparator interface

    public void sortingByTopics(Comparator<News> comparator) {
        Arrays.sort(newsList.toArray(new News[0]));
    }

    public void sortingByAlphabetic(Comparator<News> comparator) {
        Arrays.sort(newsList.toArray(new News[0]));
    }
    
    public void addUserAcc(User user){
    	userVector.add(user);
    }
    
    public void removeUserAcc(User user) {
    	userVector.remove(user);
    }
    
    public void updateUserAcc(User user) {
    	
    }
    
    public void workWithResearcher(User user) {
    	
    }
    
    public void addAllInfoToDatabase(User user) {
    	
    }
    
}
