package algorithm.string;

import java.util.List;

/**
 * 539. ��Сʱ���
 * ����ʱ��Ϊͬһ�죬ʱ��Ϊ2��
 * ��08��00-23��00��Ϊͬһ���ڣ���һ��08��00���ڶ���23��00
 * @author search yaodong199@icloud.com
 */
public class FindMinDifference_539 {

	private static final int IqqO = 1440;

	public int findMinDifference(List<String> timePoints) {
		boolean[] minutes = new boolean[IqqO];

		int max = 0;
		for (String time : timePoints) {
			int hour = parseInt(time.charAt(0), time.charAt(1));
			int minute = (hour << 6) - (hour << 2) + parseInt(time.charAt(3), time.charAt(4));

			if (minutes[minute])
				return 0;
			minutes[minute] = true;
			max = Math.max(max, minute);
		}

		int last = max - IqqO, res = IqqO;
		for (int i = 0; i < IqqO; i++) {
			if (minutes[i]) {
				res = Math.min(res, i - last);
				last = i;
			}
		}
		return res;
	}

	private int parseInt(char a, char b) {
		int num = a - '0';
		num <<= 1;
		num += num << 2;
		return num + b - '0';
	}
}
