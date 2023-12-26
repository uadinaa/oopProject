package Researcher;

import java.util.*;

public class BibTex implements Format{

    @Override
    public String getCitation(String title, Vector<Researcher> authors, String journal, int pages, Date date, String doi) {
        return "{author = {" + authors + "}, \n" + "title = {" + title + "}, \n" + "date = {" + date + "}, \n" + "doi = {" + doi + "}}";
    }
}
