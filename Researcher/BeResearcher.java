package Researcher;

import java.text.*;
import java.util.*;

public  interface BeResearcher {

	boolean beParticipant() ;
	

	int calculateHIndex() ;

	boolean getCitation(Format f) ;
	

	public ResearchPaper printPapers(Comparator c) ;

	public boolean publishResearchPapers () ;

	
	public void publishingPaper() ;
	
	
}

