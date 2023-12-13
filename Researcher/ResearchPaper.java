package Researcher;

import java.util.*;

public class ResearchPaper {
	private String title;
	private Vector<Researcher> authors;
	private String journal;
	private int pages;
	private Date date;
	private String doi;
	private int citations;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Vector<Researcher> getAuthors() {
		return authors;
	}

	public void setAuthors(Vector<Researcher> authors) {
		this.authors = authors;
	}

	public String getJournal() {
		return journal;
	}

	public void setJournal(String journal) {
		this.journal = journal;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getDoi() {
		return doi;
	}

	public void setDoi(String doi) {
		this.doi = doi;
	}

	public int getCitations() {
		return citations;
	}

	public void setCitations(int citations) {
		this.citations = citations;
	}

	public int getHIndex() {
		return 0;
	}


//	public void printPapers(Comparator<ResearchPaper> c) {
//		Collections.sort(researchPapers, c);
//
//	}

	public String getCitation(Format f) {
        return f.getCitation(title, authors, journal, pages, date, doi);
    }
}