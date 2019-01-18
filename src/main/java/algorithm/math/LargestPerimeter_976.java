package algorithm.math;

import java.util.Arrays;

/**
 * @author Search
 * @date 2019/1/18
 * �����ε�����ܳ� 976
 */
public class LargestPerimeter_976 {
    /*
    ��������ε���������������֮�ʹ��ڵ�����&&�������߲�С�ڵ�����
     */

    /**
     * @param A
     * @return
     */

    public int largestPerimeter(int[] A) {
        if (A.length < 3 || A == null) {
            return 0;
        }
        Arrays.sort(A);
        int res = 0;
        for (int i = A.length - 1; i > 1; i--) {
            if (A[i] < A[i - 1] + A[i - 2]) {
                res = A[i] + A[i - 1] + A[i - 2];
                break;
            }
        }
        return res;
    }
}
