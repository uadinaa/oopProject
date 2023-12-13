package Researcher;

import java.util.*;

public class Researcher implements BeResearcher, Comparator<ResearchPaper> {

	private TypeOfTeacher resercherEmpl;

	public Researcher(){

		super();
	}
//	public void PrintPapers(Comparator<ResearchPaper> c) {
//		Collections.sort(papers, c);
//
//		// Print the sorted papers
//		papers.forEach(System.out::println);
//	}

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
	public ResearchPaper printPapers(Comparator c) {
		return null;
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

