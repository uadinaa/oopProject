package Researcher;

import java.util.*;

public class TestResearcher {
    public static void main(String[] args) {
        // Create a researcher
        Researcher researcher = new Researcher();

        // Create some research papers
        ResearchPaper paper1 = new ResearchPaper("Paper 15", 15, new Date(), "24555", 20);
//        paper1.setTitle("Paper 1");
//        paper1.setAuthors(new Vector<>()); // add authors
//        paper1.setJournal("Journal A");
//        paper1.setPages(10);
//        paper1.setDate(new Date());
//        paper1.setDoi("doi123");
//        paper1.setCitations(5);

        ResearchPaper paper2 = new ResearchPaper("Paper 2", 8, new Date(), "35000", 15);
//        paper2.setTitle("Paper 2");
//        paper2.setAuthors(new Vector<>()); // add authors
//        paper2.setJournal("Journal B");
//        paper2.setPages(8);
//        paper2.setDate(new Date());
//        paper2.setDoi("doi456");
//        paper2.setCitations(8);
        ResearchPaper paper3 = new ResearchPaper("Paper 3", 8, new Date(), "35000", 12);
        // Add research papers to the researcher
        researcher.publishingPaper(paper1);
        researcher.publishingPaper(paper2);
        researcher.publishingPaper(paper3);
        ResearchProject rp1 = new ResearchProject("Project 1", new ArrayList<>());
        rp1.setSupervisor(researcher);
        rp1.addPublishedPapers(paper1);
        System.out.println(rp1.toString());

        // Print papers sorted by title length
        System.out.println("Papers sorted by title length:");
        researcher.printPapers(new TitleLengthComparator());
        System.out.println(researcher.calculateHIndex());
        System.out.println(paper3.getCitation(new BibTex()));
        System.out.println(paper3.getCitation(new PlainText()));
    }
}


