package Researcher;

import java.text.*;
import java.util.*;

public  interface BeResearcher {
	List<ResearchProject>getResearchProjects();
	void addResearchProject(ResearchProject project);
	List<ResearchPaper> getResearchPaper();
	void addResearchPaper(ResearchPaper paper);
	boolean beParticipant() ;
	int calculateHIndex() ;
	boolean getCitation(Format f) ;
	void printPapers(Comparator<ResearchPaper> c) ;
	boolean publishResearchPapers () ;
	void publishingPaper() ;
	
	
}

