package Researcher;

import java.util.*;

public class BibTex implements Format{

    @Override
    public String getCitation(String title, Vector<Researcher> authors, String journal, int pages, Date date, String doi) {
        return "{author = {" + authors + "}, \n" + "title = {" + title + "}, \n" + "date = {" + date + "}, \n" + "doi = {" + doi + "}}";
    }
}
//package Researcher;
//
//import java.util.*;
//
//public class BibTex extends ResearchPaper implements Format{
//
//
//    @Override
//    public String getCitation(String title, Vector<Researcher> authors, String journal, int pages, Date date, String doi) {
//        return "{author = {" + getAuthors() + "}, \n" + "title = {" + getTitle() + "}, \n" + "date = {" + getDate() + "}, \n" + "doi = {" + getDoi() + "}}";
//    }
//}