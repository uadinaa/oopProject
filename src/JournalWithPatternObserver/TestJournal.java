
package JournalWithPatternObserver;

import oop.User;

public class TestJournal extends User{

	public static void main(String[] args) {
		Observarable ReserchersJournal = new Journal();
		
		Subscriber s1 = new Subscriber("Firuza");
		Subscriber s2 = new Subscriber("Azamat");
		Subscriber s3 = new Subscriber("Dina");
		Subscriber s4 = new Subscriber("Aigera");
		//FADA algaaaa
		
		ReserchersJournal.subscribe(s1);
		ReserchersJournal.subscribe(s2);
		ReserchersJournal.subscribe(s3);
		ReserchersJournal.subscribe(s4);
		
		ReserchersJournal.unsubscribe(s4);
		
		ReserchersJournal.upload("Pakita's color project");
		
//		s3.subscribeJournal(ReserchersJournal);
//		s4.subscribeJournal(ReserchersJournal);
		
	}

}
