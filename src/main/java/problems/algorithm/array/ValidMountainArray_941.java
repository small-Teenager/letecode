package problems.algorithm.array;

/**
 * @author Search
 * @data 17:29 2019/1/21
 * ��Ч��ɽ������
 */
public class ValidMountainArray_941 {
    /**
     * ������ߵ����������ұߵ����ݼ�
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
