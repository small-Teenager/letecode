package problems.algorithm.array;

/**
 * @author Search
 * @data 17:29 2019/1/21
 * 有效的山脉数组
 */
public class ValidMountainArray_941 {
    /**
     * 数组左边单调递增，右边单调递减
     *
     * @param A
     * @return
     */
    public static boolean validMountainArray(int[] A) {
        if (A == null || A.length < 3) {
            return false;
        }
        int m = -1;
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i + 1] < A[i]) {
                m = i;
                break;
            }
        }
        if (m < 1) {
            return false;
        }
        for (int i = m; i < A.length - 1; i++) {
            if (A[i + 1] >= A[i]) {
                return false;
            }
        }
        return true;
    }


    public static void main(String args[]) {

        System.out.println(validMountainArray(null));
    }
}
