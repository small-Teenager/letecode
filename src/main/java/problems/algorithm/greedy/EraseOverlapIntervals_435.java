package problems.algorithm.greedy;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 435. 无重叠区间
 * 
 * @author search
 *
 */
public class EraseOverlapIntervals_435 {

	/**
	 * 使用贪心策略，将区间的tail进行升序排序，这样我们保证tail小的与下一个tail大的发送重叠时，
	 * 我们移除的是大tail的区间，留下tail小的空间，从而保证和下一个tail大的区间进行比较时重叠的可能性更小 进而做到删除最少的区间数。
	 * 
	 * @param intervals
	 * @return
	 */
	public int eraseOverlapIntervals(int[][] intervals) {
		if (intervals.length == 0)
			return 0;
		// 按照每个小数组的tail大小进行排序
		Arrays.sort(intervals, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[1] - o2[1];
			}
		});

		// 排序后intervals[0]肯定保留
		int num = 1;
		int prevTail = intervals[0][1];
		for (int i = 1; i < intervals.length; i++) {
			if (prevTail > intervals[i][0])
				continue;
			// 当不重叠时进行移位
			prevTail = intervals[i][1];
			num++;
		}
		return intervals.length - num;
	}

}
