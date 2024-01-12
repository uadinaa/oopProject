package JournalWithPatternObserver;

import java.util.Vector;

public class Journal implements Observarable  {
	private Vector<Subscriber> subscribersVector = new Vector<>();
	private String title;
	
	@Override
	/**
	 * method for subscribers to subscribe, add the subscriber that subscribed to the Vector of subscribers
	 */
	public void subscribe(Subscriber subscriber) {
		subscribersVector.add(subscriber);
	}
	
	@Override
	/**
	 * method for subscribers to unsubscribe, remove the subscriber that unsubscribed from the Vector of subscribers
	 */
	public void unsubscribe(Observer subscriber) {
		subscribersVector.remove(subscriber);
	}
	
	@Override
	/**
	 * method notification, to notify all subscribers from vector of subscribers
	 */
	public void notifySubscribers(){
		for(Observer subscriber :subscribersVector) {
			subscriber.updateJournal();
		}
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	@Override
	/**
	 * method for admin, who uploads a papers or projects, they put title for journals uploading material and call another method notify Subscribers 
	 */
	public void upload(String title) {
		this.setTitle(title);
		notifySubscribers();
	}

	
	
}
