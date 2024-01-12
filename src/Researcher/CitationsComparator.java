package Researcher;

import java.util.*;
import java.util.Comparator;

public class CitationsComparator implements Comparator<ResearchPaper> {
    @Override
    public int compare(ResearchPaper o1, ResearchPaper o2) {
        return Integer.compare(o2.getCitations(), o1.getCitations());
    }
}