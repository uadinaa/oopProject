package Researcher;

import java.util.*;

public class TitleLengthComparator implements Comparator<ResearchPaper> {
    public int compare(ResearchPaper o1, ResearchPaper o2) {
        return Integer.compare(o1.getTitle().length(), o2.getTitle().length());
    }
}
