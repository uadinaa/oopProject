package Researcher;

import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestResearcher {

    public static void main(String[] args) {
        // Create a sample researcher
         Researcher researcher = new Researcher();

        // Create some research papers
        ResearchPaper paper1 = new ResearchPaper();
        paper1.setTitle("Paper 1");
        paper1.setAuthors(new Vector<>()); // add authors
        paper1.setJournal("Journal A");
        paper1.setPages(10);
        paper1.setDate(new Date());
        paper1.setDoi("doi123");
        paper1.setCitations(5);

        ResearchPaper paper2 = new ResearchPaper();
        paper2.setTitle("Paper 2");
        paper2.setAuthors(new Vector<>()); // add authors
        paper2.setJournal("Journal B");
        paper2.setPages(8);
        paper2.setDate(new Date());
        paper2.setDoi("doi456");
        paper2.setCitations(8);

        // Add research papers to the researcher
        researcher.addResearchPaper(paper1);
        researcher.addResearchPaper(paper2);

        // Print papers sorted by title length
        System.out.println("Papers sorted by title length:");
        researcher.printPapers(new TitleLengthComparator());
    }
}
//
//public class TestResearcher {
//    public static void main(String[] args){
//        Vector<Researcher>authors = new Vector<Researcher>();
//        Vector<ResearchPaper>
//    }
//
