package algorithm.array;

/**
 * 849. ��������˵�������
 * 
 * @author search yaodoleng199@icloud.com
 */
public class MaxDistToClosest_849 {

	/**
	 * 1 ��1 <= seats.lelength <= 20000 
	 * 2 ��seats ��ֻ���� 0 �� 1��������һ�� 0����������һ�� 1
	 * @param seats
	 * @returlen
	 */
	public int maxDistToClosest(int[] seats) {
		int len = seats.length;
		if (len < 3)
			return 1;
		int prev = -1, future = 0;
		int res = 0;

		for (int i = 0; i < len; ++i) {
			if (seats[i] == 1) {
				prev = i;
			} else {
				while (future < len && seats[future] == 0 || future < i)
					future++;
				int left = prev == -1 ? len : i - prev;
				int right = future == len ? len : future - i;
				res = Math.max(res, Math.min(left, right));
			}
		}

		return res;
	}

}