package problems.algorithm.math;

import java.util.Arrays;

/**
 * 最接近原点的k 个点 973
 *
 * @author Search
 * @date 2019/1/14
 */
public class KClosest_973 {

    /**
     * 按距离对点进行排序，然后取最近的K点
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
     * 任取一点，假设该点即为距原点最近。以距离为半径做圆，是否有点在园内，
     * 不再圆内，即为最短路径
     * 在圆内，递归以该点为半径
     */
}
