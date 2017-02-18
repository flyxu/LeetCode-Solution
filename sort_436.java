import java.util.TreeMap;

class Interval {
	int start;
	int end;

	Interval() {
		start = 0;
		end = 0;
	}

	Interval(int s, int e) {
		start = s;
		end = s;
	}

}

public class sort_436 {
	public int[] findrightinterval(Interval[] intervals) {
		TreeMap<Integer, Integer> treeMap = new TreeMap<>();
		int result[] = new int[intervals.length];
		for (int i = 0; i < intervals.length; i++) {
			treeMap.put(intervals[i].start, i);
		}
		for (int i = 0; i < intervals.length; i++) {
			Integer key = treeMap.ceilingKey(intervals[i].end);
			result[i] = (key == null) ? -1 : treeMap.get(key);
		}
		return result;

	}
}
