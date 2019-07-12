package problems.algorithm.greedy;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 435. ���ص�����
 * 
 * @author search
 *
 */
public class EraseOverlapIntervals_435 {

	/**
	 * ʹ��̰�Ĳ��ԣ��������tail�������������������Ǳ�֤tailС������һ��tail��ķ����ص�ʱ��
	 * �����Ƴ����Ǵ�tail�����䣬����tailС�Ŀռ䣬�Ӷ���֤����һ��tail���������бȽ�ʱ�ص��Ŀ����Ը�С ��������ɾ�����ٵ���������
	 * 
	 * @param intervals
	 * @return
	 */
	public int eraseOverlapIntervals(int[][] intervals) {
		if (intervals.length == 0)
			return 0;
		// ����ÿ��С�����tail��С��������
		Arrays.sort(intervals, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[1] - o2[1];
			}
		});

		// �����intervals[0]�϶�����
		int num = 1;
		int prevTail = intervals[0][1];
		for (int i = 1; i < intervals.length; i++) {
			if (prevTail > intervals[i][0])
				continue;
			// �����ص�ʱ������λ
			prevTail = intervals[i][1];
			num++;
		}
		return intervals.length - num;
	}

}
