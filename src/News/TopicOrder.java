package News;

import java.util.Comparator;

public enum TopicOrder  implements Comparator<TopicOrder>{
    PUBLISHINGS, CANCELED_LESSONS, INTERESTING_ACTIVITIES;

	@Override
	public int compare(TopicOrder o1, TopicOrder o2) {
		return compare(o1, o2);
	}
}