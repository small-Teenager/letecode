package problems.algorithm.math;

import java.util.*;

/**
 * @author Search
 * @data 9:41 2019/2/16
 * ��С������� II 963
 */
public class MinAreaFreeRect_963 {

    /**
     * ���ε��ж� ��1����һ������ֱ�ǵ�ƽ���ı����Ǿ��� ��2���Խ�Ǯ��ȵ�ƽ���ı����Ǿ��� ��3������������ֱ�ǵ��ı����Ǿ���
     */
    /**
     * ����ϵ�������������ʽ 1/2��x1y2��x2y3��x3y1��x1y3��x2y1��x3y2��
     */

    /**
     * 1���ж��Ƿ�Ϊ���� ѡȡ��2�� 2��3��ȷ�����
     *  �˷���û�пռ��в�ֹ�ĸ��������
     * @param points
     * @return
     */
    public double minAreaFreeRect(int[][] points) {
        // ������4������
        int[] A = points[0];
        int[] B = points[1];
        int[] C = points[2];
        int[] D = points[3];
        double AC = diagonalLength(A[0], A[1], C[0], C[1]);
        double BD = diagonalLength(B[0], B[1], D[0], D[1]);
        if (String.valueOf(AC).equals(String.valueOf(BD))) {
            return 0;
        }
        double area = A[0] * B[1] + B[0] * C[1] + C[0] * A[1] - A[0] * C[1] - B[0] * A[1] - C[0] * B[1];
        return Math.abs(area);
    }

    /**
     * ����ϵ��������� |AB|=|a|=��[(x2-x1)^2+(y2-y1)^2]
     */
    public double diagonalLength(int a1, int b1, int a2, int b2) {
        return   Math.abs(Math.sqrt((a1 - a2) * (a1 - a2) + (b1 - b2) * (b1 - b2)));
    }

}

/**
 * ʹ�û��ݹ������п��ܵĵ㼯��
 * ���㼯��������������������ɾ��Ρ�
 * �洢��С��������ֵ
 */
class Solution {

    public double minAreaFreeRect(int[][] points) {
        double[] res = new double[1];
        res[0] = Double.MAX_VALUE;

        backtracking(points, new ArrayList<>(), 0, res);
        return res[0] == Double.MAX_VALUE? 0 : res[0];
    }

    private void backtracking(int[][] points, List<int[]> vertex, int index, double[] min) {
        if (vertex.size() >= 4) {
            // judge Rectangle
            double[] area = new double[1];
            if (isSquare(vertex,area)) {
                min[0] = Math.min(min[0], area[0]);
            }
            return;
        } else {
            for(int i = index; i < points.length; i++) {

                vertex.add(points[i]);
                backtracking(points, vertex, i+1, min);
                vertex.remove(vertex.size() - 1);
            }
        }

    }

    public boolean isSquare (List<int[]> vertex, double[] area){
        int p[][]={{vertex.get(0)[0], vertex.get(0)[1]},
                {vertex.get(1)[0], vertex.get(1)[1]},
                {vertex.get(2)[0], vertex.get(2)[1]},
                {vertex.get(3)[0], vertex.get(3)[1]}};
        double cx = (double)(p[0][0] + p[1][0] + p[2][0] + p[3][0]) / 4;
        double cy = (double)(p[0][1] + p[1][1] + p[2][1] + p[3][1]) / 4;
        double dd1,dd2,dd3,dd4;
        dd1 = (cx - p[0][0])*(cx - p[0][0]) + (cy - p[0][1])*(cy - p[0][1]);
        dd2 = (cx - p[1][0])*(cx - p[1][0]) + (cy - p[1][1])*(cy - p[1][1]);
        dd3 = (cx - p[2][0])*(cx - p[2][0]) + (cy - p[2][1])*(cy - p[2][1]);
        dd4 = (cx - p[3][0])*(cx - p[3][0]) + (cy - p[3][1])*(cy - p[3][1]);
        boolean res = (dd1==dd2 && dd1==dd3 && dd1==dd4);

        if (res) {
            int cnt=0;
            double  len[]=new double[6];
            for(int i=0;i<=3;i++){
                for(int j=i+1;j<=3;j++){
                    len[cnt++]=(p[i][0]-p[j][0])*(p[i][0]-p[j][0])+
                            (p[i][1]-p[j][1])*(p[i][1]-p[j][1]);
                }

            }
            Arrays.sort(len);
            area[0] = Math.sqrt(len[0]*len[2]);
            return true;
        } else {
            return false;
        }
    }
}