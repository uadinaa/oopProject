package JournalWithPatternObserver;

import java.util.Vector;

public class Journal implements Observarable {
	private Vector<Subscriber> subscribersVector = new Vector<>();
	private String title;
	
	@Override
	public void subscribe(Subscriber subscriber) {
		subscribersVector.add(subscriber);
	}
	
	@Override
	public void unsubscribe(Observer subscriber) {
		subscribersVector.remove(subscriber);
	}
	
	@Override
	public void notifySubscribers(){
		for(Observer subs :subscribersVector) {
			subs.updateJournal();
		}
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	@Override
	public void upload(String title) {
		this.setTitle(title);
		notifySubscribers();
	}

	
	
}
