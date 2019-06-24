package problems.algorithm.hashtable;

/**
 * 
 * @author Search yaodong199@ciloud.com ֱ�������ĵ���
 *
 */
public class MaxPoints_149 {

	// ��б�� ��y2-y1��/(x2-x1) �ó˷�������� �����ظ������� ����λ��һ��ֱ���� ����ѧ����

	public int maxPoints(int[][] points) {
		// �������������� 3 ����ֱ�ӷ��ش�
		int n = points.length;
		if (points.length <= 2)
			return n;

		// ����ֱ�������ĵ���
		int max = 0;
		for (int i = 0; i < n; i++) {
			// same ��ʾ�ж��ٸ��� i һ���ĵ�
			int same = 1;
			for (int j = i + 1; j < n; j++) {
				// cnt ��ʾ���� i ������⣬�ж��ٸ����� i��j ����㹹�ɵ�ֱ����
				int cnt = 0;
				if (points[i][0] == points[j][0] && points[i][1] == points[j][1]) {
					// i��j ���ظ��㣬����
					same++;
				} else {
					// i��j �����ظ��㣬����������Ƿ�������ֱ���ϣ�j �����Ҳ������ֱ���ϣ����� cnt ++
					cnt++;
					long xDiff = (long) (points[i][0] - points[j][0]);
					long yDiff = (long) (points[i][1] - points[j][1]);
					for (int k = j + 1; k < n; k++) {
						if (xDiff * (points[i][1] - points[k][1]) == yDiff * (points[i][0] - points[k][0])) {
							cnt++;
						}
					}
				}
				// ���ֵ�Ƚ�
				max = Math.max(max, cnt + same);
			}
		}
		return max;
	}

}
