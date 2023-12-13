package Researcher;

import java.util.*;

public interface Format {
    String getCitation(String title, Vector<Researcher> authors, String journal, int pages, Date date, String doi);
}
