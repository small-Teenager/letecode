package problems.algorithm.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 合并区间--56
 * 
 * @author search yaodong199@icloud.com
 */

// Definition for an interval.
public class Interval {
	int start;
	int end;

	Interval() {
		start = 0;
		end = 0;
	}

	Interval(int s, int e) {
		start = s;
		end = e;
	}
}

class Solution {

	public List<Interval> merge(List<Interval> intervals) {
		List<Interval> res = new ArrayList<>();
		if (intervals.size() == 0)
			return res;
		Collections.sort(intervals, new Comparator<Interval>() {
			public int compare(Interval a, Interval b) {
				return a.start - b.start;
			}
		});
		Interval output = intervals.get(0);
		for (int i = 1; i < intervals.size(); i++) {
			if (!isOverlap(output, intervals.get(i))) {
				res.add(output);
				output = intervals.get(i);
			} else {
				output = mergeTwo(output, intervals.get(i));
			}
		}
		res.add(output);
		return res;

	}

	public boolean isOverlap(Interval i, Interval j) {
		if (i.start > j.end || i.end < j.start)
			return false;
		else
			return true;
	}

	public Interval mergeTwo(Interval i, Interval j) {
		Interval res = new Interval();
		res.start = Math.min(i.start, j.start);
		res.end = Math.max(i.end, j.end);
		return res;
	}
}