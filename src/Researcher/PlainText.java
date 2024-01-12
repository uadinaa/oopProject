package Researcher;

import java.util.*;

public class PlainText implements Format{

    @Override
    public String getCitation(String title, Vector<Researcher> authors, String journal, int pages, Date date, String doi) {
        return "This is plain text formatting:" + title + ", " + authors + ", " + journal + ", " + pages + ", " + date + ", doi: " + doi;
    }
}

//package Researcher;
//
//import java.util.*;
//
//public class PlainText extends ResearchPaper implements Format{
//    @Override
//    public String getCitation(String title, Vector<Researcher> authors, String journal, int pages, Date date, String doi) {
//        return "This is plain text formatting:" + getTitle() + ", " + getAuthors() + ", " + getJournal() + ", " + getPages() + ", " + getDate() + ", doi: " + getDoi();
//    }
//}