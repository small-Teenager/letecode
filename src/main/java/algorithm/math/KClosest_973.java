package algorithm.math;

import java.util.Arrays;

/**
 * ��ӽ�ԭ���k ���� 973
 *
 * @author Search
 * @date 2019/1/14
 */
public class KClosest_973 {

    /**
     * ������Ե��������Ȼ��ȡ�����K��
     *
     * @param points
     * @param K
     * @return
     */
    public int[][] kClosest(int[][] points, int K) {
        int N = points.length;
        int[] dists = new int[N];
        for (int i = 0; i < N; ++i) {
            dists[i] = dist(points[i]);
        }
        Arrays.sort(dists);
        int distK = dists[K - 1];

        int[][] ans = new int[K][2];
        int t = 0;
        for (int i = 0; i < N; ++i) {
            if (dist(points[i]) <= distK) {
                ans[t++] = points[i];
            }
        }
        return ans;
    }

    public int dist(int[] point) {
        return point[0] * point[0] + point[1] * point[1];
    }

    /**
     * ��ȡһ�㣬����õ㼴Ϊ��ԭ��������Ծ���Ϊ�뾶��Բ���Ƿ��е���԰�ڣ�
     * ����Բ�ڣ���Ϊ���·��
     * ��Բ�ڣ��ݹ��Ըõ�Ϊ�뾶
     */
}
