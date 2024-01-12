package Researcher;

import java.util.*;

public class ResearchProject{

	private String title;

//	private Vector<Researcher> authors;
	private Researcher supervisor;
	public List<ResearchPaper> publishedPapers;
	
	public ResearchProject(){
	}
	
	public ResearchProject(String title, List<ResearchPaper> publishedPapers) {
		this.title = title;
		this.publishedPapers = publishedPapers;
	}

	public void setSupervisor(Researcher supervisor) {
		if(supervisor.calculateHIndex() >= 3){
			this.supervisor = supervisor;
		}
		else{
			System.out.println("H-index is less than 3 choose other supervisor");
		}
	}

	public List<ResearchPaper> getAllPublishedPapers(){
		return publishedPapers;
	}
	public void addPublishedPapers(ResearchPaper p){
		publishedPapers.add(p);
	}
	@Override
	public String toString() {
		return "ResearchProject{" +
				"title='" + title + '\'' +
				", supervisor=" + supervisor +
				", publishedPapers=" + publishedPapers +
				'}';
	}
}

//public class ResearchProject extends ResearchPaper{
//
//	private String title;
//
//	private Vector<Researcher> authors;
//	private Researcher supervisor;
//	public List<ResearchPaper> publishedPapers;
//	public ResearchProject(){
//
//		super();
//	}
//	public ResearchProject(String title, Researcher supervisor, List<ResearchPaper> publishedPapers) {
//		this.title = title;
//		this.supervisor = supervisor;
//		this.publishedPapers = publishedPapers;
//	}
//
//	public List<ResearchPaper> getAllPublishedPapers(){
//
//		return publishedPapers;
//	}
//	public void addPublishedPapers(ResearchPaper p){
//		publishedPapers.add(p);
//	}
//
////	@Override
//	public int compareTo(ResearchPaper o) {
//		if(title.length() == o.getTitle().length()){
//			return 0;
//		}
//		if(title.length() < o.getTitle().length()){
//			return -1;
//		}
//		return 1;
//	}
//}
