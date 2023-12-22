package Researcher;

import java.util.*;

public class Researcher implements BeResearcher, Comparator<ResearchPaper> {
	private List<ResearchProject>researchProjects;
	private List<ResearchPaper>researchPapers;
	private int hIndex;

	private TypeOfTeacher resercherEmpl;

	public Researcher(){

	}
	public Researcher(List<ResearchProject> researchProjects,List<ResearchPaper>researchPapers,int hIndex,TypeOfTeacher resercherEmpl) {
		this.researchProjects = researchProjects;
		this.researchPapers = researchPapers;
		this.hIndex = hIndex;
		this.resercherEmpl = resercherEmpl;
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
//		Vector<ResearchPaper> papers = getAllPublishedPapers();
//
//		papers.sort(Comparator.naturalOrder().reversed());
//  here we need to sort our papers collection in a reverse order

		int hIndex = 0;
//		for (int i = 0; i < papers.size(); i++) {
//			if (papers.get(i).getCitation() >= i + 1) {
//				hIndex = i + 1;
//			} else {
//				break;
//			}
//		}

		return hIndex;
	}

	@Override
	public boolean getCitation(Format f) {
		return false;
	}


	@Override
	public boolean publishResearchPapers() {
		return false;
	}

	@Override
	public void publishingPaper() {

	}

	@Override
	public int compare(ResearchPaper o1, ResearchPaper o2) {
		return 0;
	}
}



