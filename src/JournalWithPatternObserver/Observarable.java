package JournalWithPatternObserver;

public interface Observarable {

	void subscribe(Subscriber subscriber);

	void unsubscribe(Observer subscriber);

	void notifySubscribers();

	void upload(String title);

}