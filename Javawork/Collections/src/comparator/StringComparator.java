package comparator;

import java.util.Comparator;

public class StringComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		int l1 = o1.length();
		int l2 = o2.length();
		if(o1.length()>o2.length()) {
			return 1;
		}else if(o1.length()<o2.length()){
			return -1;
		}else {
			return o1.compareTo(o2);
		}
		
	}
	

}
