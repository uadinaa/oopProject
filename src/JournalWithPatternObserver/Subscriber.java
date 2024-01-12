package JournalWithPatternObserver;

public class Subscriber implements Observer {
	
	public Subscriber() {
	}
	
	private String name;
	private Observarable journal = new Journal();
	
	public Subscriber(String name) {
		super();
		this.setName(name);
	}
	
	@Override
	public String getName() {
		return name;
	}
	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public Observarable getJournal() {
		return journal;
	}
	@Override
	public void setJournal(Observarable journal) {
		this.journal = journal;
	}
	
	@Override
	public void updateJournal(){
		System.out.println(name + " New project or paper uploaded");
	}

//	public void subscribeJournal(Journal journal){
//		this.setJournal(journal);
//	}

	
	

}
