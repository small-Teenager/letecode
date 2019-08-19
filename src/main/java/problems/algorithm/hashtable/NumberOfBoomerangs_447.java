package problems.algorithm.hashtable;

import java.util.HashMap;

/**
 * 
 * @author @author Search yaodong199@ciloud.com 回旋镖的数量
 *
 */
public class NumberOfBoomerangs_447 {

	// 计算一点和其他点之间的距离，使用哈希表存储，若同一距离出现多次，则可以形成回旋镖。假设同一距离出现 n 次，由数字规律可推出回旋镖的数量 sum =
	// n*(n-1) 。存储到哈希表，然后按该公式累加得到最后结果，优化如下：假设当前同一距离的数量为 n, 回旋镖数量为
	// n*(n-1), 当再出现一个同一距离时，回旋镖的数量应为 (n+1)*n，与之前相差 (n+1)*n - n*(n-1) = 2*n，
	// 所以只需要把最后答案加上 2*n, 最后 n+1 再存储到哈希表中。
	public int numberOfBoomerangs(int[][] points) {
		int len = points.length;
		int ans = 0;
		HashMap<Double, Integer> map = new HashMap<Double, Integer>();
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				if (i != j) {
					double dis = Math.pow(points[i][0] - points[j][0], 2) + Math.pow(points[i][1] - points[j][1], 2);
					if (!map.containsKey(dis)) {
						map.put(dis, 1);
					} else {
						int n = map.get(dis);
						ans += 2 * n;
						map.put(dis, 1 + n);
					}
				}
			}
			map.clear();
		}
		return ans;
	}
}
