package Researcher;

import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestResearcher {

    public static void main(String[] args) {
        // Create a sample researcher
        Researcher researcher = new Researcher();

        // Create a sample paper
        ResearchPaper paper = new ResearchPaper();
        paper.setTitle("Sample Paper");
        Vector<Researcher> authors = new Vector<>();
        authors.add(researcher);
        paper.setAuthors(authors);
        paper.setJournal("Sample Journal");
        paper.setPages(10);
        paper.setCitations(5);

        // Create a sample project
        ResearchProject project = new ResearchProject();
        project.setTitle("Sample Project");
        project.setAuthors(authors);
//        project.setSupervisor(researcher);
        Vector<ResearchPaper> projectPapers = new Vector<>();
        projectPapers.add(paper);
        project.setAllPublishedPapers(projectPapers);




        // Test beParticipant method
        System.out.println("Is researcher a participant? " + researcher.beParticipant());

        // Test calculateHIndex method
        int hIndex = researcher.calculateHIndex();
        System.out.println("Researcher's H-Index: " + hIndex);

        // Test publishResearchPapers method
        System.out.println("Researcher published papers? " + researcher.publishResearchPapers());


        // Test getTitle method
        System.out.println("Paper Title: " + paper.getTitle());

        // Test getCitations method
        System.out.println("Number of Citations: " + paper.getCitations());

        // Test printPapers method
//        System.out.println("Printing Papers:");
//        paper.printPapers(null);  // Pass a comparator as needed

        // Test getCitation method with BibTex format
        Format bibTexFormat = new BibTex();
        String bibTexCitation = paper.getCitation(bibTexFormat);
        System.out.println("BibTex Citation:\n" + bibTexCitation);

        // Test getCitation method with PlainText format
        Format plainTextFormat = new PlainText();
        String plainTextCitation = paper.getCitation(plainTextFormat);
        System.out.println("PlainText Citation:\n" + plainTextCitation);


        // Test compareTo method
        int comparisonResult = project.compareTo(paper);
        System.out.println("Comparison Result: " + comparisonResult);
    }
}
//
//public class TestResearcher {
//    public static void main(String[] args){
//        Vector<Researcher>authors = new Vector<Researcher>();
//        Vector<ResearchPaper>
//    }
//