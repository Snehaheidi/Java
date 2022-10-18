package collection;

import java.util.Comparator;

public class ComparatorDemo implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		StudentDetail s1 = (StudentDetail)o1;
		StudentDetail s2 = (StudentDetail)o2;
		if(s1.getSage()>s2.getSage()) {
			return -1;
		}
		else if(s1.getSage()<s2.getSage()) {
			return 1;
		}
		else {
			return 0;
		}
	}
}
