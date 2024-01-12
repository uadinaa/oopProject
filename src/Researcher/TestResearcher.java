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





//package Researcher;
//
//import java.util.*;
//
//
//public class TestResearcher {
//
//    public static void main(String[] args) {
//        // Create a sample researcher
//        Researcher researcher = new Researcher();
//
//        // Create a sample paper
//        ResearchPaper paper = new ResearchPaper();
//        paper.setTitle("Sample Paper");
//        Vector<Researcher> authors = new Vector<>();
//        authors.add(researcher);
//        paper.setAuthors(authors);
//        paper.setJournal("Sample Journal");
//        paper.setPages(10);
//        paper.setCitations(5);
//
//        // Create a sample project
//        ResearchProject project = new ResearchProject();
//        project.setTitle("Sample Project");
//        project.setAuthors(authors);
////        project.setSupervisor(researcher);
//        Vector<ResearchPaper> projectPapers = new Vector<>();
//        projectPapers.add(paper);
////        project.setAllPublishedPapers(projectPapers);
//
//
//        // Test beParticipant method
//        System.out.println("Is researcher a participant? " + researcher.beParticipant());
//
//        // Test calculateHIndex method
//        int hIndex = researcher.calculateHIndex();
//        System.out.println("Researcher's H-Index: " + hIndex);
//
//        // Test publishResearchPapers method
//        System.out.println("Researcher published papers? " + researcher.publishResearchPapers());
//
//
//        // Test getTitle method
//        System.out.println("Paper Title: " + paper.getTitle());
//
//        // Test getCitations method
//        System.out.println("Number of Citations: " + paper.getCitations());
//
//        // Test printPapers method
////        System.out.println("Printing Papers:");
////        paper.printPapers(null);  // Pass a comparator as needed
//
//        // Test getCitation method with BibTex format
//        Format bibTexFormat = new BibTex();
//        String bibTexCitation = paper.getCitation(bibTexFormat);
//        System.out.println("BibTex Citation:\n" + bibTexCitation);
//
//        // Test getCitation method with PlainText format
//        Format plainTextFormat = new PlainText();
//        String plainTextCitation = paper.getCitation(plainTextFormat);
//        System.out.println("PlainText Citation:\n" + plainTextCitation);
//
//
//        // Test compareTo method
//        int comparisonResult = project.compareTo(paper);
//        System.out.println("Comparison Result: " + comparisonResult);
//    }
//}
