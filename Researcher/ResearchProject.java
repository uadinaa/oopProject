package Researcher;

import java.util.*;

public class ResearchProject extends ResearchPaper implements Comparable<ResearchPaper>{

	private String title;

	private ResearchPaper papers;

	public Vector<ResearchPaper> allPublishedPapers;
	public Vector<ResearchPaper> getAllPublishedPapers(){
		return allPublishedPapers;
	}

	public void setAllPublishedPapers(Vector<ResearchPaper> allPublishedPapers) {
		this.allPublishedPapers = allPublishedPapers;
	}

	private Vector<Researcher> authors;

	private Researcher supervisor;
	public ResearchProject(){

		super();
	}

	@Override
	public int compareTo(ResearchPaper o) {
		if(title.length() == o.getTitle().length()){
			return 0;
		}
		if(title.length() < o.getTitle().length()){
			return -1;
		}
		return 1;
	}
}

