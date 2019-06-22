package problems.algorithm.hashtable;

import java.util.HashMap;

/**
 * 
 * @author @author Search yaodong199@ciloud.com �����ڵ�����
 *
 */
public class NumberOfBoomerangs_447 {

	// ����һ���������֮��ľ��룬ʹ�ù�ϣ��洢����ͬһ������ֶ�Σ�������γɻ����ڡ�����ͬһ������� n �Σ������ֹ��ɿ��Ƴ������ڵ����� sum =
	// n*(n-1) ���洢����ϣ��Ȼ�󰴸ù�ʽ�ۼӵõ���������Ż����£����赱ǰͬһ���������Ϊ n, ����������Ϊ
	// n*(n-1), ���ٳ���һ��ͬһ����ʱ�������ڵ�����ӦΪ (n+1)*n����֮ǰ��� (n+1)*n - n*(n-1) = 2*n��
	// ����ֻ��Ҫ�����𰸼��� 2*n, ��� n+1 �ٴ洢����ϣ���С�
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
