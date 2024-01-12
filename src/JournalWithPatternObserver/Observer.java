package JournalWithPatternObserver;

public interface Observer {

	String getName();

	void setName(String name);

	Observarable getJournal();

	void setJournal(Observarable journal);

	void updateJournal();

}