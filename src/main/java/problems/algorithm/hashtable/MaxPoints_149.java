package problems.algorithm.hashtable;

/**
 * 
 * @author Search yaodong199@ciloud.com 直线上最多的点数
 *
 */
public class MaxPoints_149 {

	// 求斜率 （y2-y1）/(x2-x1) 用乘法代替除法 考虑重复点问题 三点位于一条直线上 ，数学向量

	public int maxPoints(int[][] points) {
		// 如果总坐标点少于 3 个，直接返回答案
		int n = points.length;
		if (points.length <= 2)
			return n;

		// 搜索直线上最多的点数
		int max = 0;
		for (int i = 0; i < n; i++) {
			// same 表示有多少个和 i 一样的点
			int same = 1;
			for (int j = i + 1; j < n; j++) {
				// cnt 表示除了 i 坐标点外，有多少个点在 i、j 坐标点构成的直线上
				int cnt = 0;
				if (points[i][0] == points[j][0] && points[i][1] == points[j][1]) {
					// i、j 是重复点，计数
					same++;
				} else {
					// i、j 不是重复点，检查其他点是否在这条直线上，j 坐标点也在这条直线上，所以 cnt ++
					cnt++;
					long xDiff = (long) (points[i][0] - points[j][0]);
					long yDiff = (long) (points[i][1] - points[j][1]);
					for (int k = j + 1; k < n; k++) {
						if (xDiff * (points[i][1] - points[k][1]) == yDiff * (points[i][0] - points[k][0])) {
							cnt++;
						}
					}
				}
				// 最大值比较
				max = Math.max(max, cnt + same);
			}
		}
		return max;
	}

}
