package Researcher;

import java.util.*;

import Enums.TypeOfTeacher;
import oop.Employee;

public class Researcher  extends Employee implements BeResearcher {
	private static Vector<Researcher>allResearchers = new Vector<Researcher>();
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
	
	public void addResearchers(Researcher r){
		allResearchers.add(r); 
	}
	public Vector<Researcher> getResearchers() {
		return allResearchers;
	}
	public void setAllResearchers(Vector<Researcher> researchers) {
		allResearchers = researchers;
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
				", hIndex=" + hIndex + '}';
	}
	@Override
	public boolean getCitation(Format f) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void publishingPaper() {
		// TODO Auto-generated method stub
		
	}
}
