package Researcher;

import java.util.*;

public class Researcher implements BeResearcher {
	private static List<Researcher>allResearchers = new ArrayList<Researcher>();
	private List<ResearchProject>researchProjects;
	private List<ResearchPaper>researchPapers;
	private int hIndex;
	

	public Researcher(){
		allResearchers.add(this);
	}
	public Researcher(List<ResearchProject> researchProjects,List<ResearchPaper>researchPapers,int hIndex) {
		this.researchProjects = researchProjects;
		this.researchPapers = researchPapers;
		this.hIndex = hIndex;
	}
	public static List<Researcher>getAllResearchers(){
		return allResearchers;
	}

	public void printPapers(Comparator<ResearchPaper> c) {
		Collections.sort(researchPapers, c);
		researchPapers.forEach(System.out::println);
	}
	@Override
	public List<ResearchProject> getResearchProjects() {
		return researchProjects;
	}
	@Override
	public List<ResearchPaper> getResearchPaper() {
		return researchPapers;
	}
	@Override
	public void addResearchPaper(ResearchPaper paper) {
		if (this.researchPapers == null) {
			this.researchPapers = new ArrayList<>();
		}
		researchPapers.add(paper);
	}

	@Override
	public void addResearchProject(ResearchProject project) {
		researchProjects.add(project);
	}

	@Override
	public boolean beParticipant() {

		return false;
	}

	@Override
	public int calculateHIndex() {
//  here we need to sort our papers collection in a reverse order
		Collections.sort(researchPapers, new CitationsComparator());
		int hIndex = 0;
		for (int i = 0; i < researchPapers.size(); i++) {
			if (researchPapers.get(i).getCitations() >= i + 1) {
				hIndex = i + 1;
			} else {
				break;
			}
		}


		return hIndex;
	}


	@Override
	public boolean publishResearchPapers() {
		return false;
	}

	@Override
	public void publishingPaper(ResearchPaper paper) {
		if (this.researchPapers == null) {
			this.researchPapers = new ArrayList<>();
		}
		researchPapers.add(paper);
	}

	@Override
	public String toString() {
		return "Researcher{" +
				"researchProjects=" + researchProjects +
				", researchPapers=" + researchPapers +
				", hIndex=" + hIndex +
				'}';
	}
}

